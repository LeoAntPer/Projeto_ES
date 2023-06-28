import java.util.LinkedList;
import java.util.List;

public class DadosAplicacao {
    private final LinkedList<Evento> listaEventos;
    private final LinkedList<Atleta> listaAtletas;

    private DadosAplicacao(LinkedList<Evento> eventos, LinkedList<Atleta> atletas) {
        listaEventos = eventos;
        listaAtletas = atletas;
    }

    public LinkedList<Evento> getListaEventos() {
        return new LinkedList<>(listaEventos);
    }

    public LinkedList<Atleta> getListaAtletas() {
        return new LinkedList<>(listaAtletas);
    }
}
