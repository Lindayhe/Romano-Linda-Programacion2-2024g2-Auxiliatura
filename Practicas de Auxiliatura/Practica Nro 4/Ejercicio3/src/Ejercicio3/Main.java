package Ejercicio3;

//Main.java
public class Main {
 public static void main(String[] args) {
     Animal vaca = new Vaca("Vaca Loca", 3, 450.0);
     Animal oveja = new Oveja("Oveja Negra", 2, 70.0);

     vaca.mostrarInfo();
     vaca.hacerSonido();
     ((Productor) vaca).producir(); 
     ((Comestible) vaca).comer(); 

     oveja.mostrarInfo();
     oveja.hacerSonido();
     ((Productor) oveja).producir();
     ((Comestible) oveja).comer(); 
 }
}
// este ejercicio ya tiene lo que pide el ejercicio 4 y 5 