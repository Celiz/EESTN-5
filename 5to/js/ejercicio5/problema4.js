let precio = prompt("Introduce el precio del producto");
let cantidad = prompt("Introduce la cantidad de productos");

let importe = parseInt(precio) * parseInt(cantidad);

document.write('Debe abonar: ' + importe + '$');

