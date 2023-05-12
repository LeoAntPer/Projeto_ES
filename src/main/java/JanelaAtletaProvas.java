import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class JanelaAtletaProvas extends JFrame{
    private JPanel panelProvas;
    private JButton btnCalendario;
    private JButton btnBack;
    private JList<String> provasList;

    public JanelaAtletaProvas(String titulo) {
        super(titulo);

        List<String> itens;
        itens = new LinkedList<>();
        itens.add("Masculino-75Kg");
        itens.add("Masculino-100Kg");
        itens.add("Feminino-70Kg");
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for(String item: itens) {
            modeloLista.addElement(item);
        }

        provasList.setModel(modeloLista);

        setContentPane(panelProvas);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaAtletaProvas("Provas").setVisible(true);
    }
}
