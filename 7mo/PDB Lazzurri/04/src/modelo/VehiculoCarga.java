package modelo;

public class VehiculoCarga extends Vehiculo {
	double pma;

    public VehiculoCarga(String patente, double pma) {
        super(patente, "vehículo de carga");
        this.pma = pma;
    }

    @Override
    public double calcularPrecioAlquiler(int dias) {
        double precioBase = super.calcularPrecioAlquiler(dias);
        double precio = precioBase + (precioBase * 0.20 * pma);
        return precio;
    }

}
