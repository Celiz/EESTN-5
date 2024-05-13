
public class Arquero extends Jugador{
	 private double efectividad;

	    public Arquero(String nombre, double velocidad, double potencia, double efectividad) {
	        super(nombre, velocidad, potencia);
	        if (efectividad < 0 || efectividad > 1) {
	            throw new IllegalArgumentException("La efectividad del arquero debe estar entre 0 y 1");
	        }
	        this.efectividad = efectividad;
	    }

	    @Override
	    public double indiceDefensa() {
	        return efectividad;
	    }

	    @Override
	    public double indiceAtaque() {
	        return 0.1 * getVelocidad() * getPotencia();
	    }
}
