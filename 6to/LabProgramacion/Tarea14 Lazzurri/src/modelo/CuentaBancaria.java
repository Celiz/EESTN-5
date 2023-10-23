package modelo;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void depositar(double cantidad) throws DepositoInvalidoException {
        if (cantidad <= 0) {
            throw new DepositoInvalidoException(cantidad);
        }
        saldo += cantidad;
    }

    public void extraer(double cantidad) throws ExtraccionInvalidaException {
        if (cantidad <= 0 || cantidad > saldo) {
            throw new ExtraccionInvalidaException(cantidad);
        }
        saldo -= cantidad;
    }

    public double getSaldo() {
        return saldo;
    }
}
