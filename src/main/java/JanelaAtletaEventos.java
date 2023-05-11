import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class JanelaAtletaEventos extends JFrame{
    private JPanel panelEventos;
    private JButton btnInscrever;
    private JButton btnEliminar;
    private JButton btnBack;
    private JList<String> eventosList;

    public JanelaAtletaEventos (String titulo) {
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

        setContentPane(panelEventos);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaAtletaEventos("Eventos").setVisible(true);
    }
}
