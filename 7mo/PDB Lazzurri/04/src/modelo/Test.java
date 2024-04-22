package modelo;

public class Test {
	public static void main(String[] args) {
		Auto auto = new Auto("ABC123");
        System.out.println("Precio de alquiler de auto: " + auto.calcularPrecioAlquiler(3));

        Combi combi = new Combi("DEF456", 12);
        System.out.println("Precio de alquiler de combi: " + combi.calcularPrecioAlquiler(3));

        VehiculoCarga vehiculoCarga = new VehiculoCarga("GHI789", 1.5);
        System.out.println("Precio de alquiler de vehiculo de carga: " + vehiculoCarga.calcularPrecioAlquiler(3));

        Camion camion = new Camion("JKL012");
        System.out.println("Precio de alquiler de camion: " + camion.calcularPrecioAlquiler(3));

        Trailer trailerComun = new Trailer("común", 100);
        System.out.println("Precio de alquiler de trailer comun: " + trailerComun.costoDiario);

        TrailerRefrigerado trailerRefrigerado = new TrailerRefrigerado("refrigerado", 150, -10);
        System.out.println("Precio de alquiler de trailer refrigerado: " + trailerRefrigerado.costoDiario);
    }

}


