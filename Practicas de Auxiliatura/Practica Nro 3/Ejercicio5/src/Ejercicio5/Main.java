package Ejercicio5;


public class Main {

    public static void main(String[] args) {
        Enemigo zombie = new Zombie("Zombie cubeta", 40, 10);
        Enemigo vampiro = new Vampiro("Vampiro killer", 60, 15);

        System.out.println(zombie.getNombre() + " tiene " + zombie.getPuntosVida() + " puntos de vida.");
        System.out.println(vampiro.getNombre() + " tiene " + vampiro.getPuntosVida() + " puntos de vida.");

        int dañoZombie = zombie.atacar();
        vampiro.recibirDaño(dañoZombie);
        System.out.println(zombie.getNombre() + " ataca e inflige " + dañoZombie + " de daño.");

        int dañoVampiro = vampiro.atacar();
        zombie.recibirDaño(dañoVampiro);
        System.out.println(vampiro.getNombre() + " ataca e inflige " + dañoVampiro + " de daño.");

        System.out.println(zombie.getNombre() + " tiene " + zombie.getPuntosVida() + " puntos de vida.");
        System.out.println(vampiro.getNombre() + " tiene " + vampiro.getPuntosVida() + " puntos de vida.");
    }
}
