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
    private final Evento evento;
    private final LinkedList<Prova> provas;

    public JanelaGerirEvento(String titulo, Evento evento)  {
        super(titulo);
        this.evento = evento;
        provas = evento.getProvas();
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
                new JanelaGerirProva("Gerir Prova", provaSelecionada, provas).setVisible(true);
            }
        });
        btnEliminar.addActionListener(this::btnEliminarActionPerformer);
        btnEditar.addActionListener(this::btnEditarActionPerformer);
        btnCriar.addActionListener(this::btnCriarActionPerformer);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
            }
        });
    }

    private void btnCriarActionPerformer(ActionEvent actionEvent) {
        var janela = new JanelaCriarProva("Nova Prova", provas);
        janela.setVisible(true);
    }

    private void btnEditarActionPerformer(ActionEvent actionEvent) {
        var janela = new JanelaEditarEvento("Edição", evento);
        janela.setVisible(true);
    }

    public void btnEliminarActionPerformer(ActionEvent actionEvent) {
        DadosAplicacao.getInstance().getListaEventos().remove(evento);
    }

    public static void main(String[] args) {
//        new JanelaGerirEvento("Gerir Evento").setVisible(true);
    }
}
