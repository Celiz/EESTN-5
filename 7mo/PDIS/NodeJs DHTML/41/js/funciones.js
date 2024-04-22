document.getElementById('text1').addEventListener('focus', tomarFoco)
document.getElementById('text2').addEventListener('focus', tomarFoco)

function tomarFoco(e) {
    e.target.style.color = '#f00'
}