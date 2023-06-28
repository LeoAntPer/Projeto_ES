public class Inscricao {
    private final int pesoAtleta;
    private final String generoAtleta;
    private final String eventoNome;
    private final Prova prova;

    public Inscricao(int peso, String genero, String nome, Prova prova) {
        pesoAtleta = peso;
        generoAtleta = genero;
        eventoNome = nome;
        this.prova = prova;
    }

    public int getPesoAtleta() {
        return pesoAtleta;
    }

    public String getGeneroAtleta() {
        return generoAtleta;
    }
}
