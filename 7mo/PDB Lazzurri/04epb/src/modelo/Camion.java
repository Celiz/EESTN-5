package modelo;

public class Camion extends Vehiculo {
    public Camion(String patente) {
        super(patente, "camión");
    }

    @Override
    public double calcularPrecioAlquiler(int dias) {
        double precioBase = super.calcularPrecioAlquiler(dias);
        double precio = precioBase + (precioBase * 0.40);
        return precio;
    }
}