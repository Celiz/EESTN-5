package modelo;

public class Prueba {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Matias", 18);
		
		p1.mostrarInformacion();
		
		Empleado e1 = new Empleado("Tomas", 18, 5000);
		e1.mostrarInformacion();
		e1.mostrarSueldo();

	}

}
