function mostrarFilaTabla() {
    let puntero1 = document.getElementById('elemento1')
    while (puntero1 != null) {
        alert(puntero1.childNodes[0].nodeValue)
        puntero1 = puntero1.nextElementSibling
    }
}