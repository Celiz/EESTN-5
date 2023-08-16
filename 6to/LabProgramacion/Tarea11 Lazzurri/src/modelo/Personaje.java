package modelo;

public class Personaje {
	private String nombre;
	private int fuerza;
	private int velocidad;
	private int resistenciaMagica;
	private int armadura;
	
	public Personaje(String nombre, int fuerza, int velocidad, int resistenciaMagica, int armadura) {
		super();
		this.nombre = nombre;
		this.fuerza = fuerza;
		this.velocidad = velocidad;
		this.resistenciaMagica = resistenciaMagica;
		this.armadura = armadura;
	}

	public String getNombre() {
		return nombre;
	}

	public int getFuerza() {
		return fuerza;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public int getResistenciaMagica() {
		return resistenciaMagica;
	}

	public int getArmadura() {
		return armadura;
	}

	public Personaje enfrentarFuerza(Personaje otro) {
		Personaje ganador = null;
		if(this.fuerza > otro.fuerza)
			ganador = this;
		else if(this.fuerza < otro.fuerza)
			ganador = otro;
		return ganador;		
	}

	public Personaje enfrentarVelocidad(Personaje otro) {
		Personaje ganador = null;
		if(this.velocidad > otro.velocidad)
			ganador = this;
		else if(this.velocidad < otro.velocidad)
			ganador = otro;
		return ganador;		
	}

	public Personaje enfrentarResistenciaMagica(Personaje otro) {
		Personaje ganador = null;
		if(this.resistenciaMagica > otro.resistenciaMagica)
			ganador = this;
		else if(this.resistenciaMagica < otro.resistenciaMagica)
			ganador = otro;
		return ganador;
	}

	public Personaje enfrentarArmadura(Personaje otro) {
		Personaje ganador = null;
		if(this.armadura > otro.armadura)
			ganador = this;
		else if(this.armadura < otro.armadura)
			ganador = otro;	

		return ganador;
	}
	
	@Override
	public String toString() {
		return "Nombre=" + nombre + ", fuerza=" + fuerza + ", velocidad=" + velocidad
				+ ", resistenciaMagica=" + resistenciaMagica + ", Armadura=" + armadura;
	}


		

	
}


