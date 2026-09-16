package poo_lista02_unidade1;

public class EventoAcademico {
    String nomeDoEvento;
    String localDoEvento;
    int numeroDeParticipacao;

    public EventoAcademico(String nomeDoEvento, String localDoEvento, int numeroDeParticipacao){
        this.nomeDoEvento = nomeDoEvento;
        this.localDoEvento = localDoEvento;
        this.numeroDeParticipacao = numeroDeParticipacao;
    }

    public void mostraEvento(){
        System.out.println("Nome do Evento: " + nomeDoEvento);
        System.out.println("Local do Evento: " + localDoEvento);
        System.out.println("Numero de participacao: " + numeroDeParticipacao);
    }

}
