package futbol;

public class Arquero extends Jugador {

	private double efectividad;
	
	public Arquero(String nombre, double velocidad, double potencia, double efectividad) {
		super(nombre, velocidad, potencia);
		this.efectividad = efectividad;
		
	}

	@Override
	public double indiceDefensa() {
		return (0.1 * velocidad * potencia);
	}

	@Override
	public double indiceAtaque() {
		
		return efectividad;
	}

    @Override
    public String toString() {
        return "Arquero: " + nombre;
    }

	
	

}
