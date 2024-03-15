const http = require('node:http')

const servidor = http.createServer((pedido, respuesta) => {
  const url = new URL('http://localhost:8888'+pedido.url)
  console.log('href: '+url.href)
  console.log('origin: '+url.origin)
  console.log('protocol: '+url.protocol)
  console.log('host: '+url.host)
  console.log('hostname: '+url.hostname)
  console.log('port: '+url.port)
  console.log('pathname: '+url.pathname)
  console.log('search: '+url.search)
  url.searchParams.forEach((valor,parametro) => {
    console.log('Nombre del parámetro:'+parametro+'- Valor del parámetro:'+valor)
  })
  respuesta.writeHead(200, { 'Content-Type': 'text/html' })
  respuesta.write('<!doctype html><html><head></head><body>Hola mundo</body></html>')
  respuesta.end()
});

servidor.listen(8888)

console.log('Servidor web iniciado')