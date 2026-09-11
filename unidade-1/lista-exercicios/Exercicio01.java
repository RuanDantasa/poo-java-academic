import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double l;

        System.out.println("Lado: ");
        l = ent.nextDouble();

        double a = l*l;
        
        System.out.println("Area: " + a);

        ent.close();
    }
    
}