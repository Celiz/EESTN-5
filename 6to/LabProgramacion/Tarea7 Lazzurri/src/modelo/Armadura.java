package modelo;

public class Armadura {
	private String nombre;
    private double porcentajeDefensa;

    public Armadura(String nombre, double porcentajeDefensa) {
        this.nombre = nombre;
        this.porcentajeDefensa = porcentajeDefensa;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNivelDefensa() {
        return porcentajeDefensa;
    }

    public void reducirDefensa(double d) {
        porcentajeDefensa -= d; 
        if (porcentajeDefensa < 0) {
            porcentajeDefensa = 0;
        }
    }

	@Override
	public String toString() {
		return "Armadura [nombre=" + nombre + ", porcentajeDefensa=" + porcentajeDefensa + "]";
	}
}
