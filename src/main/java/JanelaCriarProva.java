import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.LinkedList;

public class JanelaCriarProva extends JFrame{
    private JPanel panelCriar;
    private JButton btnCriar;
    private JButton btnBack;
    private JTextField generoTextField;
    private JLabel generoLbl;
    private JTextField pesoTextField;
    private JLabel pesoLbl;
    private JButton btnImportar;
    private JLabel modalidadeLbl;
    private JTextField modalidadeTextField;
    private final LinkedList<Prova> provas;

    public JanelaCriarProva(String titulo, LinkedList<Prova> provas) {
        super(titulo);
        this.provas = provas;
        setContentPane(panelCriar);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();

        btnCriar.addActionListener(this::btnCriarActionPerformer);
    }

    private void btnCriarActionPerformer(ActionEvent actionEvent) {
        int peso = 0;
        try {
            peso = Integer.parseInt(pesoTextField.getText());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao processar os dados");
        }
        finally {
            String genero = generoTextField.getText();

            Prova newProva = new Prova(peso, genero);
            provas.add(newProva);
        }
    }

    public static void main(String[] args) {
        new JanelaCriarProva("Criar Prova", new LinkedList<>()).setVisible(true);
    }
}
