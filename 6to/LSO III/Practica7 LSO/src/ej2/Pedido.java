package ej2;

public class Pedido {
    private Camisa camisaElegida;
    private int cantidadDeCamisas;
    private double precioTotal;
    
    public Pedido(Camisa camisaElegida, int cantidadDeCamisas) {
        this.camisaElegida = camisaElegida;
        this.cantidadDeCamisas = cantidadDeCamisas;
        calcularTotal();
    }

  
    public Camisa getCamisaElegida() {
        return camisaElegida;
    }

    public void setCamisaElegida(Camisa camisaElegida) {
        this.camisaElegida = camisaElegida;
        calcularTotal();
    }

    public int getCantidadDeCamisas() {
        return cantidadDeCamisas;
    }

    public void setCantidadDeCamisas(int cantidadDeCamisas) {
        this.cantidadDeCamisas = cantidadDeCamisas;
        calcularTotal();
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void calcularTotal() {
        if (camisaElegida != null) {
            precioTotal = camisaElegida.getPrecioUnitario() * cantidadDeCamisas;
        } else {
            precioTotal = 0.0;
        }
    }
}