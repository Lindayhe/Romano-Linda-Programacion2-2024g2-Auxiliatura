package math;

public class Joyero {
    private int[][] original;
    private int N;

    public Joyero(int[][] joyero) {
        this.original = joyero;
        this.N = joyero.length;
    }


    private int[][] rotarAntihorario(int[][] matriz) {
        int[][] rotada = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rotada[N - j - 1][i] = matriz[i][j];
            }
        }
        return rotada;
    }

   
    public int contarRotaciones() {
        int[][] matrizActual = rotarAntihorario(original); // Rotación inicial

        for (int rotaciones = 1; rotaciones <= 3; rotaciones++) {
            if (esIgual(matrizActual, original)) {
                return rotaciones;
            }
            matrizActual = rotarAntihorario(matrizActual);
        }

      
        return 0;
    }

    private boolean esIgual(int[][] a, int[][] b) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

