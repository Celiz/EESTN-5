package modelo2;

public class Usuario {
    private String nombre;
    private String contrasena;

    public Usuario(String nombre, String contrasena) throws NombreInvalidoException, ContrasenaInvalidaException {
        setNombre(nombre);
        setContrasena(contrasena);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws NombreInvalidoException {
        if (nombre != null && nombre != "") {
            this.nombre = nombre;
        } else {
            throw new NombreInvalidoException("Nombre no valido: debe ser distinto de null y no estar vacío.");
        }
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) throws ContrasenaInvalidaException {
        if (contrasena != null && contrasena != "" ) {
            this.contrasena = contrasena;
        } else {
            throw new ContrasenaInvalidaException("Contraseña no válida: debe tener más de 6 caracteres y comenzar con una letra.");
        }
    }
}
