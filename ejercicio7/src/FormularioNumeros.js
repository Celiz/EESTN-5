function FormularioNumeros(props) {
    return (
        <form onSubmit={props.onSumar}>
          <p>Ingrese primer valor:<input type="text" name="valor1" /></p>
          <p>Ingrese segundo valor:<input type="text" name="valor2" /></p>
          <input type="submit" value="Sumar" />
        </form>
        );
}

export default FormularioNumeros;