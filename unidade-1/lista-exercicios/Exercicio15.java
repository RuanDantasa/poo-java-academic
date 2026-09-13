public class Exercicio15 {
    public static void main(String[] args) {
        int n = 2, soma = 0, encontrados = 0;

        while (encontrados < 4) {
            soma = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                 soma += i;
                }
                
            }
            
            if (soma == n) {
                System.out.printf("O numero %d é perfeito\n", n);
                encontrados++;
            }
            n++;
        }
    }
}
