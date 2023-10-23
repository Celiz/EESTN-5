package modelo2;

public class NombreInvalidoException extends Exception {
   
	private static final long serialVersionUID = 1L;

	public NombreInvalidoException(String mensaje) {
        super(mensaje);
    }
}
