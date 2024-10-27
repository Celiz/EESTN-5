class Ahorcado {
    constructor() {
        this.word = '';
        this.guessedLetters = new Set();
        this.maxAttempts = 6;
        this.attempts = 0;
        this.wordDisplay = document.getElementById('word-display');
        this.guessesDisplay = document.getElementById('guesses');
        this.messageDisplay = document.getElementById('message');
        this.hangmanImage = document.getElementById('hangman-image');
        this.letterButtonsContainer = document.getElementById('letter-buttons');

        this.createLetterButtons();
    }

    createLetterButtons() {
        const alphabet = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        for (let letter of alphabet) {
            const button = document.createElement('button');
            button.textContent = letter;
            button.addEventListener('click', () => this.makeGuess(letter));
            this.letterButtonsContainer.appendChild(button);
        }
    }

    async initGame() {
        try {
            const englishWord = await this.getWord();
            this.word = englishWord.toUpperCase();
            this.updateWordDisplay();
            this.updateHangmanImage();
        } catch (error) {
            console.error('Error al iniciar el juego:', error);
            this.messageDisplay.textContent = 'Error al iniciar el juego. Por favor, recarga la página.';
        }
    }

    async getWord() {
        const response = await fetch('https://random-word-api.herokuapp.com/word?lang=es');
        if (!response.ok) {
            throw new Error('Error al obtener la palabra en inglés');
        }
        const data = await response.json();
        return data[0];
    }

    WordDisplay() {
        this.wordDisplay.textContent = this.word
            .split('')
            .map(letter => this.guessedLetters.has(letter) ? letter : '_')
            .join(' ');
    }

    updateHangmanImage() {
        this.hangmanImage.src = `/public/hangman-${this.attempts}.png`;
        this.hangmanImage.alt = `Ahorcado - ${this.attempts} intentos`;
    }

    makeGuess(letter) {
        if (this.guessedLetters.has(letter)) {
            this.messageDisplay.textContent = 'Ya has intentado esa letra.';
            return;
        }

        this.guessedLetters.add(letter);
        this.guessesDisplay.textContent = `Letras intentadas: ${Array.from(this.guessedLetters).join(', ')}`;

        // Disable the button for the guessed letter
        const buttonElement = Array.from(this.letterButtonsContainer.children).find(button => button.textContent === letter);
        if (buttonElement) {
            buttonElement.disabled = true;
        }

        if (this.word.includes(letter)) {
            this.updateWordDisplay();
            if (!this.wordDisplay.textContent.includes('_')) {
                this.messageDisplay.textContent = '¡Felicidades! Has ganado.';
                this.disableAllButtons();
            } else {
                this.messageDisplay.textContent = '¡Bien hecho! Letra correcta.';
            }
        } else {
            this.attempts++;
            this.updateHangmanImage();
            if (this.attempts >= this.maxAttempts) {
                this.messageDisplay.textContent = `Has perdido. La palabra era: ${this.word}`;
                this.disableAllButtons();
            } else {
                this.messageDisplay.textContent = 'Letra incorrecta. Intenta de nuevo.';
            }
        }
    }

    disableAllButtons() {
        Array.from(this.letterButtonsContainer.children).forEach(button => {
            button.disabled = true;
        });
    }
}

const game = new Ahorcado();
game.initGame();