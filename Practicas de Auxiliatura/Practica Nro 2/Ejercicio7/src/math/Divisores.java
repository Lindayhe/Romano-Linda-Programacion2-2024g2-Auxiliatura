package math;

public class Divisores {

    
    public static int[] calcularDivisores(int suma) {
        int[] divisores = new int[4];  

        divisores[0] = suma / 8;  
        suma %= 8;  

        divisores[1] = suma / 4;  
        suma %= 4;  
       
        divisores[2] = suma / 2;  
        suma %= 2;  
        
        divisores[3] = suma;  

        return divisores;
    }
}
