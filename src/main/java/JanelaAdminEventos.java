import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class JanelaAdminEventos extends JFrame {
    private JPanel panelPrincipal;
    private JPanel panelButtons;
    private JButton btnCriar;
    private JButton btnGerir;
    private JList<String> eventosList;

    public JanelaAdminEventos (String titulo) {
        super(titulo);

        List<String> itens;
        itens = new LinkedList<>();
        itens.add("Jujutso");
        itens.add("Karate");
        itens.add("Aikedor");
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for(String item: itens) {
            modeloLista.addElement(item);
        }

        eventosList.setModel(modeloLista);

        setContentPane(panelPrincipal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaAdminEventos("Eventos").setVisible(true);
    }
}
