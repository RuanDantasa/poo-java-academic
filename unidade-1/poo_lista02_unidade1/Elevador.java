package poo_lista02_unidade1;


// Classe Elevador
public class Elevador {
    private int numeroDoAndar = 0;
    private int totalDeAndares;
    private int capacidadeDoElevador;
    private int pessoasNoElevador = 0;

    public Elevador(int totalDeAndares, int capacidadeDoElevador) {
        this.totalDeAndares = totalDeAndares;
        this.capacidadeDoElevador = capacidadeDoElevador;
    }

    public int getNumeroDoAndar() {
        return numeroDoAndar;
    }

    public int getPessoasNoElevador() {
        return pessoasNoElevador;
    }

    public void entra(){
        if(pessoasNoElevador < capacidadeDoElevador){
            pessoasNoElevador++;
        } else {
            System.out.println("Capacidade maxima atingida");
        }
    }

    public void sai(){
        if(pessoasNoElevador > 0){
            pessoasNoElevador--;
        
        } else {
            System.out.println("Nao ha ninguem no elevador");
        }
    }

    public void sobe(){
        if(numeroDoAndar < totalDeAndares){
            numeroDoAndar++;
        } else {
            System.out.println("Ultimo andar");
        }
    }

    public void desce(){
        if(numeroDoAndar > 0){
            numeroDoAndar--;
        }
    }
    


    // TestaElevador
    public static void main(String[] args){
        Elevador e1 = new Elevador(8, 6); 
    
        System.out.println("Estado inicial:");
        System.out.println("Andar atual: " + e1.getNumeroDoAndar() + " | Pessoas: " + e1.getPessoasNoElevador());

        System.out.println("\n--- Testando entrada de pessoas ---");
        e1.entra(); 
        e1.entra();
        System.out.println("Após entrarem 2: Andar: " + e1.getNumeroDoAndar() + " | Pessoas: " + e1.getPessoasNoElevador());

        System.out.println("\n--- Testando movimento e limites ---");
        e1.sobe();
        e1.sai();
        System.out.println("Subiu 1 andar e 1 saiu. Andar: " + e1.getNumeroDoAndar() + " | Pessoas: " + e1.getPessoasNoElevador());

        e1.entra(); e1.entra(); e1.entra();
        e1.sobe();
        e1.entra();
    
        e1.sobe(); e1.sobe(); e1.sobe(); e1.sobe(); e1.sobe(); 
        System.out.println("Após tentar subir até o limite. Andar: " + e1.getNumeroDoAndar() + " | Pessoas: " + e1.getPessoasNoElevador());

        System.out.println("\n--- Testando descida até o térreo ---");
        e1.sai();
        e1.entra(); e1.entra();
        e1.desce(); e1.desce(); e1.desce(); e1.desce(); e1.desce(); e1.desce(); e1.desce(); 
    
        System.out.println("Resultado Final:");
        System.out.println("Andar: " + e1.getNumeroDoAndar() + " (deve ser 0) | Pessoas: " + e1.getPessoasNoElevador());
    }
    
}