document.getElementById('formulario').addEventListener('submit', (e) => {
    let cla1 = document.getElementById('clave1')
    let cla2 = document.getElementById('clave2')
    if (cla1.value != cla2.value) {
        alert('debe ingresar las dos claves iguales')
        e.preventDefault()
        return false
    } else
        return true
})