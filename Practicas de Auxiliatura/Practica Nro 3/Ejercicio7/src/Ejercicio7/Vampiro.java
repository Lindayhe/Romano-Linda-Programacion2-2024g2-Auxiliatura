package Ejercicio7;

	public class Vampiro extends Enemigo {

	    public Vampiro(String nombre, int puntosVida, int dañoBase) {
	        super(nombre, puntosVida, dañoBase);
	    }

	    @Override
	    public int atacar() {
	        int daño = super.atacar();
	        recibirDaño(-daño / 2);  // El vampiro se roba vida (mitad del daño ique hace)
	        System.out.println(getNombre() + " ha robado " + (daño / 2) + " puntos de vida.");
	        return daño;
	    }
	}

