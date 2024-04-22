let vec = document.getElementsByTagName('td')
for (let f = 0; f < vec.length; f++) {
    vec[f].addEventListener('mouseover', entroCasilla)
    vec[f].addEventListener('mouseout', salioCasilla)
}

function entroCasilla(e) {
    e.target.style.backgroundColor = '#ff0'
}

function salioCasilla(e) {
    e.target.style.backgroundColor = '#fff'
}