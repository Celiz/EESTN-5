package modelo;

abstract class Unidad implements Posicionable {
	 protected String equipo;
	 protected int costo;
	 protected int energia;
	
	public Unidad(String equipo, int costo, int energia) {
		super();
		this.equipo = equipo;
		this.costo = costo;
		this.energia = energia;
	}
	
	
	
	public String getEquipo() {
		return equipo;
	}



	public int getCosto() {
		return costo;
	}



	public int getEnergia() {
		return energia;
	}



	public abstract void recibeDanio(int cantidad);
	
}
	
	
	
	
	


