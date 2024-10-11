package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Hyundai", "Kona", 250, 1500);
        Moto moto = new Moto("Yamaha", "R1", 300, 200);

        coche.mostrarInfo();
        coche.acelerar();

        moto.mostrarInfo();
        moto.acelerar();
        moto.activarTurbo();
        moto.realizarDerrape();
    }
}
//este ejercicio ya tiene lo que pide el ejercicio 4 y 5 