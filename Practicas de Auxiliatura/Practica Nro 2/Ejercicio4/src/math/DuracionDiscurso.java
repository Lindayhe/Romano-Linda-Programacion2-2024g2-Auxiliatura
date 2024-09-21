package math;

public class DuracionDiscurso {
    private int N; 
    private int K; 

    public DuracionDiscurso(int N, int K) {
        this.N = N;
        this.K = K;
    }

    public int calcularDuracionMaxima() {
        int T = (K - (N - 1)) / N; 
        if (T < 1) {
            T = 1;
        }

        return T; 
    }
}
