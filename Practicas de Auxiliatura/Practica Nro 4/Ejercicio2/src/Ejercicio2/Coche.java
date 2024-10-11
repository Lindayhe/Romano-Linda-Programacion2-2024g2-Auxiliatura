package Ejercicio2;

public class Coche extends Vehiculo {

    public Coche(String marca, String modelo, int velocidadMaxima, int peso) {
        super(marca, modelo, velocidadMaxima, peso);
    }

    @Override
    public void acelerar() {
        System.out.println("El coche " + marca + " está acelerando.");
    }
}
