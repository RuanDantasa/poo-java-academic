package poo_lista02_unidade1;

public class TestaData {
    public static void main(String[] args) {
        Data d1 = new Data();

        d1.inicializaData(14, 9, 2026);

        System.out.print("Data 1 (valida): ");
        d1.mostraData();

        Data d2 = new Data();

        d2.inicializaData(35, 9, 2026);

        System.out.print("Data 2 (invalida): ");
        d2.mostraData();

    }
}
