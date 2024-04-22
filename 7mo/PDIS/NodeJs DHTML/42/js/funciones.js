let ob1 = document.getElementById('text1').addEventListener('blur', (e) => {
    if (e.target.value == '')
        alert('cuidado no ingresó datos')
})