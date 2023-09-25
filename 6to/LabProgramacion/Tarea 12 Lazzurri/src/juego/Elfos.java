package juego;


public class Elfos extends Personaje {
	private int lanzas;
	
    public Elfos(String nombre, int vitalidad, Posicion posicion, int lanzas) {
        super(nombre, vitalidad, posicion);
        this.lanzas = lanzas;
    }
    



    public int getLanzas() {
		return lanzas;
	}

	@Override
    public void dibujar() {
		super.dibujar();
        System.out.println("Lanzas: " + getLanzas());
  
    }
}
