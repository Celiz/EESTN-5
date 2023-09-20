package unidad1;

public class Persona {
	private String apellido;
	private String nombre;
	private int edad;
	private int dni;
	
	public Persona(String apellido, String nombre, int edad, int dni) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	
	public String misDatos() {
		return "Apellido: " + apellido + "\nNombres: " + nombre + "\nEdad: " + edad + "\nDNI: " + dni;
	}
	
	
	

}
