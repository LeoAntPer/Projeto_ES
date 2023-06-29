import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.LinkedList;

public class JanelaCriarEvento extends JFrame{
    private JPanel panelCriar;
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
    private JButton btnBack;
    private JLabel modalidadeLbl;
    private JTextField modalidadeTextField;
    private LinkedList<Evento> listaEventos;

    public JanelaCriarEvento (String titulo, LinkedList<Evento> eventos) {
        super(titulo);
        listaEventos = eventos;
        setContentPane(panelCriar);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();

        btnCriarEvento.addActionListener(this::btnCriarEventoActionPerformer);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
            }
        });
    }

    public void btnCriarEventoActionPerformer(ActionEvent e) {
        String nome = eventoNomeTextField.getText();
        String dataInic = dataInicioTextField.getText();
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
        Evento newEvento = new Evento(nome, dataInic, dataFim, local, pais, modalidade);
        listaEventos.add(newEvento);
    }

    public static void main(String[] args) {
        new JanelaCriarEvento("Criar Evento", new LinkedList<>()).setVisible(true);
    }
}
