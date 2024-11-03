package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Aventura aventura = new Aventura();

        aventura.agregarTarea(() -> System.out.println("Recolectando recursos en el bosque...."));
        aventura.agregarTarea(() -> System.out.println("Explorando una cueva misteriosa...."));
        aventura.agregarTarea(() -> System.out.println("Enfrentando a un grupo de enemigos....pum"));
        aventura.agregarTarea(() -> System.out.println("Descansando en un campamento seguro...:)"));

        aventura.iniciar();
    }
}
