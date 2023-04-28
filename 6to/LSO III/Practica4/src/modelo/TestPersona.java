package modelo;


public class TestPersona {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		p.setApellido(args[0]);
		p.setNombre(args[1]);
		p.setEdad(Integer.parseInt(args[2]));
		p.setOcupacion(args[3]);

		System.out.println(p.misDatos());	
	}
}
