package Ejercicio6;

class Vampiro extends Enemigo {
    public Vampiro(String nombre, int puntosDeVida, int dañoBase) {
        super(nombre, puntosDeVida, dañoBase);
    }

    @Override
    public int atacar() {
        int dañoInfligido = dañoBase;
        puntosDeVida += dañoInfligido / 2;
        return dañoInfligido;
    }
}