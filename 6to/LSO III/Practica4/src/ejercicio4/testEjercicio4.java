package ejercicio4;

public class testEjercicio4 {

	public static void main(String[] args) {
		
		Asignatura m1 = new Asignatura();
		m1.setId(1);
		Asignatura m2 = new Asignatura();
		m2.setId(2);
		Asignatura m3 = new Asignatura();
		m3.setId(3);
		
		Alumno a1 = new Alumno();
		a1.setApellido("Perez");
		a1.setNombre("Juan");
		a1.setM1(m1);
		a1.setM2(m2);
		a1.setM3(m3);
		
		Alumno a2 = new Alumno();
		a2.setApellido("Gomez");
		a2.setNombre("Pedro");
		a2.setM1(m1);
		a2.setM2(m2);
		a2.setM3(m3);
		
		Profesor p1 = new Profesor();
		p1.setApellido("Gonzalez");
		p1.setNombre("Jose");
		p1.setAsignatura(m1);
		p1.ponerNotas();
		p1.setAsignatura(m2);
		p1.ponerNotas();
		p1.setAsignatura(m3);
		p1.ponerNotas();
		
		System.out.println("El promedio de " + a1.getNombre() + " " + a1.getApellido() + " es: " + p1.calcularPromedio());
		System.out.println("El promedio de " + a2.getNombre() + " " + a2.getApellido() + " es: " + p1.calcularPromedio());
	}
		
		

}
