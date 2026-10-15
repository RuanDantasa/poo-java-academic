package poo_lista02_unidade1;


// Classe RegistroAcademico
public class RegistroAcademico {
    String nome;
    String matricula;
    int codigoCurso;
    double percentualDeCobranca;

    void inicializaRegistroAcademico(String nom, String mat, int codCurso, double percent){
        nome = nom;
        matricula = mat;
        codigoCurso = codCurso;
        percentualDeCobranca = percent;
        
    }

    double calculaMensalidade(){
        return (100 * codigoCurso * percentualDeCobranca);
    }

    
    // TestaRegistroAcademico
    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico();

        michael.inicializaRegistroAcademico("Michael", "34980030",
         2, 1.0);
    
        System.out.println("Mensalidade: " + michael.calculaMensalidade());
        
    }
}
