import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        float graus, fahr;

        System.out.println("Graus:");
        graus = ent.nextFloat();
    
        fahr = (graus * 1.8f) + 32;
    
        System.out.print("Fahrenheit: " + fahr);

        ent.close();
    }
}
