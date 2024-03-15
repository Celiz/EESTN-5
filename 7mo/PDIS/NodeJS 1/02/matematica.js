const PI = 3.14

function sumar(x1, x2) {
  return x1 + x2
}

function restar(x1, x2) {
  return x1 - x2
}

function dividir(x1, x2) {
  if (x2 == 0) {
    mostrarErrorDivision()
  }
  else {
    return x1 / x2
  }
}

function mostrarErrorDivision() {
  console.log('No se puede dividir por cero')
}

module.exports = {
  sumar,
  restar,
  dividir,
  PI
}