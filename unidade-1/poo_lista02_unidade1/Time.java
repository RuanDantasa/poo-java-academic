package poo_lista02_unidade1;


// Classe Time
public class Time {
    private String nome;
    private int vitorias;
    private int empates;
    private int derrotas;

    public Time(String nome, int vitorias, int empates, int derrotas) {
        this.nome = nome;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }

    public String getNome() {
        return nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public int getDerrotas() {
    return derrotas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int registrarVitoria(){
        return vitorias++;
    }

    public int resgistrarEmpate(){
        return empates++;
    }

    public int registrarDerrotas(){
        return derrotas++; 
    }

    public double calcularPontos(){
        return (vitorias * 3 + empates);
    }

    public void mostraDesempenho(){
        System.out.println("Nome do time: " + nome);
        System.out.println("Vitorias: " + vitorias);
        System.out.println("Empates: " + empates);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Pontos: " + calcularPontos());
    }

    // TestaTime
    public static void main(String[] args) {
        Time t1 = new Time("Flamengo", 2, 1, 1);

        t1.mostraDesempenho();
    
    }
}