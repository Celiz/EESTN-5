package modelo;

public class Articulo {
	private int codigo;
	private double precio;
	private String color;
	
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Articulo(int codigo, double precio, String color) {
		super();
		this.codigo = codigo;
		this.precio = precio;
		this.color = color;
	}
	
	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Articulo articulo = (Articulo) obj;
        return codigo == articulo.codigo && Double.compare(articulo.precio, precio) == 0 &&
               color.equals(articulo.color);
    }

    public void imprimir() {
        System.out.println("Código: " + codigo + " Color: " + color + " Precio: $" + precio);
    }


	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", precio=" + precio + ", color=" + color + "]";
	}
}