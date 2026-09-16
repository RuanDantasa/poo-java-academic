package poo_lista02_unidade1;

public class TestaRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico();

        michael.inicializaRegistroAcademico("Michael", "34980030",
         2, 1.0);
    
        System.out.println("Mensalidade: " + michael.calculaMensalidade());
        
        }

}
