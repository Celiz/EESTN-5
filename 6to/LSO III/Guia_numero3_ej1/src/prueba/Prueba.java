package prueba;
import modelo.Persona;

public class Prueba {

	public static void main(String[] args) {
		Persona p = new Persona("Matias", 17, "maticelizramos@gmail.com");
		
		System.out.println(p + "Sos mayor: " + p.sosMayor() + " Cantiadad de veces que se repite la letra A: "+ p.repeticionDeLetra('a'));
		
	}

}
