package juego;

public class Caballero extends Personaje {
	private int armadura;

	public Caballero(String nombre, int vitalidad, Posicion posicion, int armadura) {
		super(nombre, vitalidad, posicion);
		this.setArmadura(armadura);

	}

	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	@Override
	public void dibujar() {
		super.dibujar();
		System.out.println("Armadura: " + getArmadura());
        
	}
}
