function cantidadHijos() {
    let objeto1 = document.getElementById('bloque1')
    alert('La cantidad de hijos del primer div es:' + objeto1.childNodes.length)
    let objeto2 = document.getElementById('bloque2')
    alert('La cantidad de hijos del segundo div es:' + objeto2.childNodes.length)
}

function cantidadHijosElemento() {
    let objeto1 = document.getElementById('bloque1')
    alert('La cantidad de hijos del primer div es:' + objeto1.children.length)
    let objeto2 = document.getElementById('bloque2')
    alert('La cantidad de hijos del segundo div es:' + objeto2.children.length)
}