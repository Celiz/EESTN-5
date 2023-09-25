package juego;

public interface Movible {
    int getPosX();
    int getPosY();
    void setXY(int x, int y);
    void incrementaPos(int valorX, int valorY);
}
