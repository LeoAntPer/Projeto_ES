import javax.swing.*;

public class JanelaEditarAtleta extends JFrame{
    private JPanel panelEditar;
    private JButton btnConfirmar;
    private JButton btnBack;
    private JTextField nomeTextField;
    private JLabel nomeLbl;
    private JLabel paisLbl;
    private JLabel generoLbl;
    private JLabel modalidadeLbl;
    private JLabel pesoLbl;
    private JLabel dataNascLbl;
    private JLabel contactoLbl;
    private JTextField paisTextField;
    private JTextField generoTextField;
    private JTextField modalidadeTextField;
    private JTextField pesoTextField;
    private JTextField dataNascTextField;
    private JTextField contactoTextField;

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
