package Ejercicio2;


import java.util.ArrayList;
import java.util.List;

public class Inventario {
 private List<String> items;

 public Inventario() {
     items = new ArrayList<>();
 }

 public void agregarItem(String item) {
     items.add(item);
 }

 public void mostrarItems() {
     System.out.println("Inventario:");
     if (items.isEmpty()) {
         System.out.println("No hay ítems en el inventario.");
     } else {
         for (String item : items) {
             System.out.println("- " + item);
         }
     }
 }
}
