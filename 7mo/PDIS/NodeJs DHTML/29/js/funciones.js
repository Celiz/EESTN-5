let estado = 'grande'

function redimensionar(objeto) {
    if (estado == 'grande') {
        objeto.style.width = '250px'
        objeto.style.height = '250px'
        estado = 'chico'
    } else {
        objeto.style.width = '800px'
        objeto.style.height = '70px'
        estado = 'grande'
    }
}