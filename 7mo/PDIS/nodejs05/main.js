// Function to get the signals
function getSignals(maxSignals) {
    const signals = [];
    let signal = 0;
    let count = 0;
    
    while (count < maxSignals) {
        // Generate a random signal between 0 and 360
        signal = Math.floor(Math.random() * 361);
        
        if (signal >= 0) {
            signals.push(signal);
            count++;
        }
    }
    
    return signals;
}

// Function to normalize signals and find the corresponding quadrant
function getQuadrantSequence(signals) {
    const quadrants = {
        0: 'N',
        1: 'E',
        2: 'S',
        3: 'O'
    };
    
    const sequence = [];
    
    for (const signal of signals) {
        const quadrant = Math.floor(signal / 90) % 4;
        sequence.push(quadrants[quadrant]);
    }
    
    return sequence.join("");
}

// Function to find the number of complete cycles
function getCompleteCycles(sequence) {
    const cycles = sequence.match(/(NESO|OSEN|ESON|SENO|SONE|ENOS|ONES|NOSE)/g);

    if (cycles) {
        return cycles.length;
    } else {
        return 0;
    }
}

function calculatePercentage(signals) {
    const quadrants = { N: 0, E: 0, S: 0, O: 0 };

    signals.forEach(signal => {
        if (signal >= 0 && signal <= 90) {
            quadrants.N++;
        } else if (signal > 90 && signal <= 180) {
            quadrants.E++;
        } else if (signal > 180 && signal <= 270) {
            quadrants.S++;
        } else if (signal > 270 && signal <= 360) {
            quadrants.O++;
        }
    });

    for (let quadrant in quadrants) {
        quadrants[quadrant] = ((quadrants[quadrant] / signals.length) * 100).toFixed(2);    
    }

    return quadrants;
}

function main() {
    const signals = getSignals(14);
    const sequence = getQuadrantSequence(signals);
    const completeCycles = getCompleteCycles(sequence);
    const quadrantPercentages = calculatePercentage(signals);

    console.log('Signals:', signals);
    console.log('Signal sequence:', sequence);
    console.log('Complete cycles:', completeCycles);
    console.log('Quadrant percentages:', quadrantPercentages);

    document.addEventListener('DOMContentLoaded', (event) => {
        document.getElementById('signals').innerText = signals;
        document.getElementById('secuencia').innerText = sequence;
        document.getElementById('ciclos').innerText = completeCycles;
        document.getElementById('porcentaje').innerText = JSON.stringify(quadrantPercentages);
    });

    
}
// Call the main function
main();
