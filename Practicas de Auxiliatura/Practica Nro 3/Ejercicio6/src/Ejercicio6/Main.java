package Ejercicio6;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Zombie zombie = new Zombie("Zombie Cubeta", 100, random.nextInt(10, 21)); 
        Vampiro vampiro = new Vampiro("Vampiro Stevan", 100, random.nextInt(10, 21)); 
        Jefe jefe = new Jefe("Jefe Malvado 1", 150, random.nextInt(15, 31), 2.0); 

        jefe.hablar();

        while (zombie.estaVivo() && vampiro.estaVivo() && jefe.estaVivo()) {
            int dañoZ = zombie.atacar();
            jefe.recibirDaño(dañoZ);
            System.out.println(zombie.getNombre() + " ataca a " + jefe.getNombre() + " por " + dañoZ + " puntos de daño.");
            System.out.println(jefe.getNombre() + " tiene " + jefe.getPuntosDeVida() + " puntos de vida restantes.\n");

            int dañoV = vampiro.atacar();
            jefe.recibirDaño(dañoV);
            System.out.println(vampiro.getNombre() + " ataca a " + jefe.getNombre() + " por " + dañoV + " puntos de daño.");
            System.out.println(jefe.getNombre() + " tiene " + jefe.getPuntosDeVida() + " puntos de vida restantes.\n");

            int dañoJ = jefe.atacar();
            zombie.recibirDaño(dañoJ);
            System.out.println(jefe.getNombre() + " ataca a " + zombie.getNombre() + " por " + dañoJ + " puntos de daño.");
            System.out.println(zombie.getNombre() + " tiene " + zombie.getPuntosDeVida() + " puntos de vida restantes.\n");

            dañoJ = jefe.atacar();
            vampiro.recibirDaño(dañoJ);
            System.out.println(jefe.getNombre() + " ataca a " + vampiro.getNombre() + " por " + dañoJ + " puntos de daño.");
            System.out.println(vampiro.getNombre() + " tiene " + vampiro.getPuntosDeVida() + " puntos de vida restantes.\n");

            System.out.println("-------------------------");
        }

        if (!zombie.estaVivo()) {
            System.out.println(zombie.getNombre() + " ha sido derrotado.");
        }
        if (!vampiro.estaVivo()) {
            System.out.println(vampiro.getNombre() + " ha sido derrotado.");
        }
        if (!jefe.estaVivo()) {
            System.out.println(jefe.getNombre() + " ha sido derrotado.");
        }
    }
}
