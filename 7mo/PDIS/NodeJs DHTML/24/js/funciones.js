function crearText() {
    let cantidad = parseInt(document.getElementById('seleccion').value)
    let cadena = ""
    for (f = 0; f < cantidad; f++)
        cadena += `<input type="text" name="nombre${f}" id="nombre${f}"><br>`
    document.getElementById('seccion').innerHTML = cadena
}