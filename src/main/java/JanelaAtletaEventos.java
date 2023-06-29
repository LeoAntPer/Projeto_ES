import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

public class JanelaAtletaEventos extends JFrame{
    private JPanel panelEventos;
    private JButton btnInscrever;
    private JButton btnEliminar;
    private JButton btnBack;
    private JList<Evento> eventosList;
    private JButton btnProvas;
    private JButton btnResultado;

    public JanelaAtletaEventos (String titulo, Atleta atleta, List<Evento> listaEventos) {
        super(titulo);

        DefaultListModel<Evento> modeloLista = new DefaultListModel<>();
        for(Evento evento: listaEventos) {
            modeloLista.addElement(evento);
        }
        eventosList.setModel(modeloLista);

        setContentPane(panelEventos);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        btnProvas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Evento eventoSelecionado = eventosList.getSelectedValue();
                if(eventoSelecionado == null) {
                    JOptionPane.showMessageDialog(null, "E preciso selecionar um evento primeiro");
                    return;
                }
                new JanelaAtletaProvas("Provas de evento", eventoSelecionado.getProvas()).setVisible(true);
            }
        });
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
            }
        });
        btnResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Evento eventoSelecionado = eventosList.getSelectedValue();
                if(eventoSelecionado == null) {
                    JOptionPane.showMessageDialog(null, "E preciso selecionar um evento primeiro");
                    return;
                }
                Inscricao inscricao = eventoSelecionado.getInscricao(atleta.getId());
                if (inscricao != null) {
                    JOptionPane.showMessageDialog(null, "Resultado da inscricao: " + inscricao.getStatus());
                    return;
                }
                JOptionPane.showMessageDialog(null, "Nao esta inscrito neste evento");
            }
        });
        btnInscrever.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Evento eventoSelecionado = eventosList.getSelectedValue();
                if(eventoSelecionado == null) {
                    JOptionPane.showMessageDialog(null, "E preciso selecionar um evento primeiro");
                    return;
                }
                if (eventoSelecionado.inscrever(atleta)){
                    JOptionPane.showMessageDialog(null, "Inscricao efetuada com sucesso");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Nao existem provas no evento onde se pode inscrever");
                }
            }
        });
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Evento eventoSelecionado = eventosList.getSelectedValue();
                if(eventoSelecionado == null) {
                    JOptionPane.showMessageDialog(null, "E preciso selecionar um evento primeiro");
                    return;
                }
                Inscricao inscricao = eventoSelecionado.getInscricao(atleta.getId());
                if (inscricao != null) {
                    if(!eventoSelecionado.isOngoing()) {
                        // Confirmacao
                        int response = JOptionPane.showConfirmDialog(null, "Deseja remover a sua inscricao deste evento?",
                                "Confirmar decisao", JOptionPane.YES_NO_OPTION);
                        if (response == JOptionPane.YES_OPTION) {
                            inscricao.setStatus(InscricaoStatus.CANCELED);
                            JOptionPane.showMessageDialog(null, "Inscricao removida com sucesso");
                        }
                    }
                    else {
                        // evento ongoing, nao da para remover inscricao
                        JOptionPane.showMessageDialog(null, "Nao foi possivel remover inscricao pois o evento ja comecou");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Nao foi possivel remover inscricao pois nao esta inscrito no evento selecionado");
                }
            }
        });
    }

    public static void main(String[] args) {
//        new JanelaAtletaEventos("Eventos").setVisible(true);
    }
}
