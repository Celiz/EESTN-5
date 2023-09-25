package juego;

public class Magos extends Personaje {
	private int magia;

    public Magos(String nombre, int vitalidad, Posicion posicion, int magia) {
        super(nombre, vitalidad, posicion);
        this.setMagia(magia);
    }

	public int getMagia() {
		return magia;
	}

	public void setMagia(int magia) {
		this.magia = magia;
	}

	 public void dibujar() {
			super.dibujar();
	        System.out.println("Piedras: " + getMagia());
	       
	    }
	
	
}