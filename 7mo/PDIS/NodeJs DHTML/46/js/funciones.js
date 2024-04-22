window.addEventListener('scroll', () => {
    let mensaje = document.getElementById("mensaje")
    mensaje.style.top = window.scrollY + "px"
    mensaje.style.left = window.scrollX + "px"
})