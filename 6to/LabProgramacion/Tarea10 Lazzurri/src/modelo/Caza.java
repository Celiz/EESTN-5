package modelo;

public class Caza extends Nave{
	private int cantidadMisiles;

	public Caza(String nombre, Posicion posicion, Faccion faccion2) {
		super(nombre, 500, posicion, faccion2);
		this.cantidadMisiles = 5;
	}

	@Override
	public void atacar(Nave otra) {
		if(cantidadMisiles > 0 &&  otra.distancia(posicion) <=20) {
			otra.recibeDmg(500);
			cantidadMisiles--;
		}else if(cantidadMisiles <= 0) {
			otra.recibeDmg(50);
		}else {
			System.out.println("Obejitivo fuera de alcance");
		}	
		
	}

	@Override
	public void recibeDmg(int cantidad) {
		energia -= cantidad;
		
	}

	public int getCantidadMisiles() {
		return cantidadMisiles;
	}

	@Override
	public String toString() {
		return "Caza [cantidadMisiles=" + cantidadMisiles + "]";
	}
	
	
		

}
