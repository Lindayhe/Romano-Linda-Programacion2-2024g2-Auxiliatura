package Ejercicio3;

//Oveja.java
public class Oveja extends Animal implements Productor, Comestible {
 public Oveja(String nombre, int edad, double peso) {
     super(nombre, edad, peso);
 }

 @Override
 public void hacerSonido() {
     System.out.println("La oveja hace beeeEEEEeeeeEEEee!");
 }

 @Override
 public void producir() {
     System.out.println("La oveja está produciendo lana.");
 }

 @Override
 public void comer() {
     System.out.println("La oveja está comiendo heno."); //se implementa la ueva interfaz
 }
}
