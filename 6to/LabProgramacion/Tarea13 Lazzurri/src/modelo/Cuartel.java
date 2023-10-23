package modelo;

public class Cuartel extends Unidad implements Construible{
	private int tiempoConstruccion;
	private int x;
	private int y;

	public Cuartel(String equipo, int x, int y) {
		super(equipo, 500, 3000);
		this.tiempoConstruccion = 60;
		this.x = x;
		this.y = y;
	}
	

	@Override
    public int getTiempoConstruccion() {
        return tiempoConstruccion;
    }

	@Override
	public int getX() {
		return this.x;
	}

	@Override
	public int getY() {
		return this.y;
	}
	
	public int getEnergia() {
		return this.energia;
	}

	@Override
	public void recibeDanio(int cantidad) {
		this.energia -= (cantidad/2);	
	}

}
