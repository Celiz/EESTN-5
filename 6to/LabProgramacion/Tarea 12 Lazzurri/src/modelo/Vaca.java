package modelo;

public class Vaca extends Animal implements Emisor_de_sonido{

	@Override
	public void emiteSonido() {
		System.out.println("Muu");
		
	}
	

}
