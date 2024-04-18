function parrafoAnterior() {
    let puntero1 = document.getElementById('parrafos')
    let puntero2 = puntero1.lastElementChild
    while (puntero2 != null) {
        alert(puntero2.childNodes[0].nodeValue)
        puntero2 = puntero2.previousElementSibling
    }
}