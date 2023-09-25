package Prueba;
import modelo.Ambulancia;
import modelo.Emisor_de_sonido;
import modelo.Perro;
import java.util.ArrayList;
import modelo.Gato;
import modelo.Pollito;
import modelo.Vaca;


public class Prueba {

	public static void main(String[] args) {
		ArrayList<Emisor_de_sonido> animales = new ArrayList<>();
		
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Vaca());
        animales.add(new Pollito());
        
        Ambulancia a1 = new Ambulancia();
        

        for (Emisor_de_sonido animal : animales) {
            animal.emiteSonido();
        }
        
        a1.emiteSonido();
		
		
	}

}
