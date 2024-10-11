package Ehercicio4;

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
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre + "\nNivel: " + nivel + "\nPuntos de Vida: " + puntosVida);
    }
}

