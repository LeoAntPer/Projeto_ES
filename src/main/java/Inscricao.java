public class Inscricao {
    private final int atletaId;
    private final int pesoAtleta;
    private final String generoAtleta;
    private final String eventoNome;
    private InscricaoStatus status;

    public Inscricao(int atletaId, int peso, String genero, String nome) {
        this.atletaId = atletaId;
        pesoAtleta = peso;
        generoAtleta = genero;
        eventoNome = nome;
        this.status = InscricaoStatus.PENDING;
    }

    public int getPesoAtleta() {
        return pesoAtleta;
    }

    public String getGeneroAtleta() {
        return generoAtleta;
    }

    public InscricaoStatus getStatus() {
        return status;
    }

    public void setStatus(InscricaoStatus status) {
        this.status = status;
    }

    public int getAtletaId(){
        return atletaId;
    }

    @Override
    public String toString() {
        return eventoNome + " | " + pesoAtleta + " | " + generoAtleta + " | " + status;
    }
}
