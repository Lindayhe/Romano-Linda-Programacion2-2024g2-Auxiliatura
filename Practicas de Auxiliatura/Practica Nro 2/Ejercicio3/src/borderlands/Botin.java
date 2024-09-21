package borderlands;

public class Botin {
    private String tipo;
    private String rareza;
    private int atributo1;
    private int atributo2;
    private int atributo3;

    public Botin(String tipo, String rareza, int atributo1, int atributo2, int atributo3) {
        this.tipo = tipo;
        this.rareza = rareza;
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRareza() {
        return rareza;
    }

    public int getAtributo1() {
        return atributo1;
    }

    public int getAtributo2() {
        return atributo2;
    }

    public int getAtributo3() {
        return atributo3;
    }

    @Override
    public String toString() {
        String descripcionAtributo1 = " de daño para armas";
        String descripcionAtributo2 = " de capacidad de absorción para escudos";
        String descripcionAtributo3 = " de mejora de habilidad para modificadores";

        return "Tipo: " + tipo + ", Rareza: " + rareza + 
               ", Atributo 1: " + atributo1 + descripcionAtributo1 + 
               ", Atributo 2: " + atributo2 + descripcionAtributo2 + 
               ", Atributo 3: " + atributo3 + descripcionAtributo3;
    }
}

