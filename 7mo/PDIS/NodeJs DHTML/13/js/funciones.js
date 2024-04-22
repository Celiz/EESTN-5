function mostrarSoluciones() {
    let nt
    let obj
    let elemento
    obj = document.getElementById('lista')
    if (obj.children.length != 0)
        return

    elemento = document.createElement('li')
    nt = document.createTextNode('Respuesta 1')
    elemento.appendChild(nt)

    obj.appendChild(elemento)

    elemento = document.createElement('li')
    nt = document.createTextNode('Respuesta 2')
    elemento.appendChild(nt)

    obj.appendChild(elemento)
}