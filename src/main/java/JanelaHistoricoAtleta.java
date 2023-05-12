import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class JanelaHistoricoAtleta extends JFrame{
    private JPanel panelHistorico;
    private JButton btnBack;
    private JList<String> eventosList;

    public JanelaHistoricoAtleta(String titulo) {
        super(titulo);

        List<String> itens;
        itens = new LinkedList<>();
        itens.add("Jujutso 2020 - Semifinais");
        itens.add("Karate 2022 - 2º lugar");
        itens.add("Aikedor 2022 - 1º lugar");
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for(String item: itens) {
            modeloLista.addElement(item);
        }

        eventosList.setModel(modeloLista);
        DefaultListCellRenderer renderer =  (DefaultListCellRenderer)eventosList.getCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);

        setContentPane(panelHistorico);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaHistoricoAtleta("Histórico").setVisible(true);
    }
}
