package modelo;

public class Arquero extends Personaje {
    private int flechas;

    public Arquero(String nombre, Posicion posicion, int flechas) {
        super(nombre, 500, posicion);
        this.flechas = flechas;
    }

    public void recuperarFlechas(int cantidad) {
        this.flechas += cantidad;
    }

    @Override
    protected double getAlcanceAtaque() {
        if (flechas > 0) {
            return 100;
        } else {
            return 5;
        }
    }

    @Override
    protected int getDañoAtaque() {
        if (flechas > 0) {
            return 15;
        } else {
            return 5;
        }
    }

	@Override
	public double getPosX() {
		return this.posicion.getPosX();
	}

	@Override
	public double getPosY() {
		return this.posicion.getPosY();
	}
	
	 public void incrementaPos(Posicion otraPosicion) {
		 this.posicion.incrementaPos(otraPosicion.getPosX(), otraPosicion.getPosY());
	 }

	 @Override
	 public double distancia(Posicion otraPosicion) {
			return this.posicion.distancia(otraPosicion);
	 }

}

