package model;

public class Libro {

	private String titulo;
	private String autor;
	private String editorial;
	private int year;
	
	   public Libro(String titulo, String autor, String editorial, int year) {
	        this.titulo = titulo;
	        this.autor = autor;
	        this.editorial = editorial;
	        this.year = year;
	    }
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}

	public String getEditorial() {
		return editorial;
	}
	
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getYear() {
		return year;
	}
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", year=" + year + "]";
	}
	
	
}
