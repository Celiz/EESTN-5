package prueba;
import modelo.CuentaBancaria;

public class Prueba {

	public static void main(String[] args) {
		
		CuentaBancaria c = new CuentaBancaria(25000);
		c.setTitular("Matias Celiz");
		
		c.depositar(500);
		System.out.println(c);
		
		c.extraer(10000);
		System.out.println(c);
		
	

	}

}
