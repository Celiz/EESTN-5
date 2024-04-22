function generarLista() {
    const dias = ['lunes', 'martes', 'miércoles', 'jueves', 'viernes', 'sábado', 'domingo']
    let cadena = ""
    for (let dia of dias)
        cadena += `<li>${dia}</li>`
    document.getElementById("lista1").innerHTML = cadena
}