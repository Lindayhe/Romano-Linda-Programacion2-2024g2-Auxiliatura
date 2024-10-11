package Ejercicio2;

public class Moto extends Vehiculo implements Turbo, Drift {

    public Moto(String marca, String modelo, int velocidadMaxima, int peso) {
        super(marca, modelo, velocidadMaxima, peso);
    }

    @Override
    public void acelerar() {
        System.out.println("La moto " + marca + " está acelerando.");
    }

    @Override
    public void activarTurbo() {
        System.out.println("La moto " + marca + " ha activado el turbo.");
    }

    @Override
    public void realizarDerrape() {
        if (peso < 300) {
            System.out.println("La moto " + marca + " está realizando un derrape.");
        } else {
            System.out.println("La moto " + marca + " no puede derrapar porque es muy pesada.");
        }
    }
}
