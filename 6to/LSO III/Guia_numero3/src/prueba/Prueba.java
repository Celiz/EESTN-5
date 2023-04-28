package prueba;
import modelo.Guerrero;

public class Prueba {

	public static void main(String[] args) {
		Guerrero g1 = new Guerrero();
		g1.setNombre("Aragon");
		g1.setVitalidad(1000);
		g1.setArmadura(1000);
		g1.setX(34);
		g1.setY(25);
		
		System.out.println(g1);
		g1.recibirDmg(800);
		System.out.println(g1);
		
		g1.recibirDmg(300);
		System.out.println(g1);
		
		
		
		
		

	}

}
