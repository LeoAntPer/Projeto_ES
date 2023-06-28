import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class JanelaListaInscritos extends JFrame{
    private JPanel panelInscritos;
    private JButton btnBack;
    private JList<Atleta> inscritosList;
    private JButton btnDesclassificar;

    public JanelaListaInscritos(String titulo, Prova prova) {
        super(titulo);

        // Popular JList
        DefaultListModel<Atleta> modeloLista = new DefaultListModel<>();
        for(Atleta atleta: prova.getInscritos()) {
            modeloLista.addElement(atleta);
        }
        inscritosList.setModel(modeloLista);


        setContentPane(panelInscritos);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
//        new JanelaListaInscritos("Inscritos").setVisible(true);
    }
}
