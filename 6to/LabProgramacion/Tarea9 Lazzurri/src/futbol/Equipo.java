package futbol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public String agregaDelantero(String nombre, double velocidad, double potencia) {
        Delantero delantero = new Delantero(nombre, velocidad, potencia);
        if (validarParametros(velocidad, potencia)) {
            jugadores.add(delantero);
            return "Jugador agregado";
        } else {
            return "Imposible crear un delantero con velocidad = " + velocidad + " y potencia = " + potencia;
        }
    }

    public String agregaDefensor(String nombre, double velocidad, double potencia) {
        Defensor defensor = new Defensor(nombre, velocidad, potencia);
        if (validarParametros(velocidad, potencia)) {
            jugadores.add(defensor);
            return "Jugador agregado";
        } else {
            return "Imposible crear un defensor con velocidad = " + velocidad + " y potencia = " + potencia;
        }
    }

    public String agregaArquero(String nombre, double velocidad, double potencia, double efectividad) {
        Arquero arquero = new Arquero(nombre, velocidad, potencia, efectividad);
        if (validarParametros(velocidad, potencia)) {
            jugadores.add(arquero);
            return "Jugador agregado";
        } else {
            return "Imposible crear un arquero con velocidad = " + velocidad + " y potencia = " + potencia;
        }
    }

    public void eliminaJugador(Jugador jugador) {
        jugadores.remove(jugador);
    }

    public Iterator<Jugador> getJugadores() {
        return jugadores.iterator();
    }

    public double indiceDefensa() {
        double indiceTotal = 0;
        for (Jugador jugador : jugadores) {
            indiceTotal += jugador.indiceDefensa();
        }
        return indiceTotal;
    }

    public double indiceAtaque() {
        double indiceTotal = 0;
        for (Jugador jugador : jugadores) {
            indiceTotal += jugador.indiceAtaque();
        }
        return indiceTotal;
    }

    private boolean validarParametros(double velocidad, double potencia) {
        return (velocidad >= 0 && velocidad <= 1 && potencia >= 0 && potencia <= 1);
    }

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", jugadores=" + jugadores + "]";
	}
}
