const http = require('http')
const fs = require('fs')

const mime = {
  'html': 'text/html',
  'css': 'text/css',
  'jpg': 'image/jpg',
  'ico': 'image/x-icon',
  'mp3': 'audio/mpeg3',
  'mp4': 'video/mp4'
}

const servidor = http.createServer((pedido, respuesta) => {
  const url = new URL('http://localhost:8088' + pedido.url)
  let camino = 'public' + url.pathname
  if (camino == 'public/')
    camino = 'public/index.html'
  encaminar(pedido, respuesta, camino)
})
servidor.listen(8888)


function encaminar(pedido, respuesta, camino) {
  switch (camino) {
    case 'public/cargar': {
      grabarComentarios(pedido, respuesta)
      break
    }
    case 'public/leercomentarios': {
      leerComentarios(respuesta)
      break
    }
    default: {
      fs.stat(camino, error => {
        if (!error) {
          fs.readFile(camino, (error, contenido) => {
            if (error) {
              respuesta.writeHead(500, { 'Content-Type': 'text/plain' })
              respuesta.write('Error interno')
              respuesta.end()
            } else {
              const vec = camino.split('.')
              const extension = vec[vec.length - 1]
              const mimearchivo = mime[extension]
              respuesta.writeHead(200, { 'Content-Type': mimearchivo })
              respuesta.write(contenido)
              respuesta.end()
            }
          })
        } else {
          respuesta.writeHead(404, { 'Content-Type': 'text/html' })
          respuesta.write('<!doctype html><html><head></head><body>Recurso inexistente</body></html>')
          respuesta.end()
        }
      })
    }
  }
}


function grabarComentarios(pedido, respuesta) {
  let info = ''
  pedido.on('data', datosparciales => {
    info += datosparciales
  });
  pedido.on('end', function () {
    const formulario = new URLSearchParams(info)
    respuesta.writeHead(200, { 'Content-Type': 'text/html' })
    const pagina = `<!doctype html><html><head></head><body>
                Nombre:${formulario.get('nombre')}<br>
                Comentarios:${formulario.get('comentarios')}<br>
                <a href="index.html">Retornar</a>
                </body></html>`
    respuesta.end(pagina)
    grabarEnArchivo(formulario)
  })
}

function grabarEnArchivo(formulario) {
  const datos = `nombre:${formulario.get('nombre')}<br>
               comentarios:${formulario.get('comentarios')}<hr>`
  fs.appendFile('public/visitas.txt', datos, error => {
    if (error)
      console.log(error)
  })
}

function leerComentarios(respuesta) {
  fs.readFile('public/visitas.txt', (error, datos) => {
    respuesta.writeHead(200, { 'Content-Type': 'text/html' })
    respuesta.write('<!doctype html><html><head></head><body>')
    respuesta.write(datos)
    respuesta.write('</body></html>')
    respuesta.end()
  })
}

console.log('Servidor web iniciado')