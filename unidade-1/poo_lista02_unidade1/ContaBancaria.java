package poo_lista02_unidade1;

public class ContaBancaria {
    private String nome;
    private double saldo;
    private boolean ehEspecial;
    private static int totalDeContas = 0;

    public ContaBancaria(String nome){
        this(nome, 0.0, false);
    }
    
    public ContaBancaria(String nome, double saldo, boolean ehEspecial){
        this.nome = nome;
        this.saldo = saldo;
        this.ehEspecial = ehEspecial;
        totalDeContas++;
    }

    public String getNome(){
        return nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean getEhEspecial(){
        return ehEspecial;
    }

    public static int getTotalDeContas(){
        return totalDeContas;
    }

    public void setNome(String novoValor){
        this.nome = novoValor;
    }

    public void setSaldo(double novoValor){
        this.saldo = novoValor;
    }

    public void setEhEspecial(boolean novoValor){
        this.ehEspecial = novoValor;
    }

    public void mostraDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
        if(ehEspecial){
            System.out.println("Tipo de conta: Especial");
        } else { 
            System.out.println("Tipo de conta: Padrao");
        }
    }
}
