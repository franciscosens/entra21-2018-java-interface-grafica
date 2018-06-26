package outros;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class Exemplo04JRadioButton {

    public Exemplo04JRadioButton() {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel sexo = new JLabel("Sexo:");
        sexo.setBounds(10, 10, 90, 20);
        frame.add(sexo);

        JRadioButton radioFeminino = new JRadioButton();
        radioFeminino.setText("Feminino");
        radioFeminino.setBounds(10, 40, 90, 20);
        frame.add(radioFeminino);

        JRadioButton radioMasculino = new JRadioButton();
        radioMasculino.setText("Masculino");
        radioMasculino.setBounds(10, 60, 90, 20);
        frame.add(radioMasculino);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radioFeminino);
        grupo.add(radioMasculino);

        frame.setVisible(true);
    }

}
