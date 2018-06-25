package exemplo04;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class ExemploJButton02 {

    public ExemploJButton02() {

        JFrame tela = new JFrame("HOVER");
        tela.setSize(500, 500);
        tela.setLayout(null);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton botao = new JButton("Não venha aqui");
        botao.setSize(400, 300);
        botao.setLocation(45, 140);
        botao.setBackground(Color.decode("#23dd3f"));
        // import java.awt.event.MouseEvent;
        // import java.awt.event.MouseAdapter;
        // remove borda ao redor do texto
        botao.setFocusPainted(false);
        // remove borda ao redor do botão
        botao.setBorderPainted(false);
        botao.addMouseListener(new MouseAdapter() {
            // evento quando o mouse entra no botão
            @Override
            public void mouseEntered(MouseEvent e) {
                botao.setBackground(Color.decode("#ffe105"));
            }

            // evento quando o mouse sai no botão
            @Override
            public void mouseExited(MouseEvent e) {
                botao.setBackground(Color.decode("#23dd3f"));
            }
        });

        tela.add(botao);

        tela.setVisible(true);
    }
}
