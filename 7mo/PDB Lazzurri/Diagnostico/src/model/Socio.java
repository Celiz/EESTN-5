package model;
import java.util.List;
import java.util.ArrayList;

public class Socio {
	
	private String nombre;
	private int nSocio;
	private List<Libro> librosEnPoder;
	
	public Socio(String nombre, int numeroSocio) {
        this.nombre = nombre;
        this.nSocio = numeroSocio;
        this.librosEnPoder = new ArrayList<>();
    }
	
	// Getters
    public String getNombre() {
        return nombre;
    }

    public int getNumeroSocio() {
        return nSocio;
    }

    public void retirarLibro(Libro libro, Biblioteca biblioteca) {
        librosEnPoder.add(libro);
        biblioteca.borrarLibro(libro);
        biblioteca.marcarLibroPrestado(libro);
    }

    public void devolverLibro(Libro libro, Biblioteca biblioteca){
        librosEnPoder.remove(libro);
        biblioteca.agregarLibro(libro);
    }

    public void listarLibrosEnPoder() {
        System.out.println("Libros en poder de " + nombre + ":");
        for (Libro libro : librosEnPoder) {
            System.out.println(libro);
        }
    }

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", nSocio=" + nSocio + ", librosEnPoder=" + librosEnPoder + "]";
	}
    
}
