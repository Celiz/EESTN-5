package modelo;

public class Gato extends Animal implements Emisor_de_sonido{

	@Override
	public void emiteSonido() {
		System.out.println("Miau");
		
	}
	

}
