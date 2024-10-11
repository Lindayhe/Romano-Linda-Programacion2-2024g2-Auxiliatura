package Ejercicio1;

public class CartaEspecial extends Carta implements Accionable {
    private String efecto;

    public CartaEspecial(int valor, String palo, String efecto) {
        super(valor, palo);
        this.efecto = efecto;
    }

    @Override
    public void jugar() {
        System.out.println("Carta especial jugada: " + valor + " de " + palo + ". Efecto: " + efecto);
    }

    @Override
    public void realizarAccion() {
        System.out.println("Acción especial: " + efecto);
    }
}
