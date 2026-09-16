package poo_lista02_unidade1;

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

}
