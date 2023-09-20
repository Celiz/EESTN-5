package ej2;

public class Test {
    public static void main(String[] args) {
        Camisa camisa1 = new Camisa(25.0, 'R', 42);
        Camisa camisa2 = new Camisa(30.0, 'B', 38);
        Camisa camisa3 = new Camisa(20.0, 'G', 40);
        Camisa camisa4 = new Camisa(35.0, 'W', 44);

        Pedido pedido1 = new Pedido(camisa1, 3);
        Pedido pedido2 = new Pedido(camisa2, 2);
        Pedido pedido3 = new Pedido(camisa3, 5);
        Pedido pedido4 = new Pedido(camisa4, 1);

      
        System.out.println("Precio total del pedido 1: $" + pedido1.getPrecioTotal());
        System.out.println("Precio total del pedido 2: $" + pedido2.getPrecioTotal());
        System.out.println("Precio total del pedido 3: $" + pedido3.getPrecioTotal());
        System.out.println("Precio total del pedido 4: $" + pedido4.getPrecioTotal());
    }
}
