package Ejercicio3;

public class Personaje {
    private String nombre;
    private int nivel;
    private int puntosVida;
    private Inventario inventario;

    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.inventario = new Inventario();  
    }
    public String getNombre() {
        return nombre;
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntos de Vida: " + puntosVida);
        inventario.mostrarItems();
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
        System.out.println(nombre + " ha sido curado. Puntos de Vida actuales: " + puntosVida);
    }

    public void agregarItem(String item) {
        inventario.agregarItem(item);
    }
}
