function presionado(e) {
    let obj = document.getElementById('ayuda')
    obj.style.display = 'block'
    obj.style.left = e.clientX + 10 + 'px'
    obj.style.top = e.clientY + 10 + 'px'
}