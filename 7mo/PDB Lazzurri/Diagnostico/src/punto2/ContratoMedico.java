package punto2;

public class ContratoMedico {
    private String nombre;
    private double sueldoMensual;

    public ContratoMedico(String nombre, double sueldoMensual) {
        this.nombre = nombre;
        this.sueldoMensual = sueldoMensual;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

	@Override
	public String toString() {
		return "ContratoMedico [nombre=" + nombre + ", sueldoMensual=" + sueldoMensual + "]";
	}
    
    
}