package Ejercicio7;

public class Zombie extends Enemigo {

    public Zombie(String nombre, int puntosVida, int dañoBase) {
        super(nombre, puntosVida, dañoBase);
    }

    @Override
    public int atacar() {
        int daño = super.atacar();
        recibirDaño(-5); 
        System.out.println(getNombre() + " se ha regenerado 5 puntos de vida.");
        return daño;
    }
}

