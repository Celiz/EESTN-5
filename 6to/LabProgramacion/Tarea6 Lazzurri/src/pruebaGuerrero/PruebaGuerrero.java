package pruebaGuerrero;
import modelo.Guerrero;

public class PruebaGuerrero {
	
	public static void main(String[] args) {
		 Guerrero guerrero1 = new Guerrero("Guerrero1");
	        System.out.println("Nombre del guerrero: " + guerrero1.getNombre());
	        System.out.println("Vitalidad: " + guerrero1.getVitalidad());
	        System.out.println("Armadura: " + guerrero1.getArmadura());

	        guerrero1.mover(10.5, 5.2);
	        System.out.println("Posicion X: " + guerrero1.getX());
	        System.out.println("Posicion Y: " + guerrero1.getY());

	        guerrero1.recibirDmg(200);
	        System.out.println("Vitalidad despues de recibir danio: " + guerrero1.getVitalidad());
	        System.out.println("Armadura despues de recibir danio: " + guerrero1.getArmadura());

	        Guerrero guerrero2 = new Guerrero("Guerrero2", 100.0, 200.0);
	        System.out.println("Nombre del guerrero: " + guerrero2.getNombre());
	        System.out.println("Vitalidad: " + guerrero2.getVitalidad());
	        System.out.println("Armadura: " + guerrero2.getArmadura());
	        System.out.println("Posición X: " + guerrero2.getX());
	        System.out.println("Posición Y: " + guerrero2.getY());
	
	}

}
