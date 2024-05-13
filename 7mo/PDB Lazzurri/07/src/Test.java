
public class Test {
	public static void main(String[] args) {
		 Equipo equipo = new Equipo("Equipo A");

	        Delantero delantero1 = new Delantero("Juan", 0.8, 0.7);
	        Delantero delantero2 = new Delantero("Tomi", 0.9, 0.6);
	        Defensor defensor1 = new Defensor("Pedro", 0.6, 0.5);
	        Defensor defensor2 = new Defensor("Luca", 0.7, 0.4);
	        Arquero arquero = new Arquero("Luis", 0.5, 0.6, 0.8);

	        equipo.agregarJugador(delantero1);
	        equipo.agregarJugador(delantero2);
	        equipo.agregarJugador(defensor1);
	        equipo.agregarJugador(defensor2);
	        equipo.agregarJugador(arquero);

	        System.out.println("Índice de defensa del equipo: " + equipo.indiceDefensa());
	        System.out.println("Índice de ataque del equipo: " + equipo.indiceAtaque());

	        equipo.eliminarJugador(defensor1);

	        System.out.println("Jugadores del equipo:");
	        for (Jugador jugador : equipo.getJugadores()) {
	            System.out.println(jugador.getClass().getSimpleName() + ": " + jugador.getNombre());
	        }

	        try {
	            Arquero arqueroInvalido = new Arquero("Carlos", 0.6, 0.7, 1.2);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Excepción: " + e.getMessage());
	        }
	}

}
