import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.LinkedList;

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
    private Prova prova;
    private LinkedList<Prova> provas;

    public JanelaEditarProva (String titulo, Prova prova, LinkedList<Prova> provas) {
        super(titulo);
        this.prova = prova;
        this.provas = provas;
        setContentPane(panelEditar);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();

        btnConfirmar.addActionListener(this::btnConfirmarActionPerformer);
    }

    private void btnConfirmarActionPerformer(ActionEvent actionEvent) {
        int peso = 0;
        try {
            peso = Integer.parseInt(pesoTextField.getText());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao processar os dados");
        }
        finally {
            String genero = generoTextField.getText();
            Prova updatedProva = new Prova(peso, genero);

            int indice = provas.indexOf(prova);
            provas.set(indice, updatedProva);
        }
    }

    public static void main(String[] args) {
        new JanelaEditarProva("Editar Prova", null, new LinkedList<>()).setVisible(true);
    }
}
