package modelo;

public class Perro extends Animal implements Emisor_de_sonido{

	@Override
	public void emiteSonido() {
		System.out.println("Guau");
		
	}
	

}
