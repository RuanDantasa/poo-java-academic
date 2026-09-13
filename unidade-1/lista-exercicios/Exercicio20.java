import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Numeros: ");
        int n1 = ent.nextInt();
        int n2 = ent.nextInt();

        int resultado = mdc(n1, n2);

        System.out.println("Maximo divisor comum entre os numeros informados: "+ resultado);

        ent.close();
    }
    public static int mdc(int m, int n){
        if(n > m){
            return mdc(n, m);
        } else if(n == 0){
            return m;
        } else {
            int rest =  m % n;
            return mdc(n, rest);
        }
    }
}