package math;

import java.util.Scanner;

public class Main {
	//LINDA ROMANO CONDORI

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        DuracionDiscurso duracion = new DuracionDiscurso(N, K);
        
        System.out.println(duracion.calcularDuracionMaxima());
    }
}
