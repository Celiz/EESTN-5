package ejercicio4;

public class Profesor {
	private String apellido;
	private String nombre;
	private Asignatura asignatura;
	
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
	public Asignatura getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
	
	public void ponerNotas() {
		asignatura.setCalificacion(Math.random());
	}
	
	public double calcularPromedio(){
		return (asignatura.getCalificacion() + asignatura.getCalificacion() + asignatura.getCalificacion())/3;
	}
	
}
