package modelo;

public class IncrementoImposibleException  extends Exception {
    
	private static final long serialVersionUID = 1L;
	private Personaje personaje;
	private double maxDistanciaSoportada;
    private double distanciaPretendida;

    public IncrementoImposibleException(double maxDistanciaSoprtada, double distanciaPretendida, double maxDistanciaSoportada) {
        this.maxDistanciaSoportada = maxDistanciaSoportada;
        this.distanciaPretendida = distanciaPretendida;
    }

    public double getMaxDistanciaSoportada() {
        return maxDistanciaSoportada;
    }

    public double getDistanciaPretendida() {
        return distanciaPretendida;
    }

	public void setMaxDistanciaSoportada(double maxDistanciaSoportada) {
		this.maxDistanciaSoportada = maxDistanciaSoportada;
	}
	
	public Personaje getPersonaje() {
        return personaje;
    }
}
