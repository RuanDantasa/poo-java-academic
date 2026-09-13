import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int n = ent.nextInt();

        fatorial(n);

        ent.close();
    }
    
    public static int fatorial(int n){
        if(n == 0){
            for(int i = 0; i < n; i++){
                System.out.print("\t");
            }

            System.out.println(n + "! = 1");
            return 1;
        } else { 
            int res = n * fatorial(n-1);
            
            for(int i = 0; i < n; i++){
                System.out.print("\t");
            }

            System.out.println(n + "! = " + res);
            return res;
        }
        
        
    }
}