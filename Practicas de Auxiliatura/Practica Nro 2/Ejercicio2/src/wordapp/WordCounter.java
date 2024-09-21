package wordapp;

import java.util.List;

public class WordCounter {

   
    public int contarPalabrasConLetra(List<String> listaPalabras, char letra) {
        letra = Character.toLowerCase(letra);  
        int contador = 0;
        for (String palabra : listaPalabras) {
            if (palabra.toLowerCase().startsWith(String.valueOf(letra))) {
                contador++;
            }
        }
        return contador;
    }
}
