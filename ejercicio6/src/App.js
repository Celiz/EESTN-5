import ListadoResultados from "./ListadoResultados";
import { useState } from "react";

function App() {

  const [operaciones, setOperacion] = useState([])

  function sumar(event) {
    event.preventDefault();
    const v1 = parseInt(event.target.valor1.value, 10)
    const v2 = parseInt(event.target.valor2.value, 10)
    const suma = v1 + v2
    const nuevo = {
      resultado: suma,
      valor1: v1,
      valor2: v2
    }
    setOperacion([nuevo, ...operaciones])
    event.target.valor1.value = ''
    event.target.valor2.value = ''
  }

  return (
    <div>
      <form onSubmit={sumar}>
        <p>Ingrese primer valor:<input type="text" name="valor1" /></p>
        <p>Ingrese segundo valor:<input type="text" name="valor2" /></p>
        <input type="submit" value="Sumar" />
      </form>
      <ListadoResultados resultados={operaciones} />
    </div>
  );
}

export default App;