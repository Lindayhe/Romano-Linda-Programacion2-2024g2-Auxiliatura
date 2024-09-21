package borderlands;

import java.util.Random;

public class GeneradorDeBotin {
    private static final String[] TIPOS = {"Arma", "Escudo", "Modificador"};
    private static final String[] RAREZAS = {"Común", "Poco Común", "Raro", "Épico", "Legendario"};
    private static final Random RANDOM = new Random();

    public static Botin generarBotin() {
        String tipo = TIPOS[RANDOM.nextInt(TIPOS.length)];
        String rareza = RAREZAS[RANDOM.nextInt(RAREZAS.length)];

        int atributo1 = RANDOM.nextInt(100) + 1;
        int atributo2 = RANDOM.nextInt(100) + 1;
        int atributo3 = RANDOM.nextInt(100) + 1;

        return new Botin(tipo, rareza, atributo1, atributo2, atributo3);
    }
}
