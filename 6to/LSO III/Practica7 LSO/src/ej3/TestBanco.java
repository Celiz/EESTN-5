package ej3;

public class TestBanco {
    public static void main(String[] args) {
       
        Persona persona1 = new Persona("Juan", "Perez", 30);
        Persona persona2 = new Persona("Ana", "Gomez", 25);

       
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(persona1, 101, 1000.0);
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente(persona2, 102);

   
        CuentaAhorro cuentaAhorro1 = new CuentaAhorro(persona1, 201, 500.0, 3.0);
        CuentaAhorro cuentaAhorro2 = new CuentaAhorro(persona2, 202, 2.0);
        CuentaAhorro cuentaAhorro3 = new CuentaAhorro(persona2, 203);

       
        cuentaCorriente1.imprimirDatos();
        cuentaCorriente2.imprimirDatos();
        cuentaAhorro1.imprimirDatosCuentaAhorro();
        cuentaAhorro2.imprimirDatosCuentaAhorro();
        cuentaAhorro3.imprimirDatosCuentaAhorro();

        
        System.out.println("Comparacion de cuentas corrientes:");
        boolean sonIgualesCC = cuentaCorriente1.equals(cuentaCorriente2);
        System.out.println("CuentaCorriente1 y CuentaCorriente2 son iguales: " + sonIgualesCC);

        System.out.println("\nComparacion de cuentas de ahorro:");
        boolean sonIgualesCA1 = cuentaAhorro1.equals(cuentaAhorro2);
        boolean sonIgualesCA2 = cuentaAhorro2.equals(cuentaAhorro3);
        System.out.println("CuentaAhorro1 y CuentaAhorro2 son iguales: " + sonIgualesCA1);
        System.out.println("CuentaAhorro2 y CuentaAhorro3 son iguales: " + sonIgualesCA2);

     
        CuentaAhorro nuevaCuentaAhorro = new CuentaAhorro(persona2, 202, 4.0);


        boolean sonIgualesNuevaCA = cuentaAhorro2.equals(nuevaCuentaAhorro);
        System.out.println("\nComparacion de la nueva CuentaAhorro y CuentaAhorro2: " + sonIgualesNuevaCA);

        double nuevoSaldo = cuentaAhorro1.calcularInteres(15.5);
        System.out.println("\nNuevo saldo de CuentaAhorro1 con interes del 15.5%: " + nuevoSaldo);
    }
}