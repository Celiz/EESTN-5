package modelo;

public class Automovil {
	private String marca;
	private int modelo;
	private Motor motor;
	private String patente;
	private double precio;
	

	public Automovil(String marca, int modelo, Motor motor, String patente, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.patente = patente;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}
	
	public int getModelo() {
		return modelo;
	}
	
	public Motor getMotor() {
		return motor;
	}
	
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getPatente() {
		return patente;
	}
	
	public String getMarcaMotor() {
		return this.motor.marcaMotor;
	}
	
	public int getNumeroMotor() {
		return this.motor.numeroMotor;
	}
	
	public int getCilindrada() {
		return this.motor.cilindrada;
	}
	
	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + ", patente=" + patente
				+ ", precio=" + precio + "]";
	}

}
