package wordapp;

import java.util.List;

public class App {
    public static void main(String[] args) {
        WordList wordList = new WordList();
        List<String> palabras = wordList.getPalabras();

        WordCounter wordCounter = new WordCounter();
        char letra = 'm'; 

        int resultado = wordCounter.contarPalabrasConLetra(palabras, letra);
       
        System.out.println("Hay " + resultado + " palabras que comienzan con la letra '" + letra + "'");
    }
}
