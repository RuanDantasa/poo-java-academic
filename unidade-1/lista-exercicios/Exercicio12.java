import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int dia;

        do { 
            
            System.out.println("Dia: ");
            dia = ent.nextInt();

        } while (dia < 1 || dia > 28 );
        
        int resto = dia % 7;

        switch (resto) {
            case 1, 8, 15, 22:
                System.out.printf("O dia %d sera um domingo", dia);
                break;

            case 2, 9, 16, 23:
                System.out.printf("O dia %d sera uma segunda-feria", dia);
                break;

            case 3, 10, 17, 24:
                System.out.printf("O dia %d sera uma terca-feira", dia);
                break;

            case 4, 11, 18, 25:
                System.out.printf("O dia %d sera uma quarta-feira", dia);
                break;

            case 5, 12, 19, 26:
                System.out.printf("O dia %d sera uma quinta-feira", dia);
                break;

            case 6, 13, 20, 27:
                System.out.printf("O dia %d sera uma sexta-feira", dia);
                break;

            case 7, 14, 21, 28:
                System.out.printf("O dia %d sera um sabado", dia);
                break;
        
            default:
                break;
        }

        ent.close();
    }
}
