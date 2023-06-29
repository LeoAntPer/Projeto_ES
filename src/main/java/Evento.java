import java.util.LinkedList;

public class Evento {
    private String nome;
    private String dataInic;
    private String dataFim;
    private String local;
    private String pais;
    private String modalidade;
    private final LinkedList<Inscricao> inscritos;
    private final LinkedList<Prova> provas;

    public Evento(String nome, String dataInic, String dataFim, String local, String pais, String modalidade) {
        this.nome = nome;
        this.dataInic = dataInic;
        this.dataFim = dataFim;
        this.local = local;
        this.pais = pais;
        this.modalidade = modalidade;

        inscritos = new LinkedList<>();
        provas = new LinkedList<>();
    }

    public void editarEvento(String nome, String dataInic, String dataFim, String local, String pais, String modalidade) {
        this.nome = nome;
        this.dataInic = dataInic;
        this.dataFim = dataFim;
        this.local = local;
        this.pais = pais;
        this.modalidade = modalidade;
    }

    public void addProva(Prova prova) { // TODO: Delete
        provas.add(prova);
    }

    public LinkedList<Prova> getProvas() {
        return new LinkedList<>(provas);
    }

    public Inscricao getInscricao(int atletaId) {
        for (Inscricao inscricao: inscritos) {
            if (inscricao.getAtletaId() == atletaId) {
                return inscricao;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return nome;
    }
}
