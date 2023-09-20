package ej3;

public class CuentaAhorro extends CuentaCorriente {
    private double interes = 2.5;

    public CuentaAhorro(Persona titular, int nroCuenta, double saldo, double interes) {
        super(titular, nroCuenta, saldo);
        this.interes = interes;
    }

    public CuentaAhorro(Persona titular, int nroCuenta, double interes) {
        super(titular, nroCuenta);
        this.interes = interes;
    }

    public CuentaAhorro(Persona titular, int nroCuenta) {
        super(titular, nroCuenta);
    }

  
    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

   
    public double calcularInteres() {
        return getSaldo() + (getSaldo() * (interes / 100));
    }

  
    public double calcularInteres(double interesEspecifico) {
        return getSaldo() + (getSaldo() * (interesEspecifico / 100));
    }

    public void imprimirDatosCuentaAhorro() {
        System.out.println("Cuenta de Ahorro - Numero de cuenta: " + getNroCuenta());
        System.out.println("Titular: " + getTitular().getNombre() + " " + getTitular().getApellido() + " (Edad: " + getTitular().getEdad() + ")");
        System.out.println("Saldo actual: " + getSaldo());
        System.out.println("Interes: " + interes + "%");
    }
}
