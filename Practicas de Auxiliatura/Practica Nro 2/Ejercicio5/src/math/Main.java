package math;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] joyero = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                joyero[i][j] = sc.nextInt();
            }
        }

        Joyero j = new Joyero(joyero);
        int rotaciones = j.contarRotaciones();
        System.out.println(rotaciones);
    }
}
