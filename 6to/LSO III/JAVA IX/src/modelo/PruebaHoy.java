package modelo;

public class PruebaHoy {
    public static void main(String[] args) {
        Hoy fecha1 = new Hoy(10, 3, 2023);
        Hoy fecha2 = new Hoy();
        fecha2.setDia(11);
        fecha2.setMes(3);
        fecha2.setAño(2023);

        System.out.println("Fecha1: " + fecha1);
        System.out.println("Fecha2: " + fecha2);

        fecha2.setDia(30);
        System.out.println("Fecha2: " + fecha2);

        if (fecha1.equals(fecha2)) {
            System.out.println("Las fechas son iguales.");
        } else {
            System.out.println("Las fechas son diferentes.");
        }
    }
}