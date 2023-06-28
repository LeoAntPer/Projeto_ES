import java.util.LinkedList;

public class Evento {
    private String nome;
    private String dataInic;
    private String dataFim;
    private String local;
    private String pais;
    private String modalidade;
    private final LinkedList<Atleta> inscritos;
    private final LinkedList<Prova> provas;

    public Evento(String nome, String dataInic, String dataFim, String local, String pais, String modalidade) {
        this.nome = nome;
        this.dataInic = dataInic;
        this.dataFim = dataFim;
        this.local = local;
        this.pais = pais;
        this.modalidade = modalidade;

        inscritos = null;
        provas = null;
    }

    public void editarEvento(String nome, String dataInic, String dataFim, String local, String pais, String modalidade) {
        this.nome = nome;
        this.dataInic = dataInic;
        this.dataFim = dataFim;
        this.local = local;
        this.pais = pais;
        this.modalidade = modalidade;
    }
}
