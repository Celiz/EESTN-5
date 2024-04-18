function cambiarColor() {
    let lista = document.getElementsByTagName('p')
    for (let f = 0; f < lista.length; f++)
        lista[f].style.color = '#f00'
}