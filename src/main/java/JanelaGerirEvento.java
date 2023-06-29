import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

public class JanelaGerirEvento extends JFrame{
    private JPanel panelGerir;
    private JButton btnGerir;
    private JButton btnCriar;
    private JList<Prova> provasList;
    private JButton btnEditar;
    private JButton btnEliminar;
    private JButton btnBack;
    private JButton btnFecharInsc;

    public JanelaGerirEvento(String titulo, Evento evento)  {
        super(titulo);

        DefaultListModel<Prova> modeloLista = new DefaultListModel<>();
        for(Prova prova: evento.getProvas()) {
            modeloLista.addElement(prova);
        }

        provasList.setModel(modeloLista);

        setContentPane(panelGerir);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        btnGerir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Prova provaSelecionada = provasList.getSelectedValue();
                if(provaSelecionada == null) {
                    JOptionPane.showMessageDialog(null, "E preciso selecionar uma prova primeiro");
                    return;
                }
                new JanelaGerirProva("Gerir Prova", provaSelecionada).setVisible(true);
            }
        });
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
//        new JanelaGerirEvento("Gerir Evento").setVisible(true);
    }
}
