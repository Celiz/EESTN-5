document.getElementById('enlace').addEventListener('click', (e) => {
    e.preventDefault()
    let url = e.target.getAttribute('href')
    let pal = document.getElementById('palabra').value
    window.open(url + '/search?q=' + pal)
})