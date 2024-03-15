const os = require('node:os')

console.log('Sistema operativo:' + os.platform())
console.log('Versión del sistema operativo:' + os.release())
console.log('Memoria total:' + os.totalmem() + ' bytes')
console.log('Memoria libre:' + os.freemem() + ' bytes')
console.log('Arquitectura CPU:' + os.arch)
console.log('Número de procesadores lógicos:' + os.cpus().length)
os.cpus().forEach(cpu => {
  console.log('Nombre: ' + cpu.model)
  console.log('Núcleos: ' + cpu.cores)
})