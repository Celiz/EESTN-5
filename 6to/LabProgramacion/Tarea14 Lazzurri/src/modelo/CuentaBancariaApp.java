package modelo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CuentaBancariaApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cuenta Bancaria");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout());

        CuentaBancaria cuenta = new CuentaBancaria(1000.0);

        // Panel para el saldo
        JPanel saldoPanel = new JPanel();
        saldoPanel.setLayout(new FlowLayout());

        // Etiqueta de saldo
        JLabel saldoLabel = new JLabel("Saldo: " + cuenta.getSaldo());
        saldoPanel.add(saldoLabel);

        // Campo de depósito
        JTextField depositoField = new JTextField(10);
        JButton depositarButton = new JButton("Depositar");

        // Campo de extracción
        JTextField extraccionField = new JTextField(10);
        JButton extraerButton = new JButton("Extraer");

        frame.add(saldoPanel);
        frame.add(depositoField);
        frame.add(depositarButton);
        frame.add(extraccionField);
        frame.add(extraerButton);

        depositarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double cantidad = Double.parseDouble(depositoField.getText());
                    cuenta.depositar(cantidad);
                    saldoLabel.setText("Saldo: " + cuenta.getSaldo());
                } catch (DepositoInvalidoException ex) {
                    JOptionPane.showMessageDialog(frame, "Depósito inválido. Cantidad: " + ex.getCantidadInvalida(), "Error", JOptionPane.ERROR_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Ingresa una cantidad válida", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        extraerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double cantidad = Double.parseDouble(extraccionField.getText());
                    cuenta.extraer(cantidad);
                    saldoLabel.setText("Saldo: " + cuenta.getSaldo());
                } catch (ExtraccionInvalidaException ex) {
                    JOptionPane.showMessageDialog(frame, "Extracción inválida. Cantidad: " + ex.getCantidadInvalida(), "Error", JOptionPane.ERROR_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Ingresa una cantidad válida", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}