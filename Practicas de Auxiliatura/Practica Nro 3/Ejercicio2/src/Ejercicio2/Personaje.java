package Ejercicio2;


public class Personaje {
 private String nombre;
 private int nivel;
 private int puntosDeVida;
 private Inventario inventario;

 public Personaje(String nombre, int nivel, int puntosDeVida) {
     this.nombre = nombre;
     this.nivel = nivel;
     this.puntosDeVida = puntosDeVida;
     this.inventario = new Inventario();  
 }

 public void mostrarEstado() {
     System.out.println("Nombre: " + nombre);
     System.out.println("Nivel: " + nivel);
     System.out.println("Puntos de Vida: " + puntosDeVida);
     inventario.mostrarItems();  
 }

 public void recibirDaño(int daño) {
     puntosDeVida -= daño;
     System.out.println(nombre + " ha recibido " + daño + " de daño.");
     if (puntosDeVida <= 0) {
         System.out.println(nombre + " ha sido derrotado.");
         puntosDeVida = 0;
     }
 }

 public void curar() {
     puntosDeVida += 20;
     System.out.println(nombre + " ha sido curado por 20 puntos.");
 }

 public void agregarItemAlInventario(String item) {
     inventario.agregarItem(item);
     System.out.println(item + " ha sido añadido al inventario de " + nombre);
 }
}
