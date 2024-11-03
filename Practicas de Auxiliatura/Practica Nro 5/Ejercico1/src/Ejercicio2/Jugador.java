package Ejercicio2;

public class Jugador {
    private String nombre;
    private int puntos;

    public Jugador(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public void aplicarBonificacion(CalculadoraBonificacion calculadora) {
        int bonificacion = calculadora.calcular(puntos);
        puntos += bonificacion;
        System.out.println(nombre + " recibe una bonificación de " + bonificacion + " puntos. Puntos totales :): " + puntos);
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }
}
