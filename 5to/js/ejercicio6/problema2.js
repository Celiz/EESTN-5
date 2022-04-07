let pass1 = prompt('Introduce la contraseña');
let pass2 = prompt('repita la contraseña');

if (pass1 === pass2) {
    document.write('Las contraseñas son iguales');
}
else{
    document.write('Las contraseñas son diferentes');
}