package punto2;

public class Empleado {
	 private String nombre;
	    private String documento;
	    private Domicilio domicilio;

	    public Empleado(String nombre, String documento, Domicilio domicilio) {
	        this.nombre = nombre;
	        this.documento = documento;
	        this.domicilio = domicilio;
	    }
	    
	    public String getNombre() {
			return nombre;
		}

		public String getDocumento() {
			return documento;
		}

		public Domicilio getDomicilio() {
			return domicilio;
		}

		public double calcularSueldo() {
	        return 0; 
	    }

		@Override
		public String toString() {
			return "Empleado [nombre=" + nombre + ", documento=" + documento + ", domicilio=" + domicilio + "]";
		}
				
}
