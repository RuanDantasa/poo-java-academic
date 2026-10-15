package poo_lista02_unidade1;

import java.util.Scanner;


// ContaBancaria
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

    // TestaContaBancaria
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        ContaBancaria c1 = new ContaBancaria("Joao");
        ContaBancaria c2 = new ContaBancaria("Ruan", 200.0, true);
        ContaBancaria c3 = new ContaBancaria(null, 0, false);
        c1.mostraDados();
        System.out.println();
        c2.mostraDados();

        System.out.println("Informe o nome da conta:" );
        double nome = ent.nextDouble();
        c3.setSaldo(nome);
        System.out.println("Saldo da conta: " + c3.getSaldo());
        
    }
}
