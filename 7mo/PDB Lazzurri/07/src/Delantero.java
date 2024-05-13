
public class Delantero extends Jugador {
	public Delantero(String nombre, double velocidad, double potencia) {
        super(nombre, velocidad, potencia);
    }
	
    @Override
    public double indiceDefensa() {
        return 0.5 * getVelocidad();
    }

    @Override
    public double indiceAtaque() {
        return getVelocidad() * getPotencia();
    }

}
