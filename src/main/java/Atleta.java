public class Atleta {
    private String nome;
    private int id;
    private String pais;
    private String genero;
    private String modalidade;
    private int peso;
    private String dataNasc;
    private String contacto;

    public Atleta (String nome, int id, String pais, String genero, String modalidade, int peso, String dataNasc, String contacto) {
        this.nome = nome;
        this.id = id;
        this.pais = pais;
        this.genero = genero;
        this.modalidade = modalidade;
        this.peso = peso;
        this.dataNasc = dataNasc;
        this.contacto = contacto;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getPais() {
        return pais;
    }

    public String getGenero() {
        return genero;
    }

    public String getModalidade() {
        return modalidade;
    }

    public int getPeso() {
        return peso;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getContacto() {
        return contacto;
    }
}
