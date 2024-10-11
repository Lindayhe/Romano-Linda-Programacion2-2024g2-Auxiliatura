package Ejercicio7;

public class Personaje {
    private String nombre;
    private int nivel;
    private int puntosVida;

    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void recibirDaño(int daño) {
        puntosVida -= daño;
        if (puntosVida < 0) {
            puntosVida = 0;
        }
        System.out.println(nombre + " ha recibido " + daño + " puntos de daño.");
    }

    public void curar() {
        puntosVida += 20;
        System.out.println(nombre + " se ha curado. Puntos de vida: " + puntosVida);
    }

    public boolean estaVivo() {
        return puntosVida > 0;
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre + ", Nivel: " + nivel + ", Puntos de vida: " + puntosVida);
    }
}
