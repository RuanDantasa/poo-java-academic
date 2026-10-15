package poo_lista02_unidade1;

// Classe Lampada
// Incrementada com Contador
public class Lampada {
    private boolean estadoDaLampada;
    
    
    public void acendeLampada(){
        if(!estadoDaLampada){
            this.estadoDaLampada = true;
            cont.incrementarContador();
        }
    }     
    
    public void apagaLampada(){
        this.estadoDaLampada = false;
    }    
    
    public void mostraEstado(){
        if(estadoDaLampada){
            System.out.println("A lampada esta acesa");
        } else {
            System.out.println("A lampada esta apagada");
        }
    }
    
    public boolean estaLigada(){
        return estadoDaLampada;
    }
    
    private Contador cont = new Contador();


    // TestaLampada
    public static void main(String[] args) {
        Lampada a1 = new Lampada();

        a1.acendeLampada();

        a1.apagaLampada();
        
        a1.acendeLampada();
        
        a1.apagaLampada();
        
        a1.mostraEstado();
        System.out.println(a1.estaLigada());
        System.out.println(Contador.mostraContador());

    }
}
