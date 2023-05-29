package tp5;

public class Chasis {
	private String nChasis;
	private double Peso;
	
	public Chasis(String nChasis, double peso) {
		super();
		this.nChasis = nChasis;
		this.Peso = peso;
	}

	public String getnChasis() {
		return nChasis;
	}
	
	public double getPeso() {
		return Peso;
	}

	@Override
	public String toString() {
		return "Chasis [nChasis=" + nChasis + ", Peso=" + Peso + "]";
	}
	
	
	
}
