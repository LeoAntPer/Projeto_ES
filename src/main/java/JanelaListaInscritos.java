import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class JanelaListaInscritos extends JFrame{
    private JPanel panelInscritos;
    private JButton btnBack;
    private JList<String> inscritosList;
    private JButton btnDesclassificar;

    public JanelaListaInscritos(String titulo) {
        super(titulo);


        List<String> itens;
        itens = new LinkedList<>();
        itens.add("Mário Cabral - 75Kg");
        itens.add("John Johnson - 95Kg");
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for(String item: itens) {
            modeloLista.addElement(item);
        }

        inscritosList.setModel(modeloLista);

        setContentPane(panelInscritos);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaListaInscritos("Inscritos").setVisible(true);
    }
}
