package model;
import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
	
	 private String nombre;
	    private String direccion;
	    private List<Libro> librosDisponibles;
	    private List<Libro> librosPrestados;
	    private List<Socio> socios;

	    public Biblioteca(String nombre, String direccion) {
	        this.nombre = nombre;
	        this.direccion = direccion;
	        this.librosDisponibles = new ArrayList<>();
	        this.librosPrestados = new ArrayList<>();
	        this.socios = new ArrayList<>();
	    }

	    // Getters y Setters
	    public String getNombre() {
	        return nombre;
	    }

	    public String getDireccion() {
	        return direccion;
	    }
	  
	    // Método para agregar un libro
	    public void agregarLibro(Libro libro) {
	        librosDisponibles.add(libro);
	    }

	    // Método para borrar un libro
	    public void borrarLibro(Libro libro) {
	        librosDisponibles.remove(libro);
	    }

	    // Método para agregar un socio
	    public void agregarSocio(Socio socio) {
	        socios.add(socio);
	    }

	    // Método para borrar un socio
	    public void borrarSocio(Socio socio) {
	        socios.remove(socio);
	    }
	    
	    public void marcarLibroPrestado(Libro libro) {
	        librosPrestados.add(libro);
	    }
	    
	    public void marcarLibroDevuelto(Libro libro) {
	    	librosDisponibles.add(libro);
	    }

	    // Método para prestar un libro a un socio
	    public void prestarLibro(Libro libro, Socio socio) {
	        if (librosDisponibles.contains(libro)) {
	            librosDisponibles.remove(libro);
	            librosPrestados.add(libro);
	            socio.retirarLibro(libro, null);
	            System.out.println("Libro prestado correctamente.");
	        } else {
	            System.out.println("El libro no está disponible para préstamo.");
	        }
	    }

	    public void recibirLibro(Libro libro, Socio socio) {
	        librosPrestados.remove(libro);
	        librosDisponibles.add(libro);
	    }

	    public void listarLibrosDisponibles() {
	        System.out.println("Libros disponibles en la biblioteca:");
	        for (Libro libro : librosDisponibles) {
	            System.out.println(libro);
	        }
	    }

	    public void listarLibrosPrestados() {
	        System.out.println("Libros prestados en la biblioteca:");
	        for (Libro libro : librosPrestados) {
	            System.out.println(libro);
	        }
	    }
	    
	    public void listarSocios() {
	    	System.out.println("Socios:");
	    	for (Socio socio : socios) {
	    		System.out.println(socio);
	    	}
	    }

		@Override
		public String toString() {
			return "Biblioteca [nombre=" + nombre + ", direccion=" + direccion + ", librosDisponibles="
					+ librosDisponibles + ", librosPrestados=" + librosPrestados + ", socios=" + socios + "]";
		}
	    
	    
	

}
