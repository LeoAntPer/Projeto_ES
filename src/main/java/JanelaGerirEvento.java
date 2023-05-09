import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class JanelaGerirEvento extends JFrame{
    private JPanel panelGerir;
    private JButton btnGerir;
    private JButton btnCriar;
    private JList<String> provasList;
    private JButton btnEditar;
    private JButton btnEliminar;

    public JanelaGerirEvento(String titulo)  {
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

        setContentPane(panelGerir);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new JanelaGerirEvento("Gerir Evento").setVisible(true);
    }
}
