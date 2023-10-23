package modelo;

public class Gorro extends Articulo{
	
	public Gorro(int codigo, double precio, String color) {
		super(codigo, precio, color);
		
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return super.equals(obj);
    }

    public void imprimir() {
        System.out.println("Gorro Codigo: " + getCodigo() + " Color: " + getColor() + " Precio: $" + getPrecio());
    }
	
}