package personaje;

public class Personaje {
	protected String nombre;
	protected int vitalidad;
	protected Posicion posicion;
	protected double distanciaAtaque;
	protected int danioAtaque;
	
	
	public Personaje(String nombre, Posicion posicion) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
	}

	public boolean ataca(Personaje adversario) {
		boolean flag = false;
		
		if(this.distancia(adversario) <= this.distanciaAtaque) {
			flag = true;
			adversario.recibeDanio(this.danioAtaque);
		}
		
		return flag;
	}
	
	public void recibeDanio(int cantidad) {
		this.vitalidad -= cantidad;
	}	
	
	public double distancia(Personaje otro) {
		return this.posicion.distancia(otro.getPosicion());
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public Posicion getPosicion() {
		return posicion;
	}
	
	public int getVitalidad() {
		return vitalidad;
	}
	
	public void setVitalidad(int vitalidad) {
		this.vitalidad = vitalidad;
	}
	
	public void moverse(Posicion p) {
		this.posicion = p;
	}
	
	@Override
	public String toString() {
		return "Personaje nombre=" + nombre + ", vitalidad=" + vitalidad + ", posicion=" + posicion
				+ ", distanciaAtaque=" + distanciaAtaque + ", danioAtaque=" + danioAtaque + " ";
	}
}
