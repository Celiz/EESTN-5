package modelo;

public abstract class CuentaBancaria {
	protected String titular;
	protected double saldo;
	

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

  
    public abstract boolean extraer(double monto);

	@Override
	public String toString() {
		return "CuentaBancaria [titular=" + titular + ", saldo=" + saldo + "]";
	}
}

	
