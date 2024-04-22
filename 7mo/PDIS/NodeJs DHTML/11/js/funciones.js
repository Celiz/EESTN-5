function mostrarSoluciones() {
    let nt
    let obj
    nt = document.createTextNode('Respuesta 1')
    obj = document.getElementById('opcion1')
    obj.appendChild(nt)
    nt = document.createTextNode('Respuesta 2')
    obj = document.getElementById('opcion2')
    obj.appendChild(nt)
    nt = document.createTextNode('Respuesta 3')
    obj = document.getElementById('opcion3')
    obj.appendChild(nt)
}