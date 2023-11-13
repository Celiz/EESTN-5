package modelo;

import javax.swing.JOptionPane;

public class Prueba {

	public static void main(String[] args) throws IncrementoImposibleException, AtaqueImposibleException{

		   // Crear objetos de tipo Posicion
        Posicion posicion1 = new Posicion(0, 0);
        Posicion posicion2 = new Posicion(3, 4);

        // Crear objetos de tipo Personaje
        Guerrero guerrero = new Guerrero("Guerrero1", posicion1);
        Arquero arquero = new Arquero("Arquero1", posicion2, 20);

        // Crear objeto de tipo Mapa y agregar personajes
        Mapa mapa = new Mapa();
        mapa.agregarPersonaje(guerrero);
        mapa.agregarPersonaje(arquero);

        // Realizar algunas acciones en el mapa
        
        mapa.mueve(guerrero, 5,5);

        
        for (Personaje personaje : mapa.getPersonajes()) {
            System.out.println(personaje.getNombre() + ": X = " + personaje.getPosX() + ", Y = " + personaje.getPosY());
        }

        
        mapa.ataca(arquero, guerrero);
        
     // Imprimir información de los personajes en el mapa, incluyendo la vida del guerrero
        for (Personaje personaje : mapa.getPersonajes()) {
            System.out.println(personaje.getNombre() + ": X = " + personaje.getPosX() + ", Y = " + personaje.getPosY() +
                    ", Vida = " + personaje.getVitalidad());
        }
        
        JOptionPane.showMessageDialog(null, "Acciones realizadas en el mapa. Consulta la consola para información detallada.");

    }
}


