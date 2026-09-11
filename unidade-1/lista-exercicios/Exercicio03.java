import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        double g, rad;

        System.out.print("Graus: ");
        g = ent.nextDouble();

        rad = Math.toRadians(g);

        System.out.println("Radiano: "+ rad);
        System.out.printf("Seno: %.4f%n", Math.sin(rad));
        System.out.printf("Cosseno: %.4f%n", Math.cos(rad));
        System.out.printf("Tangente: %.4f%n", Math.tan(rad));
        System.out.printf("Cossecante: %.4f%n", 1/Math.sin(rad));
        System.out.printf("Secante: %.4f%n", 1/Math.cos(rad));
        System.out.printf("Cotangente: %.4f%n", 1/Math.tan(rad));

        ent.close();   

    }
}
