package modelo;

public class Mago extends Personaje {
    private int magia;

    public Mago(String nombre, Posicion posicion, int magia) {
        super(nombre, 300, posicion);
        this.magia = magia;
    }

    public void recuperarMagia(int cantidad) {
        this.magia += cantidad;
    }

    public void curar(Personaje objetivo) {
        if (magia >= 1000) {
            objetivo.recibeDanio(-100);
            this.magia -= 1000;
        }
    }

    @Override
    protected double getAlcanceAtaque() {
        if (magia > 500) {
            return Double.MAX_VALUE;
        } else {
            return 5;
        }
    }

    @Override
    protected int getDañoAtaque() {
        if (magia > 500) {
            return 10;
        } else {
            return 3;
        }
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

	public int getMagia() {
		return magia;
	}

	@Override
	public double distancia(Posicion otraPosicion) {
		return this.posicion.distancia(otraPosicion);
	}

}

