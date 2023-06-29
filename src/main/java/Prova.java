import java.util.LinkedList;

public class Prova {
    private int peso;
    private String genero;
    private LinkedList<Atleta> inscritos;
    private LinkedList<Combate> combates;

    public Prova(int peso, String genero) {
        this.peso = peso;
        this.genero = genero;

        inscritos = new LinkedList<>();
        combates = new LinkedList<>();
    }

    public int getPeso() {
        return peso;
    }

    public String getGenero() {
        return genero;
    }

    public LinkedList<Atleta> getInscritos() {
        return new LinkedList<>(inscritos);
    }

    public LinkedList<Combate> getCombates() {
        return new LinkedList<>(combates);
    }

    public void inscrever(Atleta atleta) {
//        Inscricao inscricao = new Inscricao(atleta.getPeso(), atleta.getGenero(), atleta.getNome(), this);
        inscritos.add(atleta);
    }

    public void adicionarCombate(Combate combate) { // TODO: Delete
        combates.add(combate);
    }

    @Override
    public String toString() {
        return genero + " - " + peso + "Kg";
    }
}
