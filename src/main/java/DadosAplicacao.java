import java.util.LinkedList;
import java.util.List;

public class DadosAplicacao {
    private static DadosAplicacao instance = null;
    private final LinkedList<Evento> listaEventos;
    private final LinkedList<Atleta> listaAtletas;

    private DadosAplicacao() {
        listaEventos = new LinkedList<>();
        listaAtletas = new LinkedList<>();
    }

    public static synchronized DadosAplicacao getInstance() {
        if(instance == null){
            instance = new DadosAplicacao();
        }
        return instance;
    }

    public LinkedList<Evento> getListaEventos() {
//        return new LinkedList<>(listaEventos);
        return listaEventos;
    }

    public LinkedList<Atleta> getListaAtletas() {
//        return new LinkedList<>(listaAtletas);
        return listaAtletas;
    }
}
