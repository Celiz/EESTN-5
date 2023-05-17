package pruebaJugador;

import jugadoryequipo.Equipo;
import jugadoryequipo.Jugador;

public class Prueba {

    public static void main(String[] args) {

        Equipo e1 = new Equipo("Porcinos FC", 1995);
        Jugador jugador1 = new Jugador("Matias", 17, "Defensor", 10);
        Jugador jugador2 = new Jugador("Ariel", 17, "Defensor", 1);
        Jugador jugador3 = new Jugador("Nacho", 17, "Defensor", 4);
        Jugador jugador4 = new Jugador("Luca", 17, "Defensor", 7);
        Jugador jugador5 = new Jugador("Alan", 17, "Defensor", 2);
        Jugador jugador6 = new Jugador("Tomas", 17, "Defensor", 5);
        
        e1.agregarJugador(jugador1);
        e1.agregarJugador(jugador2);
        e1.agregarJugador(jugador3);
        e1.agregarJugador(jugador4);
        e1.agregarJugador(jugador5);
        e1.agregarJugador(jugador6);

        System.out.println("Equipo antes de eliminar un jugador:");
        System.out.println(e1);
        System.out.println("Cantidad de jugadores: " + e1.getCantidadJugadores());
        
        System.out.println(e1.promedioEdad());
		System.out.println(e1.mayorEdad());
		System.out.println(e1.menorEdad());
		System.out.println(e1.efectividadTotal());


        e1.eliminarJugador(jugador3);
        System.out.println("Equipo después de eliminar un jugador:");
        System.out.println(e1);
        System.out.println("Cantidad de jugadores: " + e1.getCantidadJugadores());
        
        System.out.println(e1.promedioEdad());
		System.out.println(e1.mayorEdad());
		System.out.println(e1.menorEdad());
		System.out.println(e1.efectividadTotal());
    }
}
