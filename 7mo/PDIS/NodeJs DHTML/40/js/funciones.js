document.getElementById('titulo').addEventListener('mousemove', (e) => {
    document.getElementById('coordenadax').innerText = 'Coordenada x=' + e.clientX
    document.getElementById('coordenaday').innerText = 'Coordenada y=' + e.clientY
})