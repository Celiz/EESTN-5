function recuperarAtributo() {
    let puntero1 = document.getElementById('enlace1')
    let puntero2 = document.getElementById('enlace2')
    puntero2.setAttribute('href', puntero1.getAttribute('href'))
}