import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

public class JanelaListaInscritos extends JFrame{
    private JPanel panelInscritos;
    private JButton btnBack;
    private JList<Inscricao> inscritosList;
    private JButton btnDesclassificar;

    public JanelaListaInscritos(String titulo, Prova prova) {
        super(titulo);

        // Popular JList
        DefaultListModel<Inscricao> modeloLista = new DefaultListModel<>();
        for(Inscricao inscricao: prova.getInscritos()) {
            modeloLista.addElement(inscricao);
        }
        inscritosList.setModel(modeloLista);


        setContentPane(panelInscritos);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
//        new JanelaListaInscritos("Inscritos").setVisible(true);
    }
}
