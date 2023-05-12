import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class JanelaFuncionarioEventos extends JFrame {
    private JPanel panelEventos;
    private JButton btnProvas;
    private JButton btnBack;
    private JList<String> eventosList;

    public JanelaFuncionarioEventos(String titulo) {
        super(titulo);

        List<String> itens;
        itens = new LinkedList<>();
        itens.add("Jujutso - 2022");
        itens.add("Karate - 2022");
        itens.add("Aikedor - 2023");
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for(String item: itens) {
            modeloLista.addElement(item);
        }

        eventosList.setModel(modeloLista);
        DefaultListCellRenderer renderer =  (DefaultListCellRenderer)eventosList.getCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);

        setContentPane(panelEventos);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaFuncionarioEventos("Eventos").setVisible(true);
    }
}
