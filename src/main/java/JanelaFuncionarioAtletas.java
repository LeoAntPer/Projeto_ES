import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class JanelaFuncionarioAtletas extends JFrame {
    private JPanel panelAtletas;
    private JButton btnAlterarPeso;
    private JButton btnBack;
    private JList<String> atletasList;

    public JanelaFuncionarioAtletas(String titulo) {
        super(titulo);

        List<String> itens;
        itens = new LinkedList<>();
        itens.add("Alexa Carinda - 75Kg");
        itens.add("Juliana Jaspar - 75Kg");
        itens.add("Erika Grastoff - 75Kg");
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for(String item: itens) {
            modeloLista.addElement(item);
        }

        atletasList.setModel(modeloLista);
        DefaultListCellRenderer renderer =  (DefaultListCellRenderer)atletasList.getCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);

        setContentPane(panelAtletas);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaFuncionarioAtletas("Atletas").setVisible(true);
    }
}
