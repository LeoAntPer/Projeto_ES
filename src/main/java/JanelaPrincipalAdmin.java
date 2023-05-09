import javax.swing.*;

public class JanelaPrincipalAdmin extends JFrame{
    private JPanel panelOpcoes;
    private JLabel adminLabel;
    private JButton btnGerirEvento;
    private JButton btnGerirAtletas;
    private JButton btnVoltar;

    public JanelaPrincipalAdmin (String titulo) {
        super(titulo);


        setContentPane(panelOpcoes);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaPrincipalAdmin("Administrador").setVisible(true);
    }
}
