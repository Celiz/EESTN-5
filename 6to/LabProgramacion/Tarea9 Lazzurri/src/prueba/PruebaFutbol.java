package prueba;
import java.util.Iterator;
import futbol.Jugador;
import futbol.Equipo;

public class PruebaFutbol{
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Equipo A");

        // Agregar jugadores al equipo
        System.out.println(equipo.agregaDelantero("Messi", 0.8, 0.9));
        System.out.println(equipo.agregaDefensor("Romero", 0.6, 0.7));
        System.out.println(equipo.agregaArquero("Dibu Martinez", 0.5, 0.8, 1));

        // Obtener y mostrar los jugadores del equipo
        Iterator<Jugador> iterador = equipo.getJugadores();
        while (iterador.hasNext()) {
            Jugador jugador = iterador.next();
            System.out.println(jugador);
        }

        // Calcular índices de defensa y ataque del equipo
        double indiceDefensa = equipo.indiceDefensa();
        double indiceAtaque = equipo.indiceAtaque();

        System.out.println("Indice de defensa del equipo: " + indiceDefensa);
        System.out.println("Indice de ataque del equipo: " + indiceAtaque);
    }
}

