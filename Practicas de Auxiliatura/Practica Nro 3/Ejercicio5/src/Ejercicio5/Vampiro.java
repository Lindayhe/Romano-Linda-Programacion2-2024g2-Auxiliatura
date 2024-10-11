package Ejercicio5;


public class Vampiro extends Enemigo {

    public Vampiro(String nombre, int puntosVida, int dañoBase) {
        super(nombre, puntosVida, dañoBase);
    }

    @Override
    public int atacar() {
        int daño = super.atacar();
        puntosVida += daño / 2; 
        return daño;
    }
}

