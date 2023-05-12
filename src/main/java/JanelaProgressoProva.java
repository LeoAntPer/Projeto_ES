import javax.swing.*;

public class JanelaProgressoProva extends JFrame {
    private JPanel panelProgresso;
    private JButton btnBack;
    private JLabel rondaLbl;
    private JLabel combateLbl;

    public JanelaProgressoProva(String titulo) {
        super(titulo);

        rondaLbl.setText("Ronda 4");
        combateLbl.setText("Combate 2");

        setContentPane(panelProgresso);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaProgressoProva("Progresso Prova").setVisible(true);
    }
}
