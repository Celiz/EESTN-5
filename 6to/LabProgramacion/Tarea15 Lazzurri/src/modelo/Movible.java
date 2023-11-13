package modelo;

public interface Movible {
	
	void incrementaPos(Posicion otraPosicion);
	double distancia(Posicion otraPosicion);

	double getPosX();
	double getPosY();
	
}
