package modelo2;

public class ContrasenaInvalidaException extends Exception {
	private static final long serialVersionUID = 2L;

	public ContrasenaInvalidaException(String mensaje) {
        super(mensaje);
    }
}
