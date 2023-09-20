package unidad1;

public class Prueba {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Celiz", "Matias", 18, 46827673, "6to4ta", 2023);
        Estudiante estudiante2 = new Estudiante("Lopez", "Luca", 18, 45963852, "6to4ta", 2023);
        Estudiante estudiante3 = new Estudiante("Di Mauro", "Tomas", 18, 46879456, "6to4ta", 2023);

        Profesor profesor1 = new Profesor("Pablo", "Abdala", 45, 32879675, 16, 25);
       

        System.out.println("Datos de los estudiantes:");
        System.out.println(estudiante1.misDatos());
        System.out.println(estudiante2.misDatos());
        System.out.println(estudiante3.misDatos());


        System.out.println("Datos del Profesor 1:");
        System.out.println(profesor1.misDatos());
    }
}

