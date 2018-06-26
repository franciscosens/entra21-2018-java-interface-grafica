package outros;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exemplo03JTextAreaJButton {

    public Exemplo03JTextAreaJButton() {
        JFrame tela = new JFrame();
        tela.setSize(300, 300);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JTextArea texto = new JTextArea();
        texto.setBounds(10, 10, 180, 100);
        tela.add(texto);

        JButton ok = new JButton();
        ok.setText("Ok");
        ok.setBounds(10, 120, 80, 30);
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, texto.getText());
            }
        });
        tela.add(ok);

        JButton limpar = new JButton("Limpar");
        limpar.setBounds(100, 120, 80, 30);
        limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto.setText("");
            }
        });
        tela.add(limpar);

        JButton exit = new JButton("Exit");
        exit.setBounds(10, 150, 80, 30);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        tela.add(exit);

        tela.setVisible(true);
    }
}
