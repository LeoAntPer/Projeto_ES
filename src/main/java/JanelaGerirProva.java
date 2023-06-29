import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class JanelaGerirProva extends JFrame {
    private JPanel panelProva;
    private JButton btnEditar;
    private JButton btnEliminar;
    private JButton btnRegProgresso;
    private JButton btnRegResultado;
    private JButton btnBack;
    private JButton btnListar;
    private JButton btnCalendario;
    private JButton btnAprProgresso;
    private Prova prova;
    private LinkedList<Prova> provas;

    public JanelaGerirProva(String titulo, Prova prova, LinkedList<Prova> provas) {
        super(titulo);
        this.prova = prova;
        this.provas = provas;
        setContentPane(panelProva);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new JanelaListaInscritos("Lista de inscritos", prova).setVisible(true);
            }
        });
        btnCalendario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new JanelaCalendarioProva("Calendario da prova", prova);
            }
        });
        btnCalendario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new JanelaCalendarioProva("Calendario da prova", prova).setVisible(true);
            }
        });
        btnEditar.addActionListener(this::btnEditarActionPerformer);
        btnEliminar.addActionListener(this::btnEliminarActionPerformer);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
            }
        });
    }

    private void btnEliminarActionPerformer(ActionEvent actionEvent) {
        int choice = JOptionPane.showConfirmDialog(null, "Tem a certeza que quer eliminar a prova?",
                "Confirmação", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION) {
            provas.remove(prova);
            JOptionPane.showMessageDialog(null, "Prova eliminada com sucesso!");
        }
    }

    private void btnEditarActionPerformer(ActionEvent actionEvent) {
        var janela = new JanelaEditarProva("Edição", prova, provas);
    }

    public static void main(String[] args) {
        Prova prova = new Prova(70, "M");
        Atleta atleta1 = new Atleta("Foo Bar", 1, "PT", "M", "Judo", 70, "20-1-2003", "test@mail");
        Atleta atleta2 = new Atleta("Bar Foo", 2, "PT", "M", "Judo", 75, "20-1-2003", "mail@test");
        prova.inscrever(atleta1);
        prova.inscrever(atleta2);
        new JanelaGerirProva("Prova", prova, new LinkedList<>()).setVisible(true);
    }
}
