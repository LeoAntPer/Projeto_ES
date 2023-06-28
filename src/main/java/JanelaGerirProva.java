import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public JanelaGerirProva(String titulo, Prova prova) {
        super(titulo);

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
    }

    public static void main(String[] args) {
        Prova prova = new Prova(70, "M");
        Atleta atleta1 = new Atleta("Foo Bar", 1, "PT", "M", "Judo", 70, "20-1-2003", "test@mail");
        Atleta atleta2 = new Atleta("Bar Foo", 2, "PT", "M", "Judo", 75, "20-1-2003", "mail@test");
        prova.inscrever(atleta1);
        prova.inscrever(atleta2);
        new JanelaGerirProva("Prova", prova).setVisible(true);
    }
}
