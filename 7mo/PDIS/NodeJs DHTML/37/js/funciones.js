let vec = document.getElementsByTagName('td')
for (let f = 0; f < vec.length; f++) {
    vec[f].addEventListener('mousedown', presionar)
    vec[f].addEventListener('mouseup', soltar)
}

function presionar(e) {
    e.target.style.backgroundColor = '#ffff00'
}

function soltar(e) {
    e.target.style.backgroundColor = '#ffffff'
}