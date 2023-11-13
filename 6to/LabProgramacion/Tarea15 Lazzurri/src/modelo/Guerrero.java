package modelo;

public class Guerrero extends Personaje {
    public Guerrero(String nombre, Posicion posicion) {
        super(nombre, 500, posicion);
    }

    @Override
    protected double getAlcanceAtaque() {
        return 10;
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

	@Override
	public double distancia(Posicion otraPosicion) {
		return this.posicion.distancia(otraPosicion);
	}
	
}
