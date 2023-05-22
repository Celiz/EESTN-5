package pruebaPersona;
import modelo.Persona;

public class PruebaPersona {

	public static void main(String[] args) {
		Persona c = new Persona("Matias", 17, "maticelizramos@gmail.com");

		System.out.println(c);
		
		c.setEdad(20);
		c.setEmail("maticeliz@google.com");
		System.out.println(c);
	}

}
