document.addEventListener('click', (e) => {
    document.getElementById('recuadro').style.left = e.clientX + 'px'
    document.getElementById('recuadro').style.top = e.clientY + 'px'
})