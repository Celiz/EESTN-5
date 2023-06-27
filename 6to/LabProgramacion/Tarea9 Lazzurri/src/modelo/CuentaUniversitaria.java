package modelo;

public class CuentaUniversitaria extends CuentaBancaria {
	
	private double limite = 0;

	public CuentaUniversitaria(String titular) {
		super(titular);
	}

	@Override
	public boolean extraer(double monto) {
	    boolean extraccionExitosa = false;
	    final double LIMITE_DIARIO = 1000;

	    if ((limite + monto <= LIMITE_DIARIO) && monto <= saldo) {
	        saldo -= monto;
	        limite += monto;
	        extraccionExitosa = true;
	    }

	    return extraccionExitosa;
	}

	@Override
	public String toString() {
		return "CuentaUniversitaria [limite=" + limite + "]";
	}
}
	
	


