
function decodificarMensaje() {
    const inputMessage = document.getElementById('mensaje').value;
    const decodedMessage = inputMessage.replace(/\(([^)]+)\)/g, (_, word) => word.split('').reverse().join(''));
    alert(decodedMessage);
}







