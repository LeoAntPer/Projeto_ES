import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class JanelaGerirInscricoes extends JFrame {
    private JPanel panelGerir;
    private JButton btnConfirmar;
    private JButton btnRejeitar;
    private JButton btnBack;
    private JList<String> inscricoesList;
    private JButton btnImportar;

    public JanelaGerirInscricoes(String titulo) {
        super(titulo);

        List<String> itens;
        itens = new LinkedList<>();
        itens.add("Karate 2022 - Masculino - 80Kg");
        itens.add("Taekowdo 2022 - Masculino - 80Kg");
        itens.add("Jsujutsu 2023 - Masculino - 80Kg");
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for(String item: itens) {
            modeloLista.addElement(item);
        }

        inscricoesList.setModel(modeloLista);
        DefaultListCellRenderer renderer =  (DefaultListCellRenderer)inscricoesList.getCellRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);

        setContentPane(panelGerir);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaGerirInscricoes("Gerir Inscrições").setVisible(true);
    }
}
