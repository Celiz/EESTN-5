package modelo;

public class TrailerRefrigerado extends Trailer {
    int temperaturaMinima;

    public TrailerRefrigerado(String tipo, double costoDiario, int temperaturaMinima) {
        super(tipo, costoDiario);
        this.temperaturaMinima = temperaturaMinima;
    }
}