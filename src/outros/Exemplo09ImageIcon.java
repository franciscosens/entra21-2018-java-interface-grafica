package outros;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exemplo09ImageIcon {

    public Exemplo09ImageIcon() {
        JFrame tela = new JFrame("Minha Ibagem");
        tela.setSize(300, 300);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        URL caminho = Exemplo09ImageIcon.class.getResource("/imagens/iconeJava.png");

        ImageIcon icone = new ImageIcon(caminho);

        JLabel imagem = new JLabel(icone);
        imagem.setBounds(10, 10, 100, 100);

        tela.add(imagem);
        tela.setVisible(true);
    }
}
