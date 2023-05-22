package modelo;

public class Persona {
	public String nombre;
	public int edad;
	public String email;
	
	public Persona(String nombre, int edad, String email) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}
	
	public boolean soyMayor() {
		return (this.edad > 18) ? true:false;
	}
	
	public int repeticionDeLetra(char letra){
		int contador=0;
		for(int i=0; i<this.nombre.length(); i++) {
			if(this.nombre.charAt(i)==letra)
				contador++;
		}
		return contador;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", email=" + email + "]";
	}
	
	
	
	
	
	

}
