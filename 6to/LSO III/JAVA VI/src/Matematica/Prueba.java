package Matematica;

public class Prueba {

	public static void main(String[] args) {
		FiguraGeometrica rectangulo = new Rectangulo();
        FiguraGeometrica circulo = new Circulo();
        FiguraGeometrica triangulo = new Triangulo();
        Circulo cilindro = new Cilindro();

        rectangulo.dibujar();
        circulo.dibujar();
        triangulo.dibujar();
        cilindro.dibujar();
			

	}

}
