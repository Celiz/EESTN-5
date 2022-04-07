let nota1 = parseInt(prompt("Ingrese Nota 1"));
let nota2 = parseInt(prompt("Ingrese Nota 2"));
let nota3 = parseInt(prompt("Ingrese Nota 3"));
let suma = nota1 + nota2 + nota3;
let prom = suma / 3;

if (prom >= 7) {
    document.write('Promocionó');
}

else {
    document.write('No promociono');
}   