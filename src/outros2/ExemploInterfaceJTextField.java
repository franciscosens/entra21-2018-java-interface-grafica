package outros2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ExemploInterfaceJTextField {

    private JFrame tela;
    private JTextField jTextFieldNome;
    private JLabel jLabelNome;

    public ExemploInterfaceJTextField() {
        tela = new JFrame();
        tela.setSize(300, 500);
        tela.setLayout(null);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        jLabelNome = new JLabel("Nome");
        jLabelNome.setBounds(10, 10, 100, 25);
        tela.add(jLabelNome);

        jTextFieldNome = new JTextField();
        jTextFieldNome.setBounds(10, 40, 100, 25);
        tela.add(jTextFieldNome);

        tela.setVisible(true);
    }

}
