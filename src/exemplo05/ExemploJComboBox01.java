package exemplo05;

import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExemploJComboBox01 {

    public ExemploJComboBox01() {

        JFrame tela = new JFrame("Campo de Seleção");
        tela.setSize(500, 500);
        tela.setLayout(null);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel labelJogo = new JLabel("Jogo");
        labelJogo.setSize(70, 20);
        labelJogo.setLocation(10, 10);

        JComboBox caixaDeSelecao = new JComboBox();
        caixaDeSelecao.setSize(200, 20);
        caixaDeSelecao.setLocation(85, 10);
        // import javax.swing.DefaultComboBoxModel;
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(
                new Object[]{
                    "Bom de guerra", "Fortinaite", "Minicrêfte",
                    "Poquemon", "Farcraie 5"
                }
        );
        caixaDeSelecao.setModel(modelo);
        caixaDeSelecao.setSelectedIndex(-1);

        JButton botao = new JButton("Obter");
        botao.setSize(150, 20);
        botao.setLocation(45, 35);
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (caixaDeSelecao.getSelectedIndex() == -1) {
                    JOptionPane.showMessageDialog(null,
                            "Selecione algum jogo bom");
                    return;
                }

                String jogoSelecionado = caixaDeSelecao
                        .getSelectedItem().toString();
                JOptionPane.showMessageDialog(null,
                        "Jogo selecionado: " + jogoSelecionado);
            }
        });

        tela.add(botao);
        tela.add(labelJogo);
        tela.add(caixaDeSelecao);
        tela.setVisible(true);
    }
}
