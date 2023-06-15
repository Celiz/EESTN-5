package modelo;
import personaje.Personaje;
import personaje.Posicion;

public class Caballero extends Personaje{
	protected int nivelArmadura;
	public Caballero(String nombre, Posicion posicion) {
		super(nombre, posicion);
		this.setVitalidad(800);
		this.distanciaAtaque = 5;
		this.danioAtaque = 10;
		this.nivelArmadura = 500;
	}
	
	@Override
	public void recibeDanio(int cantidad) {
		if(this.nivelArmadura >= cantidad) { 
			this.nivelArmadura -= cantidad;
		}
		else {
			this.setVitalidad(this.getVitalidad() - (cantidad - this.nivelArmadura));
			this.nivelArmadura = 0;
		}
	}

	@Override
	public String toString() {
		return "Caballero: " + super.toString() + "Armadura=" + nivelArmadura;
	}
	
}