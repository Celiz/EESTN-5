package punto2;

public class Medico extends Empleado {
    private ContratoMedico contrato;
    private int numeroMatricula;

    public Medico(String nombre, String documento, Domicilio domicilio, ContratoMedico contrato, int numeroMatricula) {
        super(nombre, documento, domicilio);
        this.contrato = contrato;
        this.numeroMatricula = numeroMatricula;
    }
    
    public ContratoMedico getContrato() {
		return contrato;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void cambiarContrato(ContratoMedico nuevoContrato) {
        this.contrato = nuevoContrato;
    }

    @Override
    public double calcularSueldo() {
        return contrato.getSueldoMensual();
    }

	@Override
	public String toString() {
		return super.toString() + "Medico [contrato=" + contrato + ", numeroMatricula=" + numeroMatricula + "]";
	}
    
}