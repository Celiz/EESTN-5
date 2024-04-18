let estado = 'grande'
document.getElementById('recuadro').addEventListener('dblclick', (e) => {
    if (estado == 'grande') {
        e.target.style.width = '250px'
        e.target.style.height = '250px'
        estado = 'chico'
    } else {
        e.target.style.width = '800px'
        e.target.style.height = '70px'
        estado = 'grande'
    }
})