const fs = require('node:fs/promises')

async function leerDirectorio() {
  const archivos = await fs.readdir("./")
  for (let archivo of archivos) {
    console.log(archivo)
  }
}

leerDirectorio()