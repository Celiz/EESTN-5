package modelo;

public class Buzo extends Articulo{
	private String talle;

	public Buzo(int codigo, double precio, String color, String talle) {
		super(codigo, precio, color);
		this.talle = talle;
		
	}
	
	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	@Override
	public String toString() {
		return super.toString()+" Talle: " + talle;
	}
	
	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return super.equals(obj);
    }

    public void imprimir() {
        System.out.println("Buzo Codigo: " + getCodigo() + " Color: " + getColor() + " Precio: $" + getPrecio());
    }
    
    

}