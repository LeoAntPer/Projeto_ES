import java.util.LinkedList;

public class Prova {
    private int peso;
    private String genero;
    private LinkedList<Atleta> inscritos;
    private LinkedList<Combate> combates;

    public Prova(int peso, String genero) {
        this.peso = peso;
        this.genero = genero;

        inscritos = null;
        combates = null;
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
}
