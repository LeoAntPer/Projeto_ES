import javax.swing.*;

public class JanelaRegistarResultadoProva extends JFrame{
    private JPanel panelRegResultado;
    private JButton btnConfirmar;
    private JButton btnBack;
    private JLabel atletaLbl;
    private JLabel pontosLbl;
    private JLabel posicaoLbl;
    private JLabel pos1Lbl;
    private JLabel pos2Lbl;
    private JLabel pos3Lbl;
    private JTextField atleta1TextField;
    private JTextField atleta2TextField;
    private JTextField atleta3TextField;
    private JTextField pontos1TextField;
    private JTextField pontos2TextField;
    private JTextField pontos3TextField;

    public JanelaRegistarResultadoProva(String titulo) {
        super(titulo);

        setContentPane(panelRegResultado);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaRegistarResultadoProva("Registo do Resultado").setVisible(true);
    }
}
