package modelo;
import java.util.ArrayList;
import java.util.Iterator;

public class Juego {
	private ArrayList<Personaje> personaje;

	
	public Juego() {
		this.personaje = new ArrayList<Personaje>(); 
	}

	public void agregarPersonaje(Personaje p) {
		this.personaje.add(p);
	}

	public void eliminarPersonaje(Personaje p) {
		this.personaje.remove(p);
	}

	public Iterator<Personaje> getPersonajes() {
		return this.personaje.iterator();
	}

	public Personaje enfrentar(Personaje p1, Personaje p2, String atributo) {
		Personaje resultado = null;
		if (atributo.equalsIgnoreCase("Fuerza")) {
			resultado = p1.enfrentarFuerza(p2);
		} else if (atributo.equalsIgnoreCase("Velocidad")) {
			resultado = p1.enfrentarVelocidad(p2);
		} else if (atributo.equalsIgnoreCase("Resistencia Magica")) {
			resultado = p1.enfrentarResistenciaMagica(p2);
		} else if (atributo.equalsIgnoreCase("Armadura")) {
			resultado = p1.enfrentarArmadura(p2);
		}
		
		return resultado;
	}
}

