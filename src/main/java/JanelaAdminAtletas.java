import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class JanelaAdminAtletas extends JFrame{
    private JPanel panelAtletas;
    private JButton btnCriar;
    private JButton btnGerir;
    private JButton btnBack;
    private JList<String> atletasList;

    public JanelaAdminAtletas (String titulo) {
        super(titulo);

        List<String> itens;
        itens = new LinkedList<>();
        itens.add("Mário Cabral");
        itens.add("Filipa Anilo");
        itens.add("John Johnson");
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for(String item: itens) {
            modeloLista.addElement(item);
        }

        atletasList.setModel(modeloLista);

        setContentPane(panelAtletas);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaAdminAtletas("Atletas").setVisible(true);
    }
}
