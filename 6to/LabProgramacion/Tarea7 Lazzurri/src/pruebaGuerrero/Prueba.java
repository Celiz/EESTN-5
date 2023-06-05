package pruebaGuerrero;
import modelo.Guerrero;
import modelo.Posicion;
import modelo.Armadura;
import modelo.Arma;

public class Prueba {
    public static void main(String[] args) {
        Posicion posicionInicial = new Posicion(0.0, 0.0);

        Arma arma = new Arma("Espada", 50.0, 30.0);
        Arma arma2 = new Arma("Varita magica", 200.0, 100.0);

        Armadura armadura = new Armadura("Escudo", 80.0);

        Guerrero aragorn = new Guerrero("Aragorn", posicionInicial.getX(), posicionInicial.getY());

       
        aragorn.equiparArma(arma);
        aragorn.equiparArmadura(armadura);       
        System.out.println(aragorn);

       
        aragorn.mueve(5.0, 3.0);
        System.out.println("Nueva posicion: (" + aragorn.getX() + ", " + aragorn.getY() + ")");

        aragorn.recibirDmg(81);
        System.out.println("Vitalidad despues de recibir damage: " + aragorn.getVitalidad() + "HP y " + aragorn.getNivelDefensa()+ "Armor");
    
        aragorn.equiparArma(arma2);
        aragorn.setX(20);
        aragorn.setY(-12);
        System.out.println(aragorn);
        System.out.println("Nueva posicion: (" + aragorn.getX() + ", " + aragorn.getY() + ")");
        
    }
}
