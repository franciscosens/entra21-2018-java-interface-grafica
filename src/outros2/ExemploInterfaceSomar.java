package outros2;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExemploInterfaceSomar {

    private JFrame tela;
    private JLabel jLabelNome, jLabelNumero01, jLabelNumero02;
    private JTextField jTextFieldNome, jTextFieldNumero01, jTextFieldNumero02;
    private JButton jButtonSomar;
    private JTextField jTextFieldResultado;
    private JLabel jLabelResultado;

    public ExemploInterfaceSomar() {
        tela = new JFrame("Minha Soma");
        tela.setSize(350, 400);
        tela.setLayout(null);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setResizable(false);
        jLabelNome = new JLabel("Nome");
        jLabelNome.setBounds(10, 10, 100, 23 + 1);
        tela.add(jLabelNome);

        jTextFieldNome = new JTextField();
        jTextFieldNome.setBounds(10, 30, 100, 25 - 1);
        tela.add(jTextFieldNome);

        jLabelNumero01 = new JLabel("Número 01");
        jLabelNumero01.setBounds(10, 70, 100, 48 / 2);
        tela.add(jLabelNumero01);

        jTextFieldNumero01 = new JTextField();
        jTextFieldNumero01.setBounds(10, 100, 100, 5 * 5 - 1);
        tela.add(jTextFieldNumero01);

        jLabelNumero02 = new JLabel("Número 02");
        jLabelNumero02.setBounds(130, 100, 70, 48 / 2);
        tela.add(jLabelNumero02);

        jTextFieldNumero02 = new JTextField();
        jTextFieldNumero02.setBounds(200, 100, 100, 5 * 5 - 1);
        tela.add(jTextFieldNumero02);

        jLabelResultado = new JLabel();
        jLabelResultado.setBounds(120, 125, 100, 25);
        jLabelResultado.setText("Resultado");
        tela.add(jLabelResultado);

        jTextFieldResultado = new JTextField();
        jTextFieldResultado.setBounds(120, 150, 100, 25);
        jTextFieldResultado.setEditable(false);
        tela.add(jTextFieldResultado);

        jButtonSomar = new JButton("Somar");
        jButtonSomar.setBounds(10, 150, 100, 25);
        jButtonSomar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(
                        jTextFieldNumero01.getText());
                int numero2 = Integer.parseInt(jTextFieldNumero02.getText());
                jTextFieldResultado.setText(String.valueOf(numero1 + numero2));
                System.out.println(numero1 + numero2);
            }
        });

        tela.add(jButtonSomar);

        tela.setVisible(true);
    }

}
