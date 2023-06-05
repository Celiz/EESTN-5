package modelo;

public class Guerrero {
	private String nombre;
	private Posicion posicion;
	private Arma arma;
	private Armadura armadura;
	private double vitalidad;
	
	public Guerrero(String nombre, double x, double y) {
		this.nombre = nombre;
		this.posicion = new Posicion(x, y);
		this.arma = null;
		this.armadura = null;
		this.vitalidad = 100.0;
	}
	
	 public String getNombre() {
	        return nombre;
	    }

	    public double getX() {
	        return posicion.getX();
	    }

	    public double getY() {
	        return posicion.getY();
	    }

	    public void setX(double x) {
	        posicion.setX(x);
	    }

	    public void setY(double y) {
	        posicion.setY(y);
	    }

	    public double mueve(double incrementoX, double incrementoY) {
	        return posicion.mueve(incrementoX, incrementoY);
	    }

	    public double getNivelDanio() {
	    	if (arma != null && arma.getPorcentajeRotura() > 0) {
	            return arma.getNivelDanio();
	        }
	        return 10.0;
	    }

	    public double getNivelDefensa() {
	        if (armadura != null) {
	            return armadura.getNivelDefensa();
	        } else {
	            return 0.0; 
	        }
	    }

	    public double getVitalidad() {
	        return vitalidad;
	    }

	    public void recibirDmg(int cantidad) {
	        if (armadura != null) {
	            if (armadura.getNivelDefensa() >= cantidad) {
	                armadura.reducirDefensa(cantidad);
	            } else {
	                double excesoDmg = cantidad - armadura.getNivelDefensa();
	                armadura.reducirDefensa(armadura.getNivelDefensa());
	                vitalidad -= excesoDmg;
	                if (vitalidad < 0) {
	                    vitalidad = 0;
	                }
	            }
	        } else {
	            vitalidad -= cantidad;
	            if (vitalidad < 0) {
	                vitalidad = 0;
	            }
	        }
	    }

	    public void equiparArma(Arma arma) {
	        this.arma = arma;
	    }

	    public void equiparArmadura(Armadura armadura) {
	        this.armadura = armadura;
	    }

		@Override
		public String toString() {
			return "Guerrero [nombre=" + nombre + ", posicion=" + posicion + ", arma=" + arma + ", armadura=" + armadura
					+ ", vitalidad=" + vitalidad + "]";
		}    
}