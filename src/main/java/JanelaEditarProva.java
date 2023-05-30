import javax.swing.*;

public class JanelaEditarProva extends JFrame{
    private JPanel panelEditar;
    private JButton btnConfirmar;
    private JButton btnBack;
    private JTextField generoTextField;
    private JLabel generoLbl;
    private JTextField pesoTextField;
    private JLabel pesoLbl;
    private JTextField modalidadeTextField;
    private JLabel modalidadeLbl;

    public JanelaEditarProva (String titulo) {
        super(titulo);

        setContentPane(panelEditar);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaEditarProva("Editar Prova").setVisible(true);
    }
}
