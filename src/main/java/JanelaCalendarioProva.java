import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class JanelaCalendarioProva extends JFrame{
    private JButton btnBack;
    private JList<String> combatesList;
    private JPanel panelCalendario;

    public JanelaCalendarioProva(String titulo) {
        super(titulo);


        List<String> itens;
        itens = new LinkedList<>();
        itens.add("19/06/2023 - Joaquim Marques -VS- Vasco Ventura - Vencedor: Vasco Ventura");
        itens.add("21/06/2023 - Marco Reis -VS- Luis Bento");
        itens.add("22/06/2023 - Victor Venalti -VS- Alexander Smith");
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for(String item: itens) {
            modeloLista.addElement(item);
        }

        combatesList.setModel(modeloLista);
        DefaultListCellRenderer renderer =  (DefaultListCellRenderer)combatesList.getCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);

        setContentPane(panelCalendario);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaCalendarioProva("Calendário de Provas").setVisible(true);
    }
}
