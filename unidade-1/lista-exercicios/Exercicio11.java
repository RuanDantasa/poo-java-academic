import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        double x1, x2, y1, y2;
        String a1 = "", a2 = "";

        System.out.println("Ponto 1: ");
        x1 = ent.nextDouble();
        y1 = ent.nextDouble();

        System.out.println("Ponto 2: ");
        x2 = ent.nextDouble();
        y2 = ent.nextDouble();

        if (y2 > y1){
            a1 = "acima";
        }else if (y2 < y1){
            a1 = "abaixo";
        } else { 
            a1 = "na mesma altura"; 
        }

        if (x2 > x1){
            a2= "a direita";
        }else if (x2 < x1){
            a2 = "a esquerda";
        } else {
            a2 = "no mesmo nivel vertical";
        }

        System.out.printf("O ponto dois esta %s e %s do ponto 1%n" , a1, a2);

        
        ent.close();
    }
}
