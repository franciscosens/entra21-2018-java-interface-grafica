package outros;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class Exemplo05JCheckBox {

    public Exemplo05JCheckBox() {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel tipo = new JLabel("Tipo:");
        tipo.setBounds(10, 10, 40, 10);
        frame.add(tipo);

        JCheckBox checkBoxCachorro = new JCheckBox();
        checkBoxCachorro.setText("Cachorro");
        checkBoxCachorro.setBounds(10, 40, 130, 20);
        frame.add(checkBoxCachorro);

        JCheckBox checkBoxGato = new JCheckBox();
        checkBoxGato.setText("Gato");
        checkBoxGato.setBounds(10, 80, 130, 20);
        frame.add(checkBoxGato);

        frame.setVisible(true);
    }

}
