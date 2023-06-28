import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class JanelaCalendarioProva extends JFrame{
    private JButton btnBack;
    private JList<Combate> combatesList;
    private JPanel panelCalendario;

    public JanelaCalendarioProva(String titulo, Prova prova) {
        super(titulo);

        DefaultListModel<Combate> modeloLista = new DefaultListModel<>();
        for(Combate combate: prova.getCombates()) {
            modeloLista.addElement(combate);
        }

        combatesList.setModel(modeloLista);
        DefaultListCellRenderer renderer =  (DefaultListCellRenderer)combatesList.getCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);

        setContentPane(panelCalendario);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
//        new JanelaCalendarioProva("Calendário de Provas").setVisible(true);
    }
}
