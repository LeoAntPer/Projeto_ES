import javax.swing.*;

public class JanelaPerfil extends JFrame {
    private JPanel panelPerfis;
    private JButton btnFuncionario;
    private JButton btnAtleta;
    private JButton btnAdmin;
    private JLabel perfilLabel;

    public JanelaPerfil(String titulo) {
        super(titulo);

        setContentPane(panelPerfis);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaPerfil("Perfis").setVisible(true);
    }
}
