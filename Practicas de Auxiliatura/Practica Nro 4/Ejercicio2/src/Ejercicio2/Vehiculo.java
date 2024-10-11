package Ejercicio2;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int velocidadMaxima;
    protected int peso; // Atributo extra

    public Vehiculo(String marca, String modelo, int velocidadMaxima, int peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.peso = peso;
    }

    public abstract void acelerar();

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Velocidad Máxima: " + velocidadMaxima + " km/h, Peso: " + peso + " kg");
    }
}
