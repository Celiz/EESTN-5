package juego;

public class Posicion implements Movible {
    private int posX;
    private int posY;
    
    public Posicion(int posX, int posY) {
		super();
		this.posX = posX;
		this.posY = posY;
	}

	@Override
    public int getPosX() {
        return posX;
    }

    @Override
    public int getPosY() {
        return posY;
    }

    @Override
    public void setXY(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    @Override
    public void incrementaPos(int valorX, int valorY) {
        this.posX += valorX;
        this.posY += valorY;
    }
}
