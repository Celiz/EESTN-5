let nombreAlumno = prompt("Ingrese Nombre de Alumno");
let nota1 = prompt("Ingrese Nota 1");
let nota2 = prompt("Ingrese Nota 2");
let nota3 = prompt("Ingrese Nota 3");
let prom = (parseFloat(nota1) + parseFloat(nota2) + parseFloat(nota3)) / 3;

if (prom > 7) {
    document.write('El alumno: '  + nombreAlumno +   ' promocionó');
}

else {
    document.write('El alumno' + nombreAlumno + ' no promociono');
}       
