import javax.swing.*;

public class JanelaGerirAtleta extends JFrame {
    private JPanel panelGerir;
    private JButton btnEditar;
    private JButton btnEliminar;
    private JButton btnBack;

    public JanelaGerirAtleta(String titulo) {
        super(titulo);

        setContentPane(panelGerir);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaGerirAtleta("Gestão de Atleta").setVisible(true);
    }
}
