function generarSecuencia(semilla) {
    let secuencia = [semilla];
    let siguiente = semilla;
    while (true) {
        if (siguiente % 2 === 0) {
            siguiente = siguiente / 2;
        } else {
            siguiente = siguiente * 3 + 1;
        }
        if (siguiente === 1) {
            secuencia.push(1);
            break;
        }
        secuencia.push(siguiente);
    }
    return secuencia;
}

function calcularSecuencia() {
    const semillaInput = document.getElementById('semilla');
    const semilla = parseInt(semillaInput.value);

    if (isNaN(semilla) || semilla < 1 || semilla >= 10000) {
        alert('Por favor, ingrese una semilla valida (entre 1 y 9999).');
        return;
    }

    const secuencia = generarSecuencia(semilla);
    const longitud = secuencia.length;
    const maximo = Math.max(...secuencia);

    alert(`La longitud de la secuencia es: ${longitud}\nEl numero mas grande en la secuencia es: ${maximo}`);
}