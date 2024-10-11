package Ejercicio2;


public class Main {
 public static void main(String[] args) {
     Personaje heroe = new Personaje("Spirs", 5, 100);

     heroe.mostrarEstado();

     heroe.recibirDaño(60);
     heroe.mostrarEstado();
     heroe.curar();
     heroe.mostrarEstado();

     heroe.agregarItemAlInventario("Armadura");
     heroe.agregarItemAlInventario("Escudo");
     heroe.mostrarEstado();
 }
}
