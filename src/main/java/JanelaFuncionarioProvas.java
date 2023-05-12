import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class JanelaFuncionarioProvas extends JFrame {
    private JPanel panelProvas;
    private JButton btnAtletas;
    private JButton button2;
    private JList<String> provasList;

    public JanelaFuncionarioProvas(String titulo) {
        super(titulo);

        List<String> itens;
        itens = new LinkedList<>();
        itens.add("Feminino - 75Kg");
        itens.add("Feminino - 90Kg");
        itens.add("Masculino - 100KG");
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for(String item: itens) {
            modeloLista.addElement(item);
        }

        provasList.setModel(modeloLista);
        DefaultListCellRenderer renderer =  (DefaultListCellRenderer)provasList.getCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);

        setContentPane(panelProvas);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaFuncionarioProvas("Provas").setVisible(true);
    }
}
