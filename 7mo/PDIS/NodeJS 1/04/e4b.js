const fs = require('node:fs/promises')

fs.writeFile('./test1.txt', 'línea 1\nLínea 2\n creado con promesas.')
  .then(() => {
    console.log('El archivo de texto fue creado empleando promesas')
  })
  .catch(error => {
    console.log(error)
  })

console.log('última línea del programa')