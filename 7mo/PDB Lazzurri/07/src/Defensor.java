
public class Defensor extends Jugador {
	public Defensor(String nombre, double velocidad, double potencia) {
        super(nombre, velocidad, potencia);
    }

    @Override
    public double indiceDefensa() {
        return Math.pow(getVelocidad(), 2);
    }

    @Override
    public double indiceAtaque() {
        return Math.pow(getPotencia(), 2);
    }

}
