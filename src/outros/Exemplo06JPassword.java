package outros;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exemplo06JPassword {

    public Exemplo06JPassword() {
        JFrame tela = new JFrame();
        tela.setSize(300, 300);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel labelLogin = new JLabel("Login");
        labelLogin.setBounds(10, 10, 100, 20);

        JTextField login = new JTextField();
        login.setBounds(10, 40, 100, 20);

        JLabel labelSenha = new JLabel("Senha");
        labelSenha.setBounds(10, 90, 100, 20);

        JPasswordField senha = new JPasswordField();
        senha.setBounds(10, 120, 100, 20);

        JButton logar = new JButton("Entrar");
        logar.setBounds(60, 150, 100, 20);

        logar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuarioLogin = login.getText();
                char[] usuarioSenhaChar = senha.getPassword();
                String usuarioSenha = String.valueOf(usuarioSenhaChar);
                System.out.println(usuarioSenha);
                if (usuarioLogin.equalsIgnoreCase("francisgod") && usuarioSenha.equals("1234")) {
                    JOptionPane.showMessageDialog(null, "OK");
                } else {
                    JOptionPane.showMessageDialog(null, "Login e/ou senha incorretos");
                }
            }
        });

        tela.add(labelLogin);
        tela.add(login);
        tela.add(labelSenha);
        tela.add(senha);
        tela.add(logar);

        tela.setVisible(true);

    }

}
