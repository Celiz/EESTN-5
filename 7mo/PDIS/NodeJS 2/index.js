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

const servidor = http.createServer((pedido, respuesta) => {
  const url = new URL('http://localhost:8888' + pedido.url)
  let camino = 'public' + url.pathname
  if (camino == 'public/')
    camino = 'public/index.html'
  encaminar(pedido, respuesta, camino)
})

servidor.listen(8888)


function encaminar(pedido, respuesta, camino) {
  console.log(camino)
  switch (camino) {
    case 'public/traduccion': {
      recuperar(pedido, respuesta)
      break
    }
    default: {
      fs.stat(camino)
        .then(() => {
          fs.readFile(camino)
            .then(contenido => {
              const vec = camino.split('.')
              const extension = vec[vec.length - 1]
              const mimearchivo = mime[extension]
              respuesta.writeHead(200, { 'Content-Type': mimearchivo })
              respuesta.write(contenido)
              respuesta.end()
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
  }
}


function recuperar(pedido, respuesta) {
  let info = ''
  pedido.on('data', datosparciales => {
    info += datosparciales
  })
  pedido.on('end', () => {
    const formulario = new URLSearchParams(info)
    console.log(formulario)
    respuesta.writeHead(200, { 'Content-Type': 'text/html' })

    const frase = formulario.get('frase');

    console.log(frase)
    
    const pagina = `<!doctype html><html><head></head><body>
        <p>${traducirAlIdiomaP(frase)}</p>
      <br>
      <a href="index.html">Retornar</a>
      </body></html>`
    respuesta.end(pagina)
  })
}

function traducirAlIdiomaP(frase) {
        
    let fraseTraducida = "";
    for (const palabra of frase.split(' ')) {
        for (const letra of palabra) {
            if ('aeiou'.includes(letra)) {
                fraseTraducida += letra + 'p' + letra;
            } else {
                fraseTraducida += letra;
            }
        }
        fraseTraducida += ' ';
    }
    return fraseTraducida.trim();
}

console.log('Servidor web iniciado')