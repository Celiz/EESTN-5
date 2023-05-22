package modelo;

public class CuentaBancaria {
	public String Titular;
	public double saldo;
	public int cantidadDepositos;
	public int cantidadExtracciones;
	
	public CuentaBancaria(String titular, double saldo) {
		super();
		Titular = titular;
		this.saldo = saldo;
	}

	public String getTitular() {
		return Titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getCantidadDepositos() {
		return cantidadDepositos;
	}

	public int getCantidadExtracciones() {
		return cantidadExtracciones;
	}

	public void depositar(double cantidad) {
		this.saldo += cantidad;
		this.cantidadDepositos++;
	}
	
	public boolean extraer(double cantidad) {
		boolean aux = false;
		if(cantidad <= this.saldo) {
			this.saldo-=cantidad;
			this.cantidadExtracciones++;
			aux = true;
			}
		
		return aux;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [Titular=" + Titular + ", saldo=" + saldo + ", cantidadDepositos=" + cantidadDepositos
				+ ", cantidadExtracciones=" + cantidadExtracciones + "]";
	}

	
	
}
