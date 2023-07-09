package modelo;

public class Faccion {
	public String nombre;
	public int score;
	
	public Faccion(String nombre, int score) {
		super();
		this.nombre = nombre;
		this.score = 0;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getScore() {
		return score;
	}
	
	public void sumarPuntos(int cantidad) {
		score += cantidad;
	}

	@Override
	public String toString() {
		return "Faccion [nombre=" + nombre + ", score=" + score + "]";
	}


	
	
}
