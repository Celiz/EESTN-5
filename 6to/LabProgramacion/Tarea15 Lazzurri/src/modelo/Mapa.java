package modelo;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Mapa {
    private List<Personaje> personajes;

    public Mapa() {
        this.personajes = new ArrayList<>();
    }

    public void agregarPersonaje(Personaje personaje) {
        this.personajes.add(personaje);
    }

    public void mueve(Personaje personaje, double valorX, double valorY) throws IncrementoImposibleException {
        Posicion nuevaPosicion = new Posicion(personaje.getPosX() + valorX, personaje.getPosY() + valorY);
		personaje.incrementaPos(nuevaPosicion);
    }

    public void ataca(Personaje atacante, Personaje atacado) {
        try {
            atacante.ataca(atacado);
        } catch (AtaqueImposibleException e) {

            String mensaje = "Ataque imposible: " + e.getAtacante().getNombre() + " no puede atacar a " + e.getAtacado().getNombre();
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public static void main(String[] args) throws IncrementoImposibleException, AtaqueImposibleException {
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
        mapa.mueve(guerrero, 5, 5);
        mapa.ataca(guerrero, arquero);

        // Imprimir información de los personajes en el mapa
        for (Personaje personaje : mapa.getPersonajes()) {
            System.out.println(personaje.getNombre() + ": X = " + personaje.getPosX() + ", Y = " + personaje.getPosY());
        }

        // Mostrar cuadros de diálogo con información adicional
        JOptionPane.showMessageDialog(null, "Acciones realizadas en el mapa. Consulta la consola para información detallada.");

        mapa.ataca(arquero, guerrero);
    }
}

	