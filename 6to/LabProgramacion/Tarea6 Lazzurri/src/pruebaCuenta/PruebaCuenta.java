package pruebaCuenta;
import modelo.CuentaBancaria;

public class PruebaCuenta {

	public static void main(String[] args) {
		CuentaBancaria c = new CuentaBancaria("Matias Celiz", 20000);
		System.out.println(c.saldo);
		
		c.depositar(100000);
		System.out.println("Cantidad depositos: " + c.getCantidadDepositos());
		System.out.println(c.saldo);
		c.extraer(20000);
		System.out.println("Cantidad extracciones: " + c.getCantidadExtracciones());
		System.out.println(c.saldo);
		

	}

}
