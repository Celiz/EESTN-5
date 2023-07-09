package modelo;

public abstract class Nave {
	protected String nombre;
	protected int energia;
	protected Posicion posicion;
	protected Faccion faccion;

	
	public Nave(String nombre, int energia, Posicion posicion, Faccion faccion2) {
		super();
		this.nombre = nombre;
		this.energia = energia;
		this.posicion = posicion;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEnergia() {
		return energia;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	public void setFaccion(Faccion faccion) {
		this.faccion = faccion;
	}
	public abstract void atacar(Nave otra);
	
	public abstract void recibeDmg(int cantidad);
	
	public double distancia(Posicion nave) {
		return posicion.distancia(nave);
	}
	@Override
	public String toString() {
		return "Nave [nombre=" + nombre + ", energia=" + energia + ", posicion=" + posicion + ", faccion=" + faccion
				+ "]";
	}
	
	

}
