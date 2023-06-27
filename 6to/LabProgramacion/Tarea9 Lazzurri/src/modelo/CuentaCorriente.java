package modelo;

public class CuentaCorriente extends CuentaBancaria {
	private double topeDescubierto;

    public CuentaCorriente(String titular, double topeDescubierto) {
        super(titular);
        this.topeDescubierto = topeDescubierto;
    }

    @Override
    public boolean extraer(double monto) {
    	boolean res = false;
        if (monto <= saldo + topeDescubierto) {
            saldo -= monto;
            res = true;
        }
       return res;
    }
    
    @Override
	public String toString() {
		return "CuentaCorriente [topeDescubierto=" + topeDescubierto + "]";
	}    
}