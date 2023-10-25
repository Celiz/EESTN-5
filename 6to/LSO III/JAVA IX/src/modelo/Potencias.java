    package modelo;

    public class Potencias {
        public static void main(String[] args) {
            if (args.length != 2) {
                System.out.println("Debe proporcionar exactamente 2 argumentos: a y b.");
                return;
            }

            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            int[][] matriz = new int[a][b];

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if(i == 0) matriz[i][j] = j+1; 
                    else matriz[i][j] = (int) Math.pow(i + 1, j + 1);            		
                }
            }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }