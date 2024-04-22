package modelo;

public class Combi extends Vehiculo {
	private int plazas;

    public Combi(String patente, int plazas) {
        super(patente, "combi");
        this.plazas = plazas;
    }

    @Override
    public double calcularPrecioAlquiler(int dias) {
        double precioBase = super.calcularPrecioAlquiler(dias);
        double precio = precioBase + (precioBase * 0.02 * plazas);
        return precio;
    }

}
