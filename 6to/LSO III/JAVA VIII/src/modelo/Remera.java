package modelo;

public class Remera extends Articulo{
	
	private String talle;

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public Remera(int codigo, double precio, String color, String talle) {
		super(codigo, precio, color);
		this.talle = talle;	
	}
	
	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Remera remera = (Remera) obj;
        return talle.equals(remera.talle);
    }

    public void imprimir() {
        System.out.println("Remera talle: " + talle + " Codigo: " + getCodigo() + " Color: " + getColor() + " Precio: $" + getPrecio());
    }

	@Override
	public String toString() {
		return super.toString()+" Talle: " + talle;
	}
	

}