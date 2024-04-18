function ocultarParrafos() {
    let obj = document.getElementById("bloque2")
    let lista = obj.getElementsByTagName('p')
    for (let elemento of lista)
        elemento.style.display = 'none'
}