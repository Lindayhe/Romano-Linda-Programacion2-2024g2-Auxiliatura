package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Evento evento = new Evento("Batalla Final");

        evento.registrarNotificacion(mensaje -> System.out.println("Jugador 1 /recibe notificación/: " + mensaje));
        evento.registrarNotificacion(mensaje -> System.out.println("Jugador 2 /recibe notificación/: " + mensaje));
        evento.registrarNotificacion(mensaje -> System.out.println("Administrador recibe /notificación/: " + mensaje));

       
        evento.activar();
    }
}

