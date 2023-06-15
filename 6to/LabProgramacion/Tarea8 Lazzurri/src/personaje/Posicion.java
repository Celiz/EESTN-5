package personaje;

public class Posicion {
	private double posicionX;
	private double posicionY;
	
	public Posicion(double posicionX, double posicionY) {
		super();
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}

	public double getPosicionX() {
		return posicionX;
	}
	
	public double getPosicionY() {
		return posicionY;
	}

	public void setPosicionXY(double posicionX, double posicionY) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}
	
	public void incrementaPosicion(double valorX, double valorY) {
		this.posicionX += valorX;
		this.posicionY += valorY;
	}
	
	public double distancia(Posicion otra) {
		double diferencia_x;
		double diferencia_y;
		diferencia_x=this.getPosicionX()-otra.getPosicionX();
		diferencia_y=this.getPosicionY()-otra.getPosicionY();
		double aux = diferencia_x * diferencia_x + diferencia_y * diferencia_y;
		aux=Math.sqrt(aux);
		return aux;
	}

	@Override
	public String toString() {
		return "[posicion X=" + posicionX + ", posicion Y=" + posicionY + "]";
	}
	
}