package exemplo00;

import javax.swing.JFrame;
import java.awt.Color;

public class ExemploJFrame01 {

    public ExemploJFrame01() {
        // cria uma tela
        JFrame tela = new JFrame();

        // define o tamanho da janela
        // width ↔, height ↕
        tela.setSize(500, 500);

        // diz que o layout é nulo
        tela.setLayout(null);

        // passando nulo ele centraliza a janela
        tela.setLocationRelativeTo(null);

        // diz que quando o usuário fechar a aplicação
        // não irá encerrar o aplicativo
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // define o título da janela
        tela.setTitle("HELLO WORLD");

        // import java.awt.Color;
        // tela.getContentPane().setBackground(Color.red);
        tela.getContentPane().setBackground(
                Color.decode("#b3fc2a"));
    }

}
