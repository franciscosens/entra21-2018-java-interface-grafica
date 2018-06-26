package outros2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class ExemploInterfaceJLabel {

    private JFrame tela;
    private JLabel jLabelNome;

    public ExemploInterfaceJLabel() {
        tela = new JFrame("Exemplo JLabel");
        tela.setSize(400, 300);
        tela.setLayout(null);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // remove a borda do windows e o botão de fechar
        tela.setUndecorated(true);

        jLabelNome = new JLabel("Nome");
        // set bounds defini a posição na tela
        // (x, y, largura, altura) px
        //jLabelNome.setBounds(10, 20, 100, 25);
        jLabelNome.setBounds((tela.getWidth() / 2) - (100 / 2),
                (tela.getHeight() / 2) - (25 / 2), 100, 25);
        // centralizar o texto
        jLabelNome.setHorizontalAlignment(JLabel.CENTER);

        // set Foreground seria a cor da fonte
        jLabelNome.setForeground(Color.RED);
        jLabelNome.setOpaque(true);
        // set Background seria a cor do fundo
        jLabelNome.setBackground(Color.BLACK);

        tela.add(jLabelNome);
        tela.setVisible(true);
    }

}
