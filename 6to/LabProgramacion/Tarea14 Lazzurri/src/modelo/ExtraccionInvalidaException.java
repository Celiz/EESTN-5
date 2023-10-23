package modelo;

public class ExtraccionInvalidaException extends Exception {
	private static final long serialVersionUID = 1L;
	private double cantidadInvalida;

    public ExtraccionInvalidaException(double cantidadInvalida) {
        this.cantidadInvalida = cantidadInvalida;
    }

    public double getCantidadInvalida() {
        return cantidadInvalida;
    }

	public void setCantidadInvalida(double cantidadInvalida) {
		this.cantidadInvalida = cantidadInvalida;
	}
}

