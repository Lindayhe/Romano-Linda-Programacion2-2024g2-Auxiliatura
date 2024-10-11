package Ejercicio1;

public class CartaDesactivable extends CartaEspecial implements Desactivable {

    public CartaDesactivable(int valor, String palo, String efecto) {
        super(valor, palo, efecto);
    }

    @Override
    public void desactivar() {
        System.out.println("Carta desactivada: " + valor + " de " + palo);
    }
}
