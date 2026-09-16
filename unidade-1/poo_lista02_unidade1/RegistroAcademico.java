package poo_lista02_unidade1;

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
}
