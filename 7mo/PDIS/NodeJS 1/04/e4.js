const fs = require('node:fs')

fs.writeFile('./archivo1.txt', 'línea 1\nLínea 2', error => {
  if (error)
    console.log(error)
  else
    console.log('El archivo fue creado')
})

console.log('última línea del programa')