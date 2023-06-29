import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class JanelaPerfil extends JFrame {
    private JPanel panelPerfis;
    private JButton btnFuncionario;
    private JButton btnAtleta;
    private JButton btnAdmin;
    private JLabel perfilLabel;
    private DadosAplicacao dadosAplicacao;

    public JanelaPerfil(String titulo, DadosAplicacao dadosAplicacao) {
        super(titulo);
        this.dadosAplicacao = dadosAplicacao;

        setContentPane(panelPerfis);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        btnAtleta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Atleta atletaTeste = new Atleta("Foo Bar", 1, "PT", "M", "Judo", 70, "20-1-2003", "test@mail");
                new JanelaAtletaEventos("Eventos", atletaTeste, dadosAplicacao.getListaEventos()).setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        /* DADOS TESTE */
        DadosAplicacao dadosAplicacao = DadosAplicacao.getInstance();

        // inicializacao eventos
        List<Evento> eventosList = dadosAplicacao.getListaEventos();
        Evento evento1 = new Evento("Test event", "1-1-2000", "2-1-2000", "Leiria", "Portugal", "Judo");
        Evento evento2 = new Evento("Second test event", "1-2-2000", "2-2-2000", "Porto", "Portugal", "Aikedor");
        eventosList.add(evento1);
        eventosList.add(evento2);

        // inicializacao atletas
        Atleta atleta1 = new Atleta("Foo Bar", 1, "PT", "M", "Judo", 70, "20-1-2003", "test@mail");
        Atleta atleta2 = new Atleta("Bar Foo", 2, "PT", "M", "Judo", 75, "20-1-2003", "mail@test");
        List<Atleta> atletasList = dadosAplicacao.getListaAtletas();
        atletasList.add(atleta1);
        atletasList.add(atleta2);

        // inicializacao provas
        Prova prova1 = new Prova(70, "M");
        prova1.inscrever(atleta1);
        prova1.inscrever(atleta2);
        Prova prova2 = new Prova(80, "M");
        prova2.inscrever(atleta1);
        prova2.inscrever(atleta2);

        // adicionar provas a eventos
        evento1.addProva(prova1);
        evento1.addProva(prova2);
        evento2.addProva(prova2);

        // combates
        Combate combate1 = new Combate(atleta1, atleta2, "01-01-2000");
        Combate combate2 = new Combate(atleta2, atleta1, "02-01-2000");
        prova1.adicionarCombate(combate1);
        prova1.adicionarCombate(combate2);
        prova2.adicionarCombate(combate2);

        // inscricoes
        Inscricao inscricao1 = new Inscricao(atleta1.getId(), atleta1.getPeso(), atleta1.getGenero(), atleta1.getNome(), prova1);

        new JanelaPerfil("Perfis", dadosAplicacao).setVisible(true);
    }
}
