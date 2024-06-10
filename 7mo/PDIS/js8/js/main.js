class CAnimales {
    constructor() {
        this.animals = [];
    }

    addAnimal(idAnimal, name, cageNumber, idTypeAnimal, weight) {
        this.animals.push({
            idAnimal,
            name,
            cageNumber,
            idTypeAnimal,
            weight
        });
    }

    generateAnimalTable() {
        const tableBody = document.querySelector('#animalTable tbody');
        tableBody.innerHTML = '';

        for (const animals of this.animals) {
            const fila = document.createElement('tr');
            fila.innerHTML = `
            <td>${animals.idAnimal}</td>
            <td>${animals.name}</td>
            <td>${animals.cageNumber}</td>
            <td>${animals.idTypeAnimal}</td>
            <td>${animals.weight}</td>
          `;
            tableBody.appendChild(fila);
        }
    }

    getAnimalsCage5() {
        const animalsCage5 = this.animals.filter(animal => animal.cageNumber === 5 && animal.weight < 3);

        return animalsCage5.map(animal => animal.name);
    }

    getAnimalsTypeFelinos() {
        const animalsTypeFelinos = this.animals.filter(animal => animal.idTypeAnimal === 1 && animal.cageNumber >= 2 && animal.cageNumber <= 5);

        return animalsTypeFelinos.map(animal => animal.name);
    }

    getAnimalCage4() {
        const animalCage4 = this.animals.filter(animal => animal.cageNumber === 4 && animal.weight < 120);

        return animalCage4.map(animal => animal.name);
    }

}
const animals = new CAnimales();

// generate the id with math.random 
const generateId = () => Math.floor(Math.random() * 1000);

// add animals (id, name, cageNumber, idTypeAnimal, weight)
animals.addAnimal(generateId(), 'Tigre', 5, 1, 150);
animals.addAnimal(generateId(), 'Leon', 2, 1, 180);
animals.addAnimal(generateId(), 'Aguila', 3, 2, 2);
animals.addAnimal(generateId(), 'Serpiente', 4, 3, 80); 
animals.addAnimal(generateId(), 'Pantera', 5, 1, 100);
animals.addAnimal(generateId(), 'Vibora', 5, 3, 2); 


animals.generateAnimalTable();

function removeBracketsAndQuotes(str) {
    return str.replace(/[\[\]"]/g, '');
}

document.getElementById("resultado1").textContent = "Animales en la jaula 5 con un peso menor a 3kg: " + removeBracketsAndQuotes(JSON.stringify(animals.getAnimalsCage5()));
document.getElementById("resultado2").textContent = "Animales de tipo felinos en jaulas 2 a 5: " + removeBracketsAndQuotes(JSON.stringify(animals.getAnimalsTypeFelinos()));
document.getElementById("resultado3").textContent = "Animal en jaula 4 con un peso menor a 120kg: " + removeBracketsAndQuotes(JSON.stringify(animals.getAnimalCage4()));