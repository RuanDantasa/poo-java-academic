package poo_lista02_unidade1;

public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Joao");
        ContaBancaria c2 = new ContaBancaria("Ruan", 200.0, true);

        c1.mostraDados();
        System.out.println();
        c2.mostraDados();

        System.out.println("Total de contas criadas: " + ContaBancaria.getTotalDeContas());
    }
}
