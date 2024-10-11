// en un solo porgrama
package Ejercicio1;

class Personaje {
 private String nombre;
 private int nivel;
 private int puntosDeVida;

 public Personaje(String nombre, int nivel, int puntosDeVida) {
     this.nombre = nombre;
     this.nivel = nivel;
     this.puntosDeVida = puntosDeVida;
 }

 public void mostrarEstado() {
     System.out.println("Nombre: " + nombre + ", Nivel: " + nivel + ", Puntos de vida: " + puntosDeVida);
 }

 public void recibirDaño(int daño) {
     if (daño > 0) {
         puntosDeVida -= daño;
         if (puntosDeVida < 0) {
             puntosDeVida = 0;
         }
         System.out.println(nombre + " ha recibido " + daño + " puntos de daño.");
     }
 }

 public void curar() {
     puntosDeVida += 20;
     System.out.println(nombre + " ha sido curado por 20 puntos :).");
 }
}

class Guerrero extends Personaje {
 public Guerrero(String nombre, int nivel, int puntosDeVida) {
     super(nombre, nivel, puntosDeVida);
 }

 public void atacar() {
     System.out.println("El Guerrero ataca con su espada poderosa.");
 }
}

class Mago extends Personaje {
 public Mago(String nombre, int nivel, int puntosDeVida) {
     super(nombre, nivel, puntosDeVida);
 }

 public void lanzarHechizo() {
     System.out.println("El Mago lanza un poderosisimo hechizo.");
 }
}

public class Main {
 public static void main(String[] args) {
     Guerrero guerrero = new Guerrero("Michel", 8, 70);
     guerrero.mostrarEstado();
     guerrero.recibirDaño(56);
     guerrero.mostrarEstado();
     guerrero.curar();
     guerrero.mostrarEstado();
     guerrero.atacar();

     System.out.println();

     Mago mago = new Mago("Gorge", 9, 86);
     mago.mostrarEstado();
     mago.recibirDaño(46);
     mago.mostrarEstado();
     mago.curar();
     mago.mostrarEstado();
     mago.lanzarHechizo();
 }
}

