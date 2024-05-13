
abstract class Jugador {
	 	private String nombre;
	    private double velocidad;
	    private double potencia;

	    public Jugador(String nombre, double velocidad, double potencia) {
	        this.nombre = nombre;
	        this.velocidad = velocidad;
	        this.potencia = potencia;
	    }
	    
	    

	    public String getNombre() {
			return nombre;
		}



		public double getVelocidad() {
			return velocidad;
		}



		public double getPotencia() {
			return potencia;
		}



		public abstract double indiceDefensa();
	    public abstract double indiceAtaque();

}
