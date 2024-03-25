package model;

public class Test {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("Dragon Ball Z", "Akira Toriyama", "Toei", 1989);
		Libro libro2 = new Libro("Naruto", "Masashi Kishimoto", "Toei", 1999);
		Socio socio1 = new Socio("Matias Celiz", 01);
		Socio socio2 = new Socio("Facundo Celiz", 02);
		Biblioteca biblioteca1 = new Biblioteca("Biblioteca de Alejandria", "Egipto 2024");
		
		
		biblioteca1.agregarLibro(libro1);
		biblioteca1.agregarLibro(libro2);
		biblioteca1.agregarSocio(socio1);
		biblioteca1.agregarSocio(socio2);
		biblioteca1.listarLibrosDisponibles();
		biblioteca1.listarSocios();
		System.out.println();
		
		
		socio1.retirarLibro(libro1, biblioteca1);
		socio1.listarLibrosEnPoder();
		System.out.println();
		
		biblioteca1.prestarLibro(libro1, socio1);
		biblioteca1.listarLibrosPrestados();
		
		System.out.println();
		biblioteca1.listarLibrosDisponibles();
		System.out.println();
		
		
		biblioteca1.recibirLibro(libro1, socio1);
		biblioteca1.listarLibrosDisponibles();
		
		socio1.devolverLibro(libro1, biblioteca1);
		socio1.listarLibrosEnPoder();
	}

}
