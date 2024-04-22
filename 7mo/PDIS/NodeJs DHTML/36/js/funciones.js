document.getElementById('b1').addEventListener('click', presionBoton)
document.getElementById('b2').addEventListener('click', presionBoton)

function presionBoton(e) {
    e.target.style.background = '#ff0000'
}