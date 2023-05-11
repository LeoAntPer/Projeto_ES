import javax.swing.*;

public class JanelaEditarEvento extends JFrame{
    private JPanel panelCriar;
    private JButton btnConfirmar;
    private JButton btnBack;
    private JLabel nomeLbl;
    private JLabel dataInicLbl;
    private JLabel dataFimLbl;
    private JLabel localLbl;
    private JLabel paisLbl;
    private JTextField nomeTextField;
    private JTextField dataInicTextField;
    private JTextField dataFimTextField;
    private JTextField localTextField;
    private JTextField paisTextField;

    public JanelaEditarEvento (String titulo) {
        super(titulo);

        setContentPane(panelCriar);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaEditarEvento("Editar Prova").setVisible(true);
    }
}
