package punto2;

public class Enfermero extends Empleado {
    private static double sueldoBasico = 30000;
    private int antiguedad;


    public Enfermero(String nombre, String documento, Domicilio domicilioEnfermero, int antiguedad) {
    	super(nombre, documento, domicilioEnfermero);
        this.antiguedad = antiguedad;
	}

	public static double getSueldoBasico() {
		return sueldoBasico;
	}
	
	public int getAntiguedad() {
		return antiguedad;
	}

	public static void actualizarSueldoBasico(double nuevoSueldoBasico) {
        sueldoBasico = nuevoSueldoBasico;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBasico + (sueldoBasico * 0.05 * antiguedad);
    }

	@Override
	public String toString() {
		return super.toString()  + "Enfermero [antiguedad=" + antiguedad + " sueldo: " + sueldoBasico + "]";
	}
    
}
