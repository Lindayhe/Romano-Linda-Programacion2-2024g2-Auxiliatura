package Ejercicio1;

public class CartaNumero extends Carta {
    public CartaNumero(int valor, String palo) {
        super(valor, palo);
    }

    @Override
    public void jugar() {
        System.out.println("Juegas una carta numérica: " + valor + " de " + palo);
    }
}
