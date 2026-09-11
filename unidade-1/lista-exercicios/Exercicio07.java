import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double n1, n2, n3;

        System.out.println("Numeros: ");
        n1 = ent.nextDouble();
        n2 = ent.nextDouble();
        n3 = ent.nextDouble();

        double menor = n1;
        if (n2 < n1) {
            menor = n2;
        } else if (n3 < n1) {
            menor = n3;
        }

        System.out.println(menor);
        
        ent.close();
    }
}
