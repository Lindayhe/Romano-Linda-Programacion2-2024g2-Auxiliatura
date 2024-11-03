package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Harly", 100);
        Jugador jugador2 = new Jugador("T.O.P.", 150);

        CalculadoraBonificacion bonificacion10 = puntosBase -> (int)(puntosBase * 0.10);
        
        CalculadoraBonificacion bonificacionFija = puntosBase -> 50;
        
        CalculadoraBonificacion bonificacionExtra = puntosBase -> puntosBase > 120 ? 30 : 10;

        jugador1.aplicarBonificacion(bonificacion10);
        jugador1.aplicarBonificacion(bonificacionFija);
        
        jugador2.aplicarBonificacion(bonificacion10);
        jugador2.aplicarBonificacion(bonificacionExtra);
    }
}
