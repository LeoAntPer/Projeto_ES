import javax.swing.*;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.LinkedList;

public class JanelaEditarEvento extends JFrame{
    private JPanel panelCriar;
    private JButton btnConfirmar;
    private JButton btnBack;
    private JLabel nomeLbl;
    private JLabel dataInicLbl;
    private JLabel dataFimLbl;
    private JLabel localLbl;
    private JLabel paisLbl;
    private JTextField nomeTextField;
    private JTextField dataInicTextField;
    private JTextField dataFimTextField;
    private JTextField localTextField;
    private JTextField paisTextField;
    private JTextField modalidadeTextField;
    private JLabel modalidadeLbl;
    private Evento evento;

    public JanelaEditarEvento (String titulo, Evento evento) {
        super(titulo);
        this.evento = evento;
        setContentPane(panelCriar);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();

        btnConfirmar.addActionListener(this::btnConfirmarActionPerformer);
    }

        private void btnConfirmarActionPerformer(ActionEvent actionEvent) {
            String nome = nomeTextField.getText();
            String dataInic = dataInicTextField.getText();
            String dataFim = dataFimTextField.getText();
            String local = localTextField.getText();
            String pais = paisTextField.getText();
            String modalidade = modalidadeTextField.getText();

            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            boolean valid = true;
            try{
                dataInic = format.format(format.parse(dataInic));
                dataFim = format.format(format.parse(dataFim));
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro a processar dados inseridos");
            }
            Evento updatedEvento = new Evento(nome, dataInic, dataFim, local, pais, modalidade);
            LinkedList<Evento> eventos =  DadosAplicacao.getInstance().getListaEventos();
            int index = eventos.indexOf(evento);
            eventos.set(index, updatedEvento);
    }

    public static void main(String[] args) {
        new JanelaEditarEvento("Editar Prova", null).setVisible(true);
    }
}
