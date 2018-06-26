package outros2;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExemploInterfaceJCheckBox {

    private JFrame tela;
    private JCheckBox preto, branco, amarelo;
    private JButton verificarSelecionado, limparSelecionado;

    public ExemploInterfaceJCheckBox() {
        criarTela();
        tela.setVisible(true);
    }

    public void criarTela() {
        tela = new JFrame();
        tela.setSize(450, 300);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        criarJCheckBox();
        criarBotaoVerificaSelecionado();
        limparSelecionados();
    }

    public void criarJCheckBox() {
        preto = new JCheckBox("Preto");
        branco = new JCheckBox("Branco");
        amarelo = new JCheckBox("Amarelo");

        preto.setBounds(10, 40, 100, 25);
        branco.setBounds(150, 40, 100, 25);
        amarelo.setBounds(260, 40, 100, 25);

        tela.add(preto);
        tela.add(amarelo);
        tela.add(branco);
    }

    public void mostrarMensagem(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    public void limparSelecionados() {
        limparSelecionado = new JButton("Limpar");
        limparSelecionado.setBounds(120, 75, 100, 25);
        tela.add(limparSelecionado);
        limparSelecionado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                preto.setSelected(false);
                amarelo.setSelected(false);
                branco.setSelected(false);
            }
        });
    }

    public void criarBotaoVerificaSelecionado() {
        verificarSelecionado = new JButton(
                "Verificar Selecionado");
        verificarSelecionado.setBounds(10, 75, 100, 25);
        tela.add(verificarSelecionado);
        verificarSelecionado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (preto.isSelected()) {
                    mostrarMensagem("Preto");
                }
                if (branco.isSelected()) {
                    mostrarMensagem("Branco");
                }
                if (amarelo.isSelected()) {
                    mostrarMensagem("Amarelo");
                }
                if (!amarelo.isSelected()
                        && !preto.isSelected()
                        && !branco.isSelected()) {
                    mostrarMensagem("None");
                }
            }
        });

    }
}
