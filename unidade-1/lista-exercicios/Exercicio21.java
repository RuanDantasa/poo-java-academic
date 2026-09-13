import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Numero: ");
        int n = ent.nextInt();

        if (ehPrimo(n)){
            System.out.println("O numero " + n + " é primo");
        } else {
            System.out.println("O numero " + n + " não é primo");
        }

        ent.close();
    }

    public static boolean ehPrimo(int n){
        if (n <= 1){
            return false;
        } else{
            return primoAux(n, n-1);
        }
    }
    public static boolean primoAux(int n, int div){
        if (div == 1){
            return true;
        }else if (n % div == 0){
            return false;
        } else {
            return primoAux(n, div - 1);
        }
    }
}
