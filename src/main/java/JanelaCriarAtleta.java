import javax.swing.*;

public class JanelaCriarAtleta extends JFrame{
    private JPanel panelCriar;
    private JButton btnCriar;
    private JButton btnBack;
    private JLabel nomeLbl;
    private JTextField nomeTextField;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JLabel paisLbl;
    private JLabel generoLbl;
    private JLabel modalidadeLbl;
    private JLabel pesoLbl;
    private JLabel dataNascLbl;
    private JLabel contactoLbl;

    public JanelaCriarAtleta (String titulo) {
        super(titulo);

        setContentPane(panelCriar);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaCriarAtleta("Novo Atleta").setVisible(true);
    }
}
