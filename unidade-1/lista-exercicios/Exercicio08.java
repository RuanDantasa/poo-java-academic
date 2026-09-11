import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int setor;
        double valor_Produto;
        
        System.out.print("Setor: ");
        setor = ent.nextInt();
        System.out.print("Valor do produto: ");
        valor_Produto = ent.nextDouble();

        switch (setor) {
            case 111:
                if (valor_Produto > 100) {
                    valor_Produto = valor_Produto - (valor_Produto * 0.4);
                } else if (valor_Produto >= 50 && valor_Produto <= 100) {
                    valor_Produto = valor_Produto - (valor_Produto * 0.2);
                } else {
                    valor_Produto = valor_Produto - (valor_Produto * 0.1);
                }

                System.out.println("Setor de Cama, mesa e banho");
                System.out.println("Preco final: " + valor_Produto);
                break;

            case 222:
                if (valor_Produto > 500) {
                    valor_Produto = valor_Produto - (valor_Produto * 0.1);
                }

                System.out.println("Setor de Eletros");
                System.out.println("Preco final: " + valor_Produto);
                break;
                
            default:
                System.out.println("Setor invalido");
                break;
                
        }


        ent.close();
    }
}
