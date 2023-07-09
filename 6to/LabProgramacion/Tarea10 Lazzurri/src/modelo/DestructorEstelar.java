package modelo;

public class DestructorEstelar extends Nave{
	private int nivelEscudo;

	public DestructorEstelar(String nombre, Posicion posicion, Faccion faccion) {
		super(nombre, 1000, posicion, faccion);
		this.nivelEscudo = 1500;
	}

	public int getNivelEscudo() {
		return nivelEscudo;
	}

	@Override
	public void atacar(Nave otra) {
		if(otra.distancia(posicion) <=40 ) {
			otra.recibeDmg(200);
		}
		else {
			System.out.println("El objetivo está fuera de alcance");
		}
	}

	@Override
	public void recibeDmg(int cantidad) {
		if(nivelEscudo >= cantidad) {
			this.nivelEscudo -= cantidad;
		}else {
			this.setEnergia(this.getEnergia() - (cantidad - this.nivelEscudo));
			this.nivelEscudo = 0;	
		}
	}



	@Override
	public String toString() {
		return "DesctructorEstelar [nivelEscudo=" + nivelEscudo + "]";
	}
	

	
}
