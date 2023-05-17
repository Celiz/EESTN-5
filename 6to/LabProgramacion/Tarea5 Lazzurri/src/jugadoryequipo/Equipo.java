package jugadoryequipo;
import java.util.ArrayList;

public class Equipo {
	private String nombre;	
	private int yearCreacion;
	private ArrayList<Jugador> jugadores= new ArrayList<Jugador>();
	
	
	public Equipo(String nombre, int yearCreacion) {
		super();
		this.nombre = nombre;
		this.yearCreacion = yearCreacion;
	}

	public void agregarJugador(Jugador jugador) {
		this.jugadores.add(jugador);
	}
	
	public void eliminarJugador(Jugador jugador) {
		this.jugadores.remove(jugador);
	}
	
	public int getCantidadJugadores() {
		return this.jugadores.size();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getYearCreacion() {
		return yearCreacion;
	}
	
	public double promedioEdad() {
		double suma= 0;
		double resultado;
		
		for(Jugador j : this.jugadores) {
			suma+=j.getEdad();
		}
		resultado = suma/this.jugadores.size();
		
		return resultado;
	}
	
	public double mayorEdad() {
		double cant=0;
		
		for (Jugador j : this.jugadores) {
			if(j.getEdad()>=18) {
				cant++;
			}
		}
		return cant;
	}
	
	public double menorEdad() {
		double cant=0;
		for(Jugador j : this.jugadores) {
			if(j.getEdad()<18) {
				cant++;
			}
		}
		return cant;
	}
	
	public int efectividadTotal() {
		int efectividad = 0;
		for(Jugador j : this.jugadores) {
			efectividad+=j.getEfectividad();
		}
		return efectividad;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", yearCreacion=" + yearCreacion + ", jugadores=" + jugadores + "]";
	}
	
}
 