package math;

import java.util.Scanner;
import math.Divisores;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int N = sc.nextInt();
        int[] numeros = new int[N];

       
        for (int i = 0; i < N; i++) {
            numeros[i] = sc.nextInt();
        }

        
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }

        
        int[] divisores = Divisores.calcularDivisores(suma);

        
        System.out.print(suma + " ");
        for (int i = 0; i < divisores.length; i++) {
            System.out.print(divisores[i]);
            if (i < divisores.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(); 
    }
}

