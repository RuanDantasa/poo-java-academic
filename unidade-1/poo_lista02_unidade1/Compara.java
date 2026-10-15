package poo_lista02_unidade1;

// Classe Compara(uma classe genrica)
public class Compara<T>{
    private T elemento1;
    private T elemento2;
    private T elemento3;

    public Compara(T elemento1, T elemento2, T elemento3){
        this.elemento1 = elemento1;
        this.elemento2 = elemento2;
        this.elemento3 = elemento3;

    }

    public void imprimiCompara(){
        System.out.println(elemento1);
        System.out.println(elemento2);
        System.out.println(elemento3);
    }

    public int equalsCompara(){
        if(elemento1.equals(elemento2)  && elemento2.equals(elemento3)){
            return 3;
        } else if(elemento1.equals(elemento2) || elemento2.equals(elemento3) || elemento3.equals(elemento1)){
            return 2;
        } else {
            return 0;
        }
    }


    // TestaCompara
    public static void main(String[] args){
        System.out.println("=== TESTE COM STRINGS ===");
        Compara<String> comparaTexto = new Compara<>("Java", "Python", "Java");
        comparaTexto.imprimiCompara();
        System.out.println("Quantidade de iguais: " + comparaTexto.equalsCompara());

        System.out.println("\n=== TESTE COM INTEIROS (Integer) ===");
        Compara<Integer> comparaNumeros = new Compara<>(10, 10, 10);
        comparaNumeros.imprimiCompara();
        System.out.println("Quantidade de iguais: " + comparaNumeros.equalsCompara());
    
        System.out.println("\n=== TESTE COM DECIMAIS (Double) ===");
        Compara<Double> comparaNotas= new Compara<>(10.0, 11.0, 10.0);
        comparaNotas.imprimiCompara();
        System.out.println("Quantidade de iguais: " + comparaNotas.equalsCompara());

    }
}