package Ejercicio7;

public class Jefe extends Enemigo {
    private double multiplicadorDaño;

    public Jefe(String nombre, int puntosVida, int dañoBase, double multiplicadorDaño) {
        super(nombre, puntosVida, dañoBase);
        this.multiplicadorDaño = multiplicadorDaño;
    }

    public void hablar() {
        System.out.println(getNombre() + " dice: ¡Prepárate para tu fin, insignificante!");
    }

    public int ataqueCritico() {
        int daño = (int) (super.atacar() * multiplicadorDaño);
        System.out.println(getNombre() + " ha lanzado un ataque crítico infligiendo " + daño + " puntos de daño.");
        return daño;
    }
}

