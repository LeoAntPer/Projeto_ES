import javax.swing.*;
import java.awt.event.ActionEvent;

public class JanelaPrincipalAdmin extends JFrame{
    private JPanel panelOpcoes;
    private JLabel adminLabel;
    private JButton btnGerirEvento;
    private JButton btnGerirAtletas;
    private JButton btnBack;

    public JanelaPrincipalAdmin (String titulo) {
        super(titulo);


        setContentPane(panelOpcoes);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();

        btnGerirEvento.addActionListener(this::btnGerirEventoActionPerformer);
    }

    private void btnGerirEventoActionPerformer(ActionEvent actionEvent) {
        var janela = new JanelaAdminEventos("Eventos", DadosAplicacao.getInstance().getListaEventos());
        janela.setVisible(true);
    }

    public static void main(String[] args) {
        new JanelaPrincipalAdmin("Administrador").setVisible(true);
    }
}
