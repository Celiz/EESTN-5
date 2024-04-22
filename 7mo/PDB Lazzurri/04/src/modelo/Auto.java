package modelo;

public class Auto extends Vehiculo {
	private int plazas;

	public Auto(String patente) {
		super(patente, "auto");
	}
	
	 @Override
	    public double calcularPrecioAlquiler(int dias) {
	        double precioBase = super.calcularPrecioAlquiler(dias);
	        double precio = precioBase + (precioBase * 0.015 * plazas);
	        return precio;
	    }

}
