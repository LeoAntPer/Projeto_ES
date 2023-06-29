import java.util.LinkedList;
import java.util.Objects;
import java.util.Optional;

public class Evento {
    private String nome;
    private String dataInic;
    private String dataFim;
    private String local;
    private String pais;
    private String modalidade;
    private final LinkedList<Inscricao> inscritos;
    private final LinkedList<Prova> provas;
    private boolean isOngoing;

    public Evento(String nome, String dataInic, String dataFim, String local, String pais, String modalidade) {
        this.nome = nome;
        this.dataInic = dataInic;
        this.dataFim = dataFim;
        this.local = local;
        this.pais = pais;
        this.modalidade = modalidade;
        this.isOngoing = false;

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
        if (prova != null) {
            provas.add(prova);
        }
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

    public void inscreverEventoEProva(Atleta atleta, Prova prova) {
        if (atleta != null) {
            Inscricao inscricao = new Inscricao(atleta.getId(), atleta.getPeso(), atleta.getGenero(), atleta.getNome());
            inscritos.add(inscricao);
            prova.addInscricao(inscricao);
        }
    }

    public boolean inscrever(Atleta atleta) {
        // procurar uma prova do evento que seja elegivel para o atleta
        Optional<Prova> result = provas.stream()
                .filter(provas -> atleta.getPeso() <= provas.getPeso())
                .filter(provas -> Objects.equals(atleta.getGenero(), provas.getGenero()))
                .findFirst();
        Prova provaElegivel;
        if (result.isPresent()) {
            provaElegivel = result.get();
        } else {
            return false;
        }
        // inscrever o atleta
        inscreverEventoEProva(atleta, provaElegivel);
        return true;
    }

    public void cancelar(Inscricao inscricao) {
        inscricao.setStatus(InscricaoStatus.CANCELED);
    }

    public boolean isOngoing() {
        return isOngoing;
    }

    @Override
    public String toString() {
        return nome;
    }
}
