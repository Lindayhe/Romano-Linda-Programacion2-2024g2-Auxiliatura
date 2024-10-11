package Ejercicio7;

import java.util.Random;
import java.util.Scanner;

public class MiniJuego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Elige tu personaje:\n1. Mago\n2. Guerrero");
        int opcion = sc.nextInt();

        Personaje jugador;
        if (opcion == 1) {
            jugador = new Mago("Merlin", random.nextInt(10) + 1, 100, 50);
        } else {
            jugador = new Guerrero("Thor", random.nextInt(10) + 1, 100, 75);
        }

        Enemigo enemigo1 = new Zombie("Zombie Thriller", 80, 15);
        Enemigo enemigo2 = new Vampiro("Vampiro Dracula", 70, 20);
        Jefe jefeFinal = new Jefe("Dragón Trageryan", 150, 30, 2.5);

        System.out.println("¡Que Comienza la batalla!");

        while (jugador.estaVivo() && (enemigo1.estaVivo() || enemigo2.estaVivo() || jefeFinal.estaVivo())) {
            System.out.println("\nTu turno:");
            System.out.println("1. Atacar enemigo 1 (Zombie)");
            System.out.println("2. Atacar enemigo 2 (Vampiro)");
            System.out.println("3. Atacar jefe final");
            System.out.println("4. Curarse");

            int accion = sc.nextInt();
            switch (accion) {
                case 1:
                    atacar(jugador, enemigo1);
                    break;
                case 2:
                    atacar(jugador, enemigo2);
                    break;
                case 3:
                    atacar(jugador, jefeFinal);
                    break;
                case 4:
                    jugador.curar();
                    break;
                default:
                    System.out.println("Acción no válida.");
            }

            if (enemigo1.estaVivo()) {
                recibirAtaque(jugador, enemigo1);
            }
            if (enemigo2.estaVivo()) {
                recibirAtaque(jugador, enemigo2);
            }
            if (jefeFinal.estaVivo()) {
                recibirAtaque(jugador, jefeFinal);
            }

            jugador.mostrarEstado();
        }

        if (jugador.estaVivo()) {
            System.out.println("¡Has derrotado a todos los enemigos!");
        } else {
            System.out.println("Has sido derrotado.........intentalo de nuevo");
        }
    }

    public static void atacar(Personaje jugador, Enemigo enemigo) {
        Random random = new Random();
        int daño = random.nextInt(11) + 10;
        enemigo.recibirDaño(daño);
        System.out.println(jugador.getNombre() + " ha atacado a " + enemigo.getNombre() + " causando " + daño + " puntos de daño.");
    }

    public static void recibirAtaque(Personaje jugador, Enemigo enemigo) {
        int daño = enemigo.atacar();
        jugador.recibirDaño(daño);
        System.out.println(enemigo.getNombre() + " ha atacado a " + jugador.getNombre() + " causando " + daño + " puntos de daño.");
    }
}
