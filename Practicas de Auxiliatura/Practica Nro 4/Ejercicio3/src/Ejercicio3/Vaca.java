package Ejercicio3;

public class Vaca extends Animal implements Productor, Comestible {
 public Vaca(String nombre, int edad, double peso) {
     super(nombre, edad, peso);
 }

 @Override
 public void hacerSonido() {
     System.out.println("La vaca hace muuuuuuuuuuuuuuu!");
 }

 @Override
 public void producir() {
     System.out.println("La vaca está produciendo leche.");
 }

 @Override
 public void comer() {
     System.out.println("La vaca está comiendo pasto."); //se esta implementando una nueva interfaz que nos dice en el ejercicio4
 }
}
