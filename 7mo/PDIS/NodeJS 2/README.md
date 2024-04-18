# Traductor al Idioma P

Este proyecto es un traductor de español a Idioma P. El Idioma P es como el español, pero con una regla especial: por cada vocal en cualquier palabra, se duplica y se pone una 'p' en medio. Por ejemplo, la palabra 'hola' se traduciría a 'hopolapa' en Idioma P.

## Installation

```bash
npm i 
```

## Uso

La función principal del traductor es traducirAlIdiomaP(frase), donde frase es la frase en español que se quiere traducir. Esta función devuelve la frase traducida.

## Funcionalidad

```javascript
let frase = 'hola mundo';
let fraseTraducida = traducirAlIdiomaP(frase);
console.log(fraseTraducida);  // Imprime: 'hopolapa mupundopo'
```

## Entrada
Una línea con la frase a traducir.

## Salida
La oración traducida a Idioma P.
