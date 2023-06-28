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

    public void addProva(Prova prova) {
        provas.add(prova);
    }

    public LinkedList<Prova> getProvas() {
        return new LinkedList<>(provas);
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", dataInic='" + dataInic + '\'' +
                ", dataFim='" + dataFim + '\'' +
                ", local='" + local + '\'' +
                ", pais='" + pais + '\'' +
                ", modalidade='" + modalidade + '\'' +
                ", inscritos=" + inscritos +
                ", provas=" + provas +
                '}';
    }
}
