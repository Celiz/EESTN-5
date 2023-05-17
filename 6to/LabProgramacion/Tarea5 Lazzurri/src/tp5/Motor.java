package tp5;

public class Motor {
	private String nSerie;
	private double cilindrada;
	private String tipoCombusitble;
	

	public Motor(String nSerie, double cilindrada, String tipoCombusitble) {
		super();
		this.nSerie = nSerie;
		this.cilindrada = cilindrada;
		this.tipoCombusitble = tipoCombusitble;
	}
	public String getnSerie() {
		return nSerie;
	}
	public double getCilindrada() {
		return cilindrada;
	}
	
	public String getTipoCombusitble() {
		return tipoCombusitble;
	}
	
	@Override
	public String toString() {
		return "Motor [nSerie=" + nSerie + ", cilindrada=" + cilindrada + ", tipoCombusitble=" + tipoCombusitble + "]";
	}

	
}
