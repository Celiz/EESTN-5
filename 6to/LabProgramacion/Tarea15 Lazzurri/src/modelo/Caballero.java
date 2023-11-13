package modelo;

public class Caballero extends Personaje {
    private int armadura;

    public Caballero(String nombre, Posicion posicion) {
        super(nombre, 800, posicion);
        this.setArmadura(500);
    }

    @Override
    protected double getAlcanceAtaque() {
        return 5;
    }

    @Override
    protected int getDañoAtaque() {
        return 10;
    }

    @Override
	public void incrementaPos(Posicion otraPosicion) {
		 this.posicion.incrementaPos(otraPosicion.getPosX(), otraPosicion.getPosY());
	}

	@Override
	public double getPosX() {
		return this.posicion.getPosX();
	}

	@Override
	public double getPosY() {
		return this.posicion.getPosY();
	}

	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	@Override
	public double distancia(Posicion otraPosicion) {
		return this.posicion.distancia(otraPosicion);
	}
}
