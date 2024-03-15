const http = require('node:http')
const fs = require('node:fs/promises')

const mime = {
  'html': 'text/html',
  'css': 'text/css',
  'jpg': 'image/jpg',
  'ico': 'image/x-icon',
  'mp3': 'audio/mpeg3',
  'mp4': 'video/mp4'
}

const cache = {}

const servidor = http.createServer((pedido, respuesta) => {
  const url = new URL('http://localhost:8888' + pedido.url)
  let camino = 'static' + url.pathname
  if (camino == 'static/')
    camino = 'static/index.html'
  if (cache[camino]) {
    const vec = camino.split('.')
    const extension = vec[vec.length - 1]
    const mimearchivo = mime[extension]
    respuesta.writeHead(200, { 'Content-Type': mimearchivo })
    respuesta.write(cache[camino])
    respuesta.end()
    console.log('Recurso recuperado del cache:' + camino)
  } else {
    fs.stat(camino)
      .then(() => {
        fs.readFile(camino)
          .then(contenido => {
            cache[camino] = contenido
            const vec = camino.split('.')
            const extension = vec[vec.length - 1]
            const mimearchivo = mime[extension]
            respuesta.writeHead(200, { 'Content-Type': mimearchivo })
            respuesta.write(contenido)
            respuesta.end()
            console.log('Recurso leido del disco:' + camino)
          })
          .catch(error => {
            respuesta.writeHead(500, { 'Content-Type': 'text/plain' })
            respuesta.write('Error interno')
            respuesta.end()
          })
      })
      .catch(error => {
        respuesta.writeHead(404, { 'Content-Type': 'text/html' })
        respuesta.end('<h1>Error 404: No existe el recurso solicitado</h1>')
      })
  }
})

servidor.listen(8888)

console.log('Servidor web iniciado')