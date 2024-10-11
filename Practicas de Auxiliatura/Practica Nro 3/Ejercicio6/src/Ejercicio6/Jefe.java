package Ejercicio6;

class Jefe extends Enemigo {
    private double multiplicadorDeDaño;

    public Jefe(String nombre, int puntosDeVida, int dañoBase, double multiplicadorDeDaño) {
        super(nombre, puntosDeVida, dañoBase);
        this.multiplicadorDeDaño = multiplicadorDeDaño;
    }

    public void hablar() {
        System.out.println(nombre + ": ¡Están todos condenados!");
    }

    public int ataqueCritico() {
        return (int) (dañoBase * multiplicadorDeDaño);
    }

    @Override
    public int atacar() {
        return ataqueCritico();
    }
}

