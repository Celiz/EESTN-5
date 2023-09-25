package Prueba;
import juego.Posicion;
import juego.Caballero;
import juego.Elfos;
import juego.Magos;
import juego.Orcos;

public class Pruebajuego {

	public static void main(String[] args) {
		
        Posicion posicionCaballero = new Posicion(20, 20);
        Caballero caballero = new Caballero("Sir Lancelot", 100, posicionCaballero, 0);

        Posicion posicionMago = new Posicion(20, 30);
        Magos mago = new Magos("Gandalf", 80, posicionMago, 0);

        Posicion posicionElfo = new Posicion(5, 10);
        Elfos elfo = new Elfos("Jaime", 90, posicionElfo, 0);

        Posicion posicionOrco = new Posicion(15, 25);
        Orcos orco = new Orcos("Pepe", 120, posicionOrco, 0);
        
        caballero.dibujar();
        System.out.println("------------------------");
        mago.dibujar();
        System.out.println("------------------------");
        elfo.dibujar();
        System.out.println("------------------------");
        orco.dibujar();
    }

}


