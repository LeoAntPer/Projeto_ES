import java.util.LinkedList;
import java.util.List;

public class Combate {
    private final List<Atleta> atletas;
    private String data;
    private String vencedor;
    private int id;
    private int ronda;

    public Combate(Atleta atleta1, Atleta atleta2, String data, int id, int ronda) {
        atletas = new LinkedList<>();
        atletas.add(atleta1);
        atletas.add(atleta2);

        this.data = data;
        this.vencedor = null;
        this.id = id;
        this.ronda = ronda;
    }

    public List<Atleta> getAtletas() {
        return new LinkedList<>(atletas);
    }

    public String getData() {
        return data;
    }

    public String getVencedor() {
        if(vencedor != null){
            return vencedor;
        }
        return "Ainda não existe vencedor";
    }

    @Override
    public String toString() {
        return atletas.get(0).getNome() + " VS " + atletas.get(1).getNome() + " | Vencedor: " + getVencedor();
    }
}
