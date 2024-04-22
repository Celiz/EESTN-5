package modelo;

public class Vehiculo {
	private String patente;
    private String tipo;

    public Vehiculo(String patente, String tipo) {
        this.patente = patente;
        this.tipo = tipo;
    }

    public double calcularPrecioAlquiler(int dias) {
        double precioBase = 500;
        return precioBase * dias;
    }

	public String getPatente() {
		return patente;
	}

	public String getTipo() {
		return tipo;
	}
    
    

}
