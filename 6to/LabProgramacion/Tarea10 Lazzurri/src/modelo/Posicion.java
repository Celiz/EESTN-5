package modelo;

public class Posicion {
	private double x;
	private double y;
	
	
	
	public Posicion(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	public void incrementarPos(double inc_x, double inc_y) {
		x += inc_x;
        y += inc_y;
	}
	
	public double distancia(Posicion otro) {
		double diferencia_x;
		double diferencia_y;
		diferencia_x=this.getX()- otro.getX();
		diferencia_y=this.getY()- otro.getY();
		double aux = diferencia_x * diferencia_x + diferencia_y * diferencia_y;
		aux=Math.sqrt(aux);
		
		return aux;
	}
	
	@Override
	public String toString() {
		return "Posicion [x=" + x + ", y=" + y + "]";
	}
}
