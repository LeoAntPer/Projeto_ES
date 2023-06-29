import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

public class JanelaAdminEventos extends JFrame {
    private JPanel panelPrincipal;
    private JPanel panelButtons;
    private JButton btnCriar;
    private JButton btnGerir;
    private JList<Evento> eventosList;
    private JButton btnBack;
    private final LinkedList<Evento> listaEventos;

    public JanelaAdminEventos (String titulo, LinkedList<Evento> listaEventos) {
        super(titulo);
        this.listaEventos = listaEventos;
        DefaultListModel<Evento> modeloLista = new DefaultListModel<>();
        for(Evento evento: listaEventos) {
            modeloLista.addElement(evento);
        }

        eventosList.setModel(modeloLista);

        setContentPane(panelPrincipal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        btnGerir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Evento eventoSelecionado = eventosList.getSelectedValue();
                if(eventoSelecionado == null) {
                    JOptionPane.showMessageDialog(null, "E preciso selecionar um evento primeiro");
                    return;
                }
                new JanelaGerirEvento("Gerir evento", eventoSelecionado).setVisible(true);
            }
        });

        btnCriar.addActionListener(this::btnCriarActionPerformer);


        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
            }
        });
    }

    private void btnCriarActionPerformer(ActionEvent e) {
        var janela = new JanelaCriarEvento("Criar Evento", listaEventos);
        janela.setVisible(true);
    }

    public static void main(String[] args) {
       new JanelaAdminEventos("Eventos", new LinkedList<>()).setVisible(true);
    }
}
