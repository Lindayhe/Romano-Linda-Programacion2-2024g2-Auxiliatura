package Ejercicio4;

import java.util.List;

//Linda Romano
public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
//objetos, things
        inventario.agregarObjeto(new Objeto("Espada", 10));
        inventario.agregarObjeto(new Objeto("Escudo", 15));
        inventario.agregarObjeto(new Objeto("Poción de salud", 1));
        inventario.agregarObjeto(new Objeto("Armadura", 20));
        inventario.agregarObjeto(new Objeto("Anillo mágico", 2));

        List<Objeto> objetosLivianos = inventario.filtrarObjetos(objeto -> objeto.getPeso() < 10);
        System.out.println("Objetos livianos (peso < 10): " + objetosLivianos);
//con su pocision 
        List<Objeto> objetosPociones = inventario.filtrarObjetos(objeto -> objeto.getNombre().contains("Poción"));
        System.out.println("Objetos que son pociones: " + objetosPociones);

        // objetos con peso mayor o igual a 15
        List<Objeto> objetosPesados = inventario.filtrarObjetos(objeto -> objeto.getPeso() >= 15);
        System.out.println("Objetos pesados (peso >= 15): " + objetosPesados);
    }
}

