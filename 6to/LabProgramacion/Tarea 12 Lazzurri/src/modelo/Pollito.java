package modelo;

public class Pollito extends Animal implements Emisor_de_sonido{

	@Override
	public void emiteSonido() {
		System.out.println("Pio pio");
		
	}
	

}
