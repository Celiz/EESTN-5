package modelo;

public class TorreVigilancia extends Unidad implements Construible, Hostil {
	private int tiempoConstruccion;
	private int x;
	private int y;

	public TorreVigilancia(String equipo, int x, int y) {
		super(equipo, 200, 2000);
		this.tiempoConstruccion = 40;
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
		this.energia -= cantidad;
	}


	@Override
	public void atacar(Unidad adversario) {
		int danio = 10;
		adversario.energia -= danio;
	}


}
