function filtranum(numeros, resultado) {
    let contador = 0;
  
    for (let i = 0; i < numeros.length; i++) {
      const numero = numeros[i].toString();
      const primerDigito = numero.charAt(0);
      const ultimoDigito = numero.charAt(numero.length - 1);
  
      if (primerDigito === ultimoDigito) {
        resultado.push(Number(numero));
        contador++;
      }
    }
  
    return contador;
  }
  

  function leerArchivo(ruta) {
    const fs = require('fs');
    const datos = fs.readFileSync(ruta, 'utf8');
    const lineas = datos.trim().split('\n');
    const N = parseInt(lineas[0]);
    const numeros = lineas[1].split(' ').map(Number);
    return { N, numeros };
  }
  
  function escribirArchivo(ruta, resultado, contador) {
    const fs = require('fs');
    const contenido = `${contador}\n${resultado.join(' ')}`;
    fs.writeFileSync(ruta, contenido);
  }
  

  const { N, numeros } = leerArchivo('in.txt');
  const resultado = [];
  const contador = filtranum(numeros, resultado);
  escribirArchivo('out.txt', resultado, contador);
  console.log('Listo!');