import javax.swing.*;

public class JanelaCriarEvento extends JFrame{
    private JPanel panelGerir;
    private JButton btnImportarEvento;
    private JTextField eventoNomeTextField;
    private JLabel eventoNomeLbl;
    private JLabel dataInicioLbl;
    private JTextField dataInicioTextField;
    private JLabel dataFimLbl;
    private JTextField dataFimTextField;
    private JLabel localLbl;
    private JTextField localTextField;
    private JLabel paisLbl;
    private JTextField paisTextField;
    private JButton btnCriarEvento;

    public JanelaCriarEvento (String titulo) {
        super(titulo);

        setContentPane(panelGerir);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaCriarEvento("Criar Evento").setVisible(true);
    }
}
