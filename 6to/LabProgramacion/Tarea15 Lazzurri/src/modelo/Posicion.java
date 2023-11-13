package modelo;

public class Posicion implements Movible {
    private double posX;
    private double posY;
    
    public Posicion() {
        this.posX = 0;
        this.posY = 0;
    }


    public Posicion(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

 
    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }
    
    @Override
    public void incrementaPos(Posicion otraPosicion) {
        this.posX = otraPosicion.getPosX();
        this.posY = otraPosicion.getPosY();
    }

    
    public double distancia(Posicion otraPosicion) {
    	double deltaX = this.posX - otraPosicion.getPosX();
        double deltaY = this.posY - otraPosicion.getPosY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

	public void incrementaPos(double posX2, double posY2) {
		this.posX += posX2;
        this.posY += posY2;
	}

	
}
