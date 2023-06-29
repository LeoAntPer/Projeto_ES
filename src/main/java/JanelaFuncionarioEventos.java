import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class JanelaFuncionarioEventos extends JFrame {
    private JPanel panelEventos;
    private JButton btnProvas;
    private JButton btnBack;
    private JList<Evento> eventosList;
    private LinkedList<Evento> eventos;

    public JanelaFuncionarioEventos(String titulo, LinkedList<Evento> listaEventos) {
        super(titulo);
        eventos = listaEventos;
        DefaultListModel<Evento> modeloLista = new DefaultListModel<>();
        for(Evento evento: listaEventos) {
            modeloLista.addElement(evento);
        }

        eventosList.setModel(modeloLista);

        DefaultListCellRenderer renderer =  (DefaultListCellRenderer)eventosList.getCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);

        setContentPane(panelEventos);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaFuncionarioEventos("Eventos", new LinkedList<>()).setVisible(true);
    }
}
