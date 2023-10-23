package modelo;
import modelo.Buzo;
import modelo.Gorro;
import modelo.Remera;

public class Prueba {

	public static void main(String[] args) {

	        Remera remera1 = new Remera(104, 110, "Negro", "S");

	        

	        Buzo buzo1 = new Buzo(202, 10.00,"Azul", "M");


	        Gorro gorro1 = new Gorro(303, 35.5, "Rojo");

	        System.out.println("Remeras:");
	       
	        remera1.imprimir();

	        System.out.println("\nBuzos:");
	        buzo1.imprimir();
	       

	        System.out.println("\nGorros:");
	        gorro1.imprimir();
	       
	        
	        Remera remera2 = new Remera(104, 110, "Negro", "S");
	        System.out.println("\nRemera1 es igual a Remera4? " + remera1.equals(remera2));
	        System.out.println("Remera es igual a Remera5 (usando ==)? " + (remera1 == remera2));

	        // Comparación con el operador == después de asignar la referencia
	        Remera remera3 = remera2;
	        System.out.println("\nRemera5 es igual a Remera6? " + remera2.equals(remera3));
	        System.out.println("Remera5 es igual a Remera6 (usando ==)? " + (remera2 == remera3));

	}

}
