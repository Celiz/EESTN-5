package punto3;

public abstract class NaveEspacial {
	private String nombre;
	private int energia;
	private double posicionX;
	private double posicionY;

	public NaveEspacial(double posicionX, double posicionY) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public double getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(double posicionX) {
		this.posicionX = posicionX;
	}

	public double getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(double posicionY) {
		this.posicionY = posicionY;
	}

	public abstract void ataca(NaveEspacial adversario);

	public void mueve(double x, double y) {
		this.posicionX += x;
		this.posicionY += y;
	}

	@Override
 	public String toString() {
     	return "NaveEspacial{" +
     			"nombre='" + nombre + '\'' +
     			", energia=" + energia +
     			", posicionX=" + posicionX +
     			", posicionY=" + posicionY +
     			'}';
 	}
}