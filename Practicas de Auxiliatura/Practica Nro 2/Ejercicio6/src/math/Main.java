package math;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor para N, porfa: ");
        int N = sc.nextInt();
        sc.close();

       
        Fraccion resultado = FraccionContinua.calcularFraccionContinua(N);

        
        System.out.println(resultado.getNumerador());
    }
}
