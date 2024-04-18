function aumentarBorde() {
    let reftabla = document.getElementById('tabla1')
    if (reftabla.hasAttribute('border')) {
        let valor = parseInt(reftabla.getAttribute('border'))
        valor++
        reftabla.setAttribute('border', valor)
    } else
        reftabla.setAttribute('border', '1')
}