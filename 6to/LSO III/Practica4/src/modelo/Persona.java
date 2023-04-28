package modelo;

public class Persona {
private String nombre;
private String apellido;
private int edad;
private String ocupacion;


public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}

public String getOcupacion() {
    return ocupacion;
}

public void setOcupacion(String ocupacion) {
    this.ocupacion = ocupacion;
}


public String misDatos() {
	String datos = "";
	datos = "Apellido: " +this.getApellido() + " Nombre: "+this.getNombre() + " Edad: "+this.getEdad() + " Ocupacion: "+this.getOcupacion();
	return datos;
}

}

	
	  
	
	  
	
	

