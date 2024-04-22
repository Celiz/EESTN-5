document.getElementById('b1').addEventListener('click', presionBoton, true)
document.getElementById('b2').addEventListener('click', presionBoton, true)
document.getElementById('b3').addEventListener('click', presionBoton, true)
document.addEventListener('click', presionBotonDocumento)

function presionBoton(e) {
    let ref = e.target
    alert(ref.value)
}

function presionBotonDocumento(e) {
    let ref = document.getElementsByTagName('body')
    ref[0].style.backgroundColor = '#f00'
}