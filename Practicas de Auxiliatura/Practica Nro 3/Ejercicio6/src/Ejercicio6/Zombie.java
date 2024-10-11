package Ejercicio6;

class Zombie extends Enemigo {
    public Zombie(String nombre, int puntosDeVida, int dañoBase) {
        super(nombre, puntosDeVida, dañoBase);
    }

    @Override
    public int atacar() {
        puntosDeVida += 5;
        return dañoBase;
    }
}
