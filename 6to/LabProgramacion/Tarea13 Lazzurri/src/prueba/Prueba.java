package prueba;
import modelo.TorreVigilancia;
import modelo.Cuartel;

public class Prueba {

	public static void main(String[] args) {
		Cuartel cuartel1 = new Cuartel("Team 1", 20, 20);
		TorreVigilancia torreta1 = new TorreVigilancia("Team 2", 40, 40);
		
		System.out.println("Cuartel del equipo: " + cuartel1.getEquipo());
        System.out.println("Costo del Cuartel: " + cuartel1.getCosto());
        System.out.println("Energia del Cuartel: " + cuartel1.getEnergia());
        
        System.out.println("Torreta del equipo: " + torreta1.getEquipo());
        System.out.println("Costo de la Torreta: " + torreta1.getCosto());
        System.out.println("Energía de la Torreta: " + torreta1.getEnergia());
        
        
        cuartel1.recibeDanio(10);
        System.out.println("Energia del Cuartel: " + cuartel1.getEnergia());
        
        

	}

}
