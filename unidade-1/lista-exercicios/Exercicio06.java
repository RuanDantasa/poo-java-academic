import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int val;
        
        System.out.println("Valor: ");
        val = ent.nextInt();

        int d, h, min;

        d = val / 1440;
        h = (val % 1440) / 60;
        min = (val % 1440) % 60;

        System.out.print(+ d + " dias " + h +" horas " + min + " minutos");

        ent.close();
    }
}
