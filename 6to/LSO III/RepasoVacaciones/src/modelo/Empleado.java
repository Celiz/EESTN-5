package modelo;

public class Empleado extends Persona {
	
	private double sueldo;

	public Empleado(String nombre, int edad, double sueldo) {
		super(nombre, edad);
		this.setSueldo(sueldo);
	}

	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public void mostrarSueldo() {
        System.out.println("Sueldo: $" + sueldo);
    }
	
	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + "]";
	}
	
}
