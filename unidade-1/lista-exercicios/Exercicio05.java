import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n;

        do {
            System.out.print("Numero: ");
            n = ent.nextInt();
        } while(n <= 99 || n >= 999);

        int C, D, U, UCD;
        C = n / 100;
        D = (n % 100) / 10;
        U = n % 10;
        
        UCD = (U * 100) + (C * 10) + D;

        System.out.println("Formato UCD: " + UCD);

        ent.close();
    }
}
