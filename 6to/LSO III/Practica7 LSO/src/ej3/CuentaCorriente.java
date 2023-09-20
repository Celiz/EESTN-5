package ej3;

public class CuentaCorriente {
    private Persona titular;
    private int nroCuenta;
    private double saldo;


    public CuentaCorriente(Persona titular, int nroCuenta, double saldo) {
        this.titular = titular;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(Persona titular, int nroCuenta) {
        this.titular = titular;
        this.nroCuenta = nroCuenta;
        this.saldo = 0.0;
    }

   
    public Persona getTitular() {
        return titular;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double monto) {
        saldo += monto;
        return saldo;
    }

  
    public double extraer(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente.");
        }
        return saldo;
    }

  
    public void imprimirDatos() {
        System.out.println("Numero de cuenta: " + nroCuenta);
        System.out.println("Titular: " + titular.getNombre() + " " + titular.getApellido() + " (Edad: " + titular.getEdad() + ")");
        System.out.println("Saldo actual: " + saldo);
    }


    public boolean equals(CuentaCorriente otraCuenta) {
        return this.nroCuenta == otraCuenta.getNroCuenta();
    }
}