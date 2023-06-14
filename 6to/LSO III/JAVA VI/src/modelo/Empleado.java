package modelo;

public class Empleado {
	private String nombre;
	private String domicilio;
	private String legajo;
	private String cargo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String detalle() {
		return "Empleado [nombre=" + nombre + ", domicilio=" + domicilio + ", legajo=" + legajo + ", cargo=" + cargo
				+ "]";
	}
	
	
	
	
}
