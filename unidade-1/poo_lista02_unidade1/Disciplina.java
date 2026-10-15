package poo_lista02_unidade1;


// Classe Disciplina
public class Disciplina {
    private String matricula;
    private String nome;
    private double p1, p2, T;

    public Disciplina(String matricula, String nome, double p1, double p2, double t) {
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        T = t;
    }

    public double calcularMedia(){ 
        return ((2.5 * p1) + (2.5 * p2) + (2 * T)) / 7;
    } 

    public double provaFinal(){

        if(calcularMedia() < 3 || calcularMedia() >= 7){
            return 0;
            
        } else {
            double EF = (50 - (calcularMedia() * 6)) / 4;
            return EF;
        }
    }


    // TestaDisciplina
    public static void main(String[] args){
        Disciplina matematica = new Disciplina("01", "Ruan", 6.0, 7.0, 5.0);
    
        double mp = matematica.calcularMedia(); 
        double notaFinalNecessaria = matematica.provaFinal();

        System.out.println("Média Parcial (MP) do aluno: " + mp);

        if(notaFinalNecessaria == 0){
            if (mp >= 7.0) {
                System.out.println("Aluno aprovado por média!");
            } else {
                System.out.println("Aluno reprovado por média.");
            }
        } else {
            System.out.println("Aluno em estado de exame final.");
            System.out.println("Nota necessária para aprovação: " + notaFinalNecessaria);
        }
    }

}

