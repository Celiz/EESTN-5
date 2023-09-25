package juego;

public class Personaje implements Movible, Dibujable {
    private String nombre;
    private int vitalidad;
    private Posicion posicion;

    public Personaje(String nombre, int vitalidad, Posicion posicion) {
        this.nombre = nombre;
        this.vitalidad = vitalidad;
        this.posicion = posicion;
    }
    
    @Override
	public int getPosX() {
		return posicion.getPosX();
	}

	@Override
	public int getPosY() {
		return posicion.getPosY();
	}
	
	@Override
	public void setXY(int x, int y) {
		posicion.setXY(x, y);
	}

    @Override
    public void incrementaPos(int valorX, int valorY) {
        posicion.incrementaPos(valorX, valorY);
    }

    @Override
    public void dibujar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vitalidad: " + vitalidad);
        System.out.println("Posicion: (" + getPosX() + ", " + getPosY() + ")");
    }

}
