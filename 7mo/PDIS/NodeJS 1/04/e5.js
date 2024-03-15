const fs = require('node:fs')

fs.readFile('./test.txt', (error, datos) => {
  if (error)
    console.log(error)
  else
    console.log(datos.toString())
})

console.log('última línea del programa')