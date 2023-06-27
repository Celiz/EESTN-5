package prueba;
import modelo.CajaAhorro;
import modelo.CuentaCorriente;
import modelo.CuentaUniversitaria;

public class Prueba{
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente("Juan", 2000);
        cc.depositar(5000);
        if (cc.extraer(7000)) {
            System.out.println("Extraccion exitosa. Saldo cuenta corriente: " + cc.getSaldo());
        }

        CajaAhorro ca = new CajaAhorro("María");
        ca.depositar(3000);
        if (ca.extraer(2000)) {
            System.out.println("Extraccion exitosa. Saldo caja de ahorro: " + ca.getSaldo());
        }
        if (ca.extraer(1000)) {
            System.out.println("Extraccion exitosa. Saldo caja de ahorro: " + ca.getSaldo());
        }
        if (ca.extraer(500)) {
            System.out.println("Extraccion exitosa. Saldo caja de ahorro: " + ca.getSaldo());
        }
        if (!ca.extraer(500)) {
            System.out.println("Extraccion no permitida. Saldo caja de ahorro: " + ca.getSaldo());
        }

        CuentaUniversitaria cu = new CuentaUniversitaria("Pedro");
        cu.depositar(5000);
        if (cu.extraer(800)) {
            System.out.println("Extraccion exitosa. Saldo cuenta universitaria: " + cu.getSaldo());
        }
        if (!cu.extraer(300)) {
            System.out.println("Extraccion no permitida. Saldo cuenta universitaria: " + cu.getSaldo());
        }
    }
}