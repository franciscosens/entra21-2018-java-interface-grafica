package outros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exemplo08JButton {

    public Exemplo08JButton() {

        JFrame tela = new JFrame();
        tela.setSize(300, 300);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLayout(null);

        JButton ola = new JButton("Apresentar Mensagem");
        ola.setBounds(10, 10, 200, 20);
        ola.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Olá Usuário");
            }

        });

        tela.add(ola);
        tela.setVisible(true);

    }

}
