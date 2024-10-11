package Ejercicio3;

public abstract class Animal {
 private String nombre;
 private int edad;
 private double peso; // Atributo extra

 public Animal(String nombre, int edad, double peso) {
     this.nombre = nombre;
     this.edad = edad;
     this.peso = peso; // Inicializamos el nuevo atributo 
 }

 public abstract void hacerSonido();

 public void mostrarInfo() {
     System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Peso: " + peso + " kg");
 }
}
