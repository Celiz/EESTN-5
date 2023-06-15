package modelo;
import personaje.Personaje;
import personaje.Posicion;
import java.util.Random;

public class Mago extends Personaje{
	protected int cantidadMagia;
	protected int danioMagia;
	public Mago(String nombre, Posicion posicion) {
		super(nombre, posicion);
		this.setVitalidad(300);
		this.cantidadMagia = 5000;
		this.danioAtaque = 3;
		this.distanciaAtaque = 5;
		this.danioMagia = 10;
	}
	@Override
	public boolean ataca(Personaje adversario) {
		boolean flag = false;
		if(this.cantidadMagia > 0) {
				flag = true;
				adversario.recibeDanio(this.danioMagia);
				this.cantidadMagia -= 500;
		}
		else {
			flag = super.ataca(adversario);
		}
		return flag;
	}
	public void recuperarMagia() {
		Random random = new Random();
		int numeroMagia = random.nextInt(10);
		this.cantidadMagia += numeroMagia;
		System.out.println("Recuperaste " + numeroMagia + " de magia. Ahora tenes " + this.cantidadMagia + " de magia");
	}
	public void teletransportarse(Posicion p) {
		if(cantidadMagia >= 2000) {
			this.posicion=p;	
			System.out.println("Teletransportacion exitosa!");
		}
		else {
			System.out.println("No tienes suficiente magia para poder teletransportarte");
		}
	}
	public void curar(Personaje companiero) {
		if(cantidadMagia >= 1000) {
			companiero.setVitalidad(companiero.getVitalidad() + 100);
			System.out.println("Curaste exitosamente!!");
		}
		else {
			System.out.println("No tienes suficiente magia para poder curar");
		}
	}
	@Override
	public String toString() {
		return "Mago: " + super.toString() + "cantidadMagia=" + cantidadMagia + ", danioMagia=" + danioMagia;
	}
	
}