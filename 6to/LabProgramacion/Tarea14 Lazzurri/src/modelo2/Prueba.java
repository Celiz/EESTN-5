package modelo2;

public class Prueba {
    public static void main(String[] args) {
        try {
            Usuario usuario1 = new Usuario("Pepe", "Password123");
            System.out.println("Usuario registrado: " + usuario1.getNombre());
        } catch (NombreInvalidoException | ContrasenaInvalidaException e) {
            System.err.println("Error al registrar usuario: " + e.getMessage());
        }

        try {
            Usuario usuario2 = new Usuario("", "Short1");
            System.out.println("Usuario registrado: " + usuario2.getNombre());
        } catch (NombreInvalidoException | ContrasenaInvalidaException e) {
            System.err.println("Error al registrar usuario: " + e.getMessage());
        }
    }
}