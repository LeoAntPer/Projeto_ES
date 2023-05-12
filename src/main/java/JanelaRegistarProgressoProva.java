import javax.swing.*;

public class JanelaRegistarProgressoProva extends JFrame{
    private JPanel panelRegProgresso;
    private JButton btnConfirmar;
    private JButton btnBack;
    private JTextField rondaTextField;
    private JTextField combateTextField;
    private JLabel rondaLbl;
    private JLabel combateLbl;
    private JLabel vencedorLbl;
    private JTextField vencedorTextField;

    public JanelaRegistarProgressoProva(String titulo){
        super(titulo);

        setContentPane(panelRegProgresso);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaRegistarProgressoProva("Registo do Progresso").setVisible(true);
    }
}
