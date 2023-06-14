package modelo;

public class Jefe extends Empleado{
	private String nombre;
	private String domicilio;
	private String legajo;
	private String departamentoAcargo;
	private int cantEmpleados;
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
	public String getDepartamentoAcargo() {
		return departamentoAcargo;
	}
	public void setDepartamentoAcargo(String departamentoAcargo) {
		this.departamentoAcargo = departamentoAcargo;
	}
	public int getCantEmpleados() {
		return cantEmpleados;
	}
	public void setCantEmpleados(int cantEmpleados) {
		this.cantEmpleados = cantEmpleados;
	}
	@Override
	public String detalle() {
		return "Jefe " + super.detalle() + "departamentoAcargo="
				+ departamentoAcargo + ", cantEmpleados=" + cantEmpleados + "]";
	}
	
	

}
