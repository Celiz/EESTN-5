package modelo;

public class Ambulancia extends Vehiculo implements Emisor_de_sonido{

	@Override
	public void emiteSonido() {
		System.out.println("Sirena sonando");
		
	}

}
