import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int n, termo1 = 0, termo2 = 1, proximo;

        System.out.print("numero: ");
        n = ent.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.printf("%d ", termo1);

            proximo = termo1 + termo2; 

            termo1 = termo2;
            termo2 = proximo;
        }

        ent.close();
    }
}
