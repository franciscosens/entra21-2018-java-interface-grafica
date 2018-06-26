package outros2;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExemploInterfaceJRadioButton {

    private JFrame tela;
    private JRadioButton homi, muie;
    private ButtonGroup meuGrupinho;
    private JButton verificarSelecionado, limparSelecionado;

    public ExemploInterfaceJRadioButton() {
        criarTela();
        tela.setVisible(true);
    }

    public void criarTela() {
        tela = new JFrame();
        tela.setSize(300, 300);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        criarJRadioButton();
        criarBotaoVerificaSelecionado();
        limparSelecionados();
    }

    public void criarJRadioButton() {
        JLabel tipoIngresso = new JLabel("Ingresso");
        tipoIngresso.setBounds(10, 10, 100, 25);
        tela.add(tipoIngresso);

        homi = new JRadioButton("Homi");
        homi.setBounds(10, 40, 100, 25);
        tela.add(homi);

        muie = new JRadioButton("Muié");
        muie.setBounds(10, 75, 100, 25);
        tela.add(muie);

        meuGrupinho = new ButtonGroup();
        meuGrupinho.add(homi);
        meuGrupinho.add(muie);
    }

    public void criarBotaoVerificaSelecionado() {
        verificarSelecionado = new JButton("Verifica");
        verificarSelecionado.setBounds(10, 110, 100, 25);
        verificarSelecionado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (homi.isSelected()) {
                    JOptionPane
                            .showMessageDialog(null, "Homem");
                } else if (muie.isSelected()) {
                    JOptionPane
                            .showMessageDialog(null, "Mulher");
                } else {
                    JOptionPane
                            .showMessageDialog(null, "Nenhum");
                }
            }
        });

        tela.add(verificarSelecionado);
    }

    public void limparSelecionados() {
        limparSelecionado = new JButton("Limpar");
        limparSelecionado.setBounds(120, 110, 100, 25);
        limparSelecionado.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("**");
                System.out.println("--");
                meuGrupinho.clearSelection();
            }
        });

        tela.add(limparSelecionado);
    }

}
