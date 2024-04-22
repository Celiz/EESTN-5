function mover(e) {
    let corx = document.getElementById('coordenadax')
    let cory = document.getElementById('coordenaday')
    corx.innerText = 'Coordenada X=' + e.clientX
    cory.innerText = 'Coordenada Y=' + e.clientY
}