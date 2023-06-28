import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

public class JanelaAtletaProvas extends JFrame{
    private JPanel panelProvas;
    private JButton btnCalendario;
    private JButton btnBack;
    private JList<Prova> provasList;

    public JanelaAtletaProvas(String titulo, List<Prova> listaProvas) {
        super(titulo);

        DefaultListModel<Prova> modeloLista = new DefaultListModel<>();
        for(Prova prova: listaProvas) {
            modeloLista.addElement(prova);
        }
        provasList.setModel(modeloLista);

        setContentPane(panelProvas);
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
//        new JanelaAtletaProvas("Provas").setVisible(true);
    }
}
