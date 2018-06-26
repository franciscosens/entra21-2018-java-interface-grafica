package outros;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Exemplo02JTextField {

    public Exemplo02JTextField() {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel jLabelNome = new JLabel();
        jLabelNome.setBounds(10, 10, 80, 10);
        jLabelNome.setText("Nome");
        frame.add(jLabelNome);

        JTextField jTextFieldNome = new JTextField();
        jTextFieldNome.setBounds(10, 25, 80, 25);
        frame.add(jTextFieldNome);

        frame.setVisible(true);
    }
}
