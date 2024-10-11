package Ehercicio4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        Mago mago = new Mago("Mago Supremo", rand.nextInt(10) + 1, 100, 50);
        Guerrero guerrero = new Guerrero("Guerrero Adrien", rand.nextInt(10) + 1, 100, 30);

        System.out.println("¡Comienza el combate entre " + mago.getNombre() + " y " + guerrero.getNombre() + "!\n");

        while (mago.getPuntosVida() > 0 && guerrero.getPuntosVida() > 0) {
            int dañoMago = rand.nextInt(11) + 10; 
            System.out.println(mago.getNombre() + " ataca usando lanzarHechizo...");
            mago.lanzarHechizo();
            guerrero.recibirDaño(dañoMago);

            System.out.println("\nEstado después del ataque del Mago:");
            mago.mostrarEstado();
            guerrero.mostrarEstado();
            System.out.println();

            if (guerrero.getPuntosVida() <= 0) {
                System.out.println(guerrero.getNombre() + " ha sido derrotado. ¡" + mago.getNombre() + " gana el combate!");
                break;
            }

            int dañoGuerrero = rand.nextInt(11) + 10;  
            System.out.println(guerrero.getNombre() + " ataca usando atacar...");
            guerrero.atacar();
            mago.recibirDaño(dañoGuerrero);

            System.out.println("\nEstado después del ataque del Guerrero:");
            mago.mostrarEstado();
            guerrero.mostrarEstado();
            System.out.println();

            if (mago.getPuntosVida() <= 0) {
                System.out.println(mago.getNombre() + " ha sido derrotado. ¡" + guerrero.getNombre() + " gana el combate!");
                break;
            }
        }
    }
}

