package poo_lista02_unidade1;


// Classe Contador
public class Contador {
    private static int contadorDeEventos = 0;

    public void zeraContador(){
        contadorDeEventos = 0;
    }
    
    public void incrementarContador(){
        contadorDeEventos++;
    }

    public void motraContador(){
        System.out.println(contadorDeEventos);
    }

    public static int mostraContador(){
        return contadorDeEventos;
    }
}