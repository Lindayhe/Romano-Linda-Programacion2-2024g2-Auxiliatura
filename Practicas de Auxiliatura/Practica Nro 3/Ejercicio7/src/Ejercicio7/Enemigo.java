package Ejercicio7;

public class Enemigo {
    private String nombre;
    private int puntosVida;
    private int dañoBase;

    public Enemigo(String nombre, int puntosVida, int dañoBase) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.dañoBase = dañoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public int atacar() {
        return dañoBase;
    }

    public void recibirDaño(int daño) {
        puntosVida -= daño;
        if (puntosVida < 0) {
            puntosVida = 0;
        }
        System.out.println(nombre + " ha recibido " + daño + " puntos de daño.");
    }

    public boolean estaVivo() {
        return puntosVida > 0;
    }
}

