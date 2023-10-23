package modelo;

public class DepositoInvalidoException extends Exception {
    
	private static final long serialVersionUID = 2L;
	private double cantidadInvalida;

    public DepositoInvalidoException(double cantidadInvalida) {
        this.cantidadInvalida = cantidadInvalida;
    }

    public double getCantidadInvalida() {
        return cantidadInvalida;
    }
}
