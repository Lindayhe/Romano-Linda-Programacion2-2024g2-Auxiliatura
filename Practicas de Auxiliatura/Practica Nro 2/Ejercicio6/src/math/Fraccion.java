package math;

import java.math.BigInteger;

public class Fraccion {
    private BigInteger numerador;
    private BigInteger denominador;

    public Fraccion(BigInteger numerador, BigInteger denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public BigInteger getNumerador() {
        return numerador;
    }

    public BigInteger getDenominador() {
        return denominador;
    }

    public void setNumerador(BigInteger numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(BigInteger denominador) {
        this.denominador = denominador;
    }
}

