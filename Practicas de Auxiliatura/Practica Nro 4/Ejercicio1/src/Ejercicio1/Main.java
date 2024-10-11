package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        CartaNumero cartaNumero = new CartaNumero(7, "Corazones");
        cartaNumero.mostrarCarta();
        cartaNumero.jugar();

        CartaFigura cartaFigura = new CartaFigura(11, "Diamantes", "J");
        cartaFigura.mostrarCarta();
        cartaFigura.jugar();

        CartaEspecial cartaEspecial = new CartaEspecial(10, "Picas", "Doble Turno");
        cartaEspecial.mostrarCarta();
        cartaEspecial.jugar();
        cartaEspecial.realizarAccion();

        CartaDesactivable cartaDesactivable = new CartaDesactivable(13, "Tréboles", "Eliminar oponente");
        cartaDesactivable.mostrarCarta();
        cartaDesactivable.jugar();
        cartaDesactivable.realizarAccion();
        cartaDesactivable.desactivar();
    }
}
//este ejercicio ya tiene lo que pide el ejercicio 4 y 5 