package modelo;

public class CuentaBancaria {
	private String titular;
	private double saldo;
	private int cantidadDepositos;
	private int cantidadExtracciones;
	
	public CuentaBancaria(double saldo) {
		super();
		this.saldo = saldo;
		
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
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

	public String toString() {
		return "CuentaBancaria [titular=" + titular + ", saldo=" + saldo + ", cantidadDepositos=" + cantidadDepositos
				+ ", cantidadExtracciones=" + cantidadExtracciones + "]";
	}
	
	

}
