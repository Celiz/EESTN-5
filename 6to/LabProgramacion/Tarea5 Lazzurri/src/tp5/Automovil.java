package tp5;

public class Automovil {
	private String marca;
	private int modelo;
	private Motor motor;
	private Chasis chasis;
	private double precio;
	
	
	
	
	public Automovil(String marca, int modelo, Motor motor, Chasis chasis) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.chasis = chasis;
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
	
	public Chasis getChasis() {
		return chasis;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getTipoCombustible() {
		
		return this.motor.getTipoCombusitble();
		
	}

	public double getCilindrada() {
		return this.motor.getCilindrada();
	}
	
	
	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + ", chasis=" + chasis
				+ ", precio=" + precio + "]";
	}

	
}


	
	
