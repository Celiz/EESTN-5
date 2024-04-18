package punto3;

public class Test {
    public static void main(String[] args) {
        DestructorEstelar destructor = new DestructorEstelar(10.0, 20.0, 500);
        destructor.setNombre("Destructor I");

      
        CazaLigero caza = new CazaLigero(50.0, 30.0);
        caza.setNombre("Caza X");

        System.out.println("Nave inicial - Destructor Estelar:");
        System.out.println(destructor);
        System.out.println("Nave inicial - Caza Ligero:");
        System.out.println(caza);

        destructor.mueve(5.0, 5.0);
        caza.mueve(10.0, -5.0);

        System.out.println("\nNave después de mover - Destructor Estelar:");
        System.out.println(destructor);
        System.out.println("Nave después de mover - Caza Ligero:");
        System.out.println(caza);

        System.out.println("\nAtaque del Destructor Estelar al Caza Ligero:");
        destructor.ataca(caza);
        System.out.println("Energía del Caza Ligero después del ataque: " + caza.getEnergia());

        System.out.println("\nAtaque del Caza Ligero al Destructor Estelar:");
        caza.ataca(destructor);
        System.out.println("Energía del Destructor Estelar después del ataque: " + destructor.getEnergia());
    }
}
