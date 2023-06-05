package modelo;

public class Arma {

	private String nombre;
    private double nivelDanioInicial;
    private double porcentajeRotura;

    public Arma(String nombre, double nivelDanioInicial, double porcentajeRotura) {
        this.nombre = nombre;
        this.nivelDanioInicial = nivelDanioInicial;
        this.porcentajeRotura = porcentajeRotura;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNivelDanio() {
        double nivelDanioActual = nivelDanioInicial * (1.0 - porcentajeRotura / 100.0);
        return nivelDanioActual;
    }
    
    public double getPorcentajeRotura() {
    	return porcentajeRotura;
    }

	@Override
	public String toString() {
		return "Arma [nombre=" + nombre + ", nivelDanioInicial=" + nivelDanioInicial + ", porcentajeRotura="
				+ porcentajeRotura + "]";
	}
    
    

}
