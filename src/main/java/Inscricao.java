public class Inscricao {
    private final int atletaId;
    private final int pesoAtleta;
    private final String generoAtleta;
    private final String eventoNome;
    private final Prova prova;
    private final String status;

    public Inscricao(int atletaId, int peso, String genero, String nome, Prova prova) {
        this.atletaId = atletaId;
        pesoAtleta = peso;
        generoAtleta = genero;
        eventoNome = nome;
        this.prova = prova;
        this.status = InscricaoStatus.PENDING.toString();
    }

    public int getPesoAtleta() {
        return pesoAtleta;
    }

    public String getGeneroAtleta() {
        return generoAtleta;
    }

    public String getStatus() {
        return status;
    }

    public int getAtletaId(){
        return atletaId;
    }
}
