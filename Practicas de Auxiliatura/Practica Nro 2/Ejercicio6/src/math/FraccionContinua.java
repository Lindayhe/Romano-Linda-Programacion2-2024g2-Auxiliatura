package math;

import java.math.BigInteger;

public class FraccionContinua {

    public static Fraccion calcularFraccionContinua(int n) {
        BigInteger numerador = BigInteger.ONE;
        BigInteger denominador = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            BigInteger temp = numerador;
            numerador = numerador.add(denominador);
            denominador = temp;                     
        }

        return new Fraccion(numerador, denominador);
    }
}
