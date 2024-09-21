package borderlands;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Botin> botinObtenido = new ArrayList<>();
        String continuar;

        do {
            Botin botin = GeneradorDeBotin.generarBotin();
            System.out.println("\n¡Has obtenido un nuevo botín, Felicidades :)!");
            System.out.println(botin);

            botinObtenido.add(botin);

            System.out.println("\nBueno......¿Deseas seguir enfrentándote a enemigos para obtener más botín?????? (sí/no)'si es sí con acento porfa'");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("sí"));

        System.out.println("\nEl Resumen del botín obtenido seria...:");
        for (Botin botin : botinObtenido) {
            System.out.println(botin);
            System.out.println();
        }

        scanner.close();
    }
}

