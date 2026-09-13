import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Grau do polinomio: ");
        int n = ent.nextInt();

        double[] a = new double[n+1];

        System.out.println("Digite os coeficientes:");
        for (int i = 0; i <= n; i++){
            System.out.print("a[" + i + "]: ");
            a[i] = ent.nextDouble();
        }


        System.out.println("Digite o valor de x:");
        double x = ent.nextInt();
        
        double resultado = polinomio(a, n, x); 
        System.out.println("O valor de P_" + n + "(" + x + ") é: " + resultado);
        
        ent.close();
    }

    public static double polinomio(double[] a, int n, double x){
        if (n == 0){
            return a[0];
        } else {
            return x * polinomio(a, n - 1, x) + a[n];
        }
    }
}
