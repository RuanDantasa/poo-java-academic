import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        float n1, n2, n3, som, med;

        System.out.println("Numeros: ");
        n1 = ent.nextFloat();
        n2 = ent.nextFloat();
        n3 = ent.nextFloat();

        som = n1 + n2 + n3;

        med = som / 3;

        System.out.println("Soma: " + som);
        System.out.println("Media: " + med);
    
        ent.close();
    }
}
