import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void eliminarJugador(Jugador jugador) {
        jugadores.remove(jugador);
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public double indiceDefensa() {
        return jugadores.stream().mapToDouble(Jugador::indiceDefensa).sum();
    }

    public double indiceAtaque() {
        return jugadores.stream().mapToDouble(Jugador::indiceAtaque).sum();
    }

}
