package modelo;

public class CajaAhorro extends CuentaBancaria {
	
	private static final int MAX_EXTRACCIONES_MENSUALES = 5;
    private int extraccionesRealizadas;

	
public CajaAhorro(String titular) {
	super(titular);
	this.extraccionesRealizadas = 0;
}

@Override
public boolean extraer(double monto) {
	boolean res = false;
    if (extraccionesRealizadas >= MAX_EXTRACCIONES_MENSUALES || monto > saldo) {
        res = false;
    }
    saldo -= monto;
    extraccionesRealizadas++;
    res = true;
    
    return res;
}

@Override
public String toString() {
	return "CajaAhorro [extraccionesRealizadas=" + extraccionesRealizadas + "]";
}

}
