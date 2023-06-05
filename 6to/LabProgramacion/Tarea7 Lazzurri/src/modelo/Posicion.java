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
	
	 public void setX(double x) {
	        this.x = x;
	    }

	 public void setY(double y) {
		 this.y = y;
	 }

	 public double mueve(double incrementoX, double incrementoY) {
		 x += incrementoX;
		 y += incrementoY;
		 return Math.sqrt(x * x + y * y); 
	 }
	@Override
	public String toString() {
		return "Posicion [x=" + x + ", y=" + y + "]";
	}
	 
	 

}
