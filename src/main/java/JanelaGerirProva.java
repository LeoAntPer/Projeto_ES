import javax.swing.*;

public class JanelaGerirProva extends JFrame {
    private JPanel panelProva;
    private JButton btnEditar;
    private JButton btnEliminar;
    private JButton btnRegProgresso;
    private JButton btnRegResultado;
    private JButton btnBack;
    private JButton btnListar;
    private JButton btnCalendario;
    private JButton btnAprProgresso;

    public JanelaGerirProva(String titulo) {
        super(titulo);

        setContentPane(panelProva);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaGerirProva("Prova").setVisible(true);
    }
}
