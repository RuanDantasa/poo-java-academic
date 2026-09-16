package poo_lista02_unidade1;

public class TestaInvoice {
    public static void main(String[] args) {
        Invoice fatura1 = new Invoice("123",
        "Teclado", 1, 80.0);
        
        Invoice fatura2 = new Invoice("124",
        "Mouse", 1, -50.0);
        

        System.out.println("Descricao: " + fatura1.getDescricao());
        System.out.println("Quantidade: " + fatura1.getQuantidade());
        System.out.println("Preco: " + fatura1.getPrecoItem());
        
        System.out.println();

        System.out.println("Descricao: " + fatura2.getDescricao());
        System.out.println("Quantidade: " + fatura2.getQuantidade());
        System.out.println("Preco: " + fatura2.getPrecoItem());
        
    }
}
