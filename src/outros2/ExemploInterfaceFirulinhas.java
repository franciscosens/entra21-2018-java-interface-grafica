package outros2;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ExemploInterfaceFirulinhas {

    private JFrame tela;
    private JTextArea textinho;
    private JButton jButtonRose;
    private JTextField campoOuvidor;
    private JLabel pontinho;

    public ExemploInterfaceFirulinhas() {
        criarTela();
        tela.setVisible(true);
    }

    public void criarTela() {
        tela = new JFrame("Exemplo de Firulinhas");
        tela.setSize(800, 800);
        tela.setLayout(null);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        criarCampoBorda();
        botaoComFirulinha();
        joguinhoDoPontinho();
    }

    public void criarCampoBorda() {
        textinho = new JTextArea();
        textinho.setBounds(10, 10, 200, 100);
        Border borda = BorderFactory.createLineBorder(Color.PINK);
        textinho.setBorder(BorderFactory.createCompoundBorder(borda, BorderFactory.createEmptyBorder(10, 0, 10, 30)));
        // top, left, bottom, right
        tela.add(textinho);
    }

    public void botaoComFirulinha() {
        jButtonRose = new JButton("Rose Bonbon");
        jButtonRose.setBackground(new Color(249, 66, 158));
        jButtonRose.setBounds(220, 10, 160, 30);
        jButtonRose.setForeground(Color.WHITE);
        //import java.awt.event.MouseAdapter;
        //import java.awt.event.MouseEvent;
//https://docs.oracle.com/javase/7/docs/api/java/awt/event/MouseAdapter.html
        jButtonRose.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                jButtonRose.setBackground(Color.BLACK);
                jButtonRose.setForeground(Color.YELLOW);
            }

            public void mouseExited(MouseEvent evt) {
                jButtonRose.setBackground(Color.BLUE);
                jButtonRose.setForeground(Color.GREEN);
            }

            public void mousePressed(MouseEvent evt) {
                jButtonRose.setBackground(Color.ORANGE);
                jButtonRose.setForeground(Color.BLACK);
            }

            public void mouseClicked(MouseEvent evt) {
                jButtonRose.setBackground(new Color(239, 218, 95));
                jButtonRose.setForeground(Color.BLACK);
            }

            public void mouseReleased(MouseEvent evt) {
                jButtonRose.setBackground(Color.WHITE);
                jButtonRose.setForeground(Color.BLACK);
            }
        });

        tela.add(jButtonRose);
    }

    public void joguinhoDoPontinho() {
        pontinho = new JLabel("•");
        pontinho.setBounds(100, 250, 40, 40);
        tela.add(pontinho);

        campoOuvidor = new JTextField();
        campoOuvidor.setBounds(0, 200, 100, 20);
        // javac -encodign utf8 sauuahssa.java
        campoOuvidor.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        pontinho.setLocation(pontinho.getX(), pontinho.getY() - 10);
                        System.out.println("CIMA");
                        break;
                    case KeyEvent.VK_DOWN:
                        pontinho.setLocation(pontinho.getX(), pontinho.getY() + 10);
                        System.out.println("BAIXO");
                        break;
                    case KeyEvent.VK_LEFT:
                        pontinho.setLocation(pontinho.getX() - 10, pontinho.getY());
                        System.out.println("ESQUERDA");
                        break;
                    case KeyEvent.VK_RIGHT:
                        pontinho.setLocation(pontinho.getX() + 10, pontinho.getY());
                        System.out.println("DIREITA");
                        break;
                }
            }
        });
        tela.add(campoOuvidor);

    }

}
