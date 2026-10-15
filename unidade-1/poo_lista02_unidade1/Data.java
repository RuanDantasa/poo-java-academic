package poo_lista02_unidade1;


// Classe Data
public class Data {
    int dia, mes, ano;

    boolean dataEhValida(int d, int m, int a){
        if ((d >= 1 && d <= 31) && (m >= 1 && m <= 12)){
            return true;
        } else {
            return false;
        }
    }
        
    public void inicializaData(int d, int m, int a){
        if(dataEhValida(d, m, a)){
            dia = d; mes = m; ano = a;
        } else {
            d = 0; mes = 0; ano = 0;
        }
    }
    
    public void mostraData(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    // TestaData
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
