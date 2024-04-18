function agregarPunto() {
    let lista = document.getElementById("lista1")
    let obj = lista.firstElementChild
    while (obj != null) {
        obj.innerText = obj.innerText + "."
        obj = obj.nextElementSibling
    }
}