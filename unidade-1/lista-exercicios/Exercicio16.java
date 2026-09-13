public class Exercicio16 {
    public static void main(String[] args) {
        int c, d, u, soma;
        for (int i = 100; i <= 999; i++){
            c = i / 100;
            d = (i % 100) / 10;
            u = i % 10;

            soma = (c * c * c) + (d * d * d) + (u * u * u);

            if(soma == i) {
                System.out.println(+ i);
            }

        }
    }
}
