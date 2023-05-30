import javax.swing.*;

public class JanelaCriarProva extends JFrame{
    private JPanel panelCriar;
    private JButton btnCriar;
    private JButton btnBack;
    private JTextField generoTextField;
    private JLabel generoLbl;
    private JTextField pesoTextField;
    private JLabel pesoLbl;
    private JButton btnImportar;
    private JLabel modalidadeLbl;
    private JTextField modalidadeTextField;

    public JanelaCriarProva(String titulo) {
        super(titulo);

        setContentPane(panelCriar);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaCriarProva("Criar Prova").setVisible(true);
    }
}
