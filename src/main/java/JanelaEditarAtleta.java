import javax.swing.*;

public class JanelaEditarAtleta extends JFrame{
    private JPanel panelEditar;
    private JButton btnConfirmar;
    private JButton btnBack;
    private JTextField textField1;
    private JLabel nomeLbl;
    private JLabel paisLbl;
    private JLabel generoLbl;
    private JLabel modalidadeLbl;
    private JLabel pesoLbl;
    private JLabel dataNascLbl;
    private JLabel contactoLbl;

    public JanelaEditarAtleta (String titulo) {
        super(titulo);

        setContentPane(panelEditar);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaEditarAtleta("Editar Atleta").setVisible(true);
    }
}
