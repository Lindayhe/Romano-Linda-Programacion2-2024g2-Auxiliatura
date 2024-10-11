package Ejercicio1;


public class CartaFigura extends Carta {
    private String figura;

    public CartaFigura(int valor, String palo, String figura) {
        super(valor, palo);
        this.figura = figura;
    }

    @Override
    public void jugar() {
        System.out.println("Juegas con una carta de figura: " + figura + " de " + palo);
    }

    @Override
    public void mostrarCarta() {
        System.out.println("Carta: " + figura + " de " + palo);
    }
}
