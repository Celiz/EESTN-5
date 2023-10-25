package modelo;

public class Funciones {
    private int a;
    private int b;
    private int x;
    private int n;

    public Funciones(int a, int b, int x, int n) {
        this.a = a;
        this.b = b;
        this.x = x;
        this.n = n;
    }

    public void multiplos() {
        System.out.printf("Numeros primos múltiplos de %d en el rango de %d a %d:%n", x, a, b);
        for (int num = a; num <= b; num++) {
            if (esPrimo(num) && num % x == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public void pares() {
        System.out.printf("Numeros pares en el rango de %d a %d:%n", a, b);
        int num = (a % 2 == 0) ? a : a + 1;
        while (num <= b) {
            System.out.print(num + " ");
            num += 2;
        }
        System.out.println();
    }

    public void impares() {
        System.out.printf("Numeros impares en el rango de %d a %d:%n", a, b);
        for (int num = a; num <= b; num++) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public void fibonacci() {
        System.out.printf("Serie de Fibonacci de 1 a %d:%n", n);
        int f1 = 1, f2 = 1;
        System.out.print(f1 + " " + f2 + " ");
        for (int i = 3; i <= n; i++) {
            int fn = f1 + f2;
            System.out.print(fn + " ");
            f1 = f2;
            f2 = fn;
        }
        System.out.println();
    }

    private boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;   
    }
}