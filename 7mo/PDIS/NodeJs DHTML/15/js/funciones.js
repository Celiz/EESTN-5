function eliminar() {
    let puntero = document.getElementById('parrafos')
    let valor = document.getElementById('posicion').value
    if (valor < puntero.children.length)
        puntero.removeChild(puntero.children[valor])
}