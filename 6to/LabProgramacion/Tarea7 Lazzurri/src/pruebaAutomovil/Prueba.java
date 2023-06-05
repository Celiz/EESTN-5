package pruebaAutomovil;
import modelo.Automovil;
import modelo.Motor;

public class Prueba {

	public static void main(String[] args) {
		Motor m1 = new Motor("BMW", 12345621, 2005);
		Automovil a1 = new Automovil("BMW",2023, m1, "AA 2304 AA", 1500000);
		
		System.out.println(a1);
		
		
	

	}

}
