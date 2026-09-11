import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int valorCarta, naipe;
        String nomeCarta = "";
        String nomeNaipe = "";


        System.out.print("Valor da carta:  ");
        valorCarta = ent.nextInt();

        System.out.print("Valor do naipe: ");
        naipe = ent.nextInt();

        switch (valorCarta) {
            case 1:
                nomeCarta = "As";
                break;
        
            case 11: 
                nomeCarta = "Valete";
                break;
                
            case 12: 
                nomeCarta = "Dama";
                break;
                
            case 13: 
                nomeCarta = "Rei";
                break;
                
            default:
                nomeCarta = String.valueOf(valorCarta);                
                break;
        }

        switch (naipe) {
            case 1:
                nomeNaipe = "Ouros";
                break;
        
            case 2:
                nomeNaipe = "Paus";
                break;
        
            case 3:
                nomeNaipe = "Copas";
                break;
        
            case 4:
                nomeNaipe = "Espadas";
                break;
        
            default:
                System.out.println("Naipe não encontrado");
                break;
        }
        
        System.out.printf("%s de %s\n", nomeCarta, nomeNaipe);
        
        ent.close();
    }
}
