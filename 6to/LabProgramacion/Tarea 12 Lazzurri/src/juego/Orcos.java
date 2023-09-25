package juego;

public class Orcos extends Personaje {
	private int piedras;
    public Orcos(String nombre, int vitalidad, Posicion posicion, int piedras) {
        super(nombre, vitalidad, posicion);
        this.piedras = piedras;
    }
    
    public int getPiedras() {
		return piedras;
	}

	@Override
    public void dibujar() {
		super.dibujar();
        System.out.println("Piedras: " + getPiedras());
       
    }
}