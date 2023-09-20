package ej2;

public class Camisa {
	private double precioU;
	private char color;
	private int talle;


    public Camisa(double precioUnitario, char color, int talle) {
        this.precioU = precioUnitario;
        this.color = color;
        this.talle = talle;
    }
    
    public double getPrecioUnitario() {
        return precioU;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioU = precioUnitario;
    }

    public char getColor() {
        return color;
    }
    
    public void setColor(char color) {
        this.color = color;
    }
    
    public int getTalle() {
        return talle;
    }
    
    public void setTalle(int talle) {
        this.talle = talle;
    }
}
