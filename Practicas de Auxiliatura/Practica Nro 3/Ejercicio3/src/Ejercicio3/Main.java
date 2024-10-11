package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago("Pablito", 10, 100, 70);
        Arquero arquero = new Arquero("Jesus", 8, 87, 75);
        Guerrero guerrero = new Guerrero("Charlie", 14, 120, 100);

        mago.agregarItem("Varita");
        arquero.agregarItem("Arco");
        guerrero.agregarItem("Espada");

        mago.mostrarEstado();
        arquero.mostrarEstado();
        guerrero.mostrarEstado();

        mago.lanzarHechizo();
        arquero.dispararFlecha();
        guerrero.atacar();
    }
}

