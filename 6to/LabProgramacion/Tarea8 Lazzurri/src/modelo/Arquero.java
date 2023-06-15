package modelo;
import java.util.Random;
import personaje.Personaje;
import personaje.Posicion;

public class Arquero extends Personaje {
	protected int cantidadFlechas;
	protected double distanciaAtaqueArco;
	protected int danioAtaqueArco;
	public Arquero(String nombre, Posicion posicion) {
		super(nombre, posicion);
		this.setVitalidad(500);
		this.cantidadFlechas = 20;
		this.distanciaAtaqueArco = 100;
		this.danioAtaqueArco = 15;
		this.danioAtaque = 5;
		this.distanciaAtaque = 5;
	}
	@Override
	public boolean ataca(Personaje adversario) {
		boolean flag = false;
		if(this.cantidadFlechas > 0) {
			if(this.distancia(adversario) <= this.distanciaAtaqueArco) {
				flag = true;
				adversario.recibeDanio(this.danioAtaqueArco);
				this.cantidadFlechas--;
			}
		}
		else {
			flag = super.ataca(adversario);
		}
		return flag;
	}
	public void recuperarFlechas() {
		Random random = new Random();
		int numeroFlechas = random.nextInt(10);
		this.cantidadFlechas += numeroFlechas;
		System.out.println("Agarraste " + numeroFlechas + " flechas. Ahora tenes " + this.cantidadFlechas + " flechas.");
	}
	@Override
	public String toString() {
		return "Arquero: " + super.toString() + "Flechas=" + cantidadFlechas + ", Distancia de ataque del arco=" + distanciaAtaqueArco
				+ ", damage del arco=" + danioAtaqueArco;
	}
	
}