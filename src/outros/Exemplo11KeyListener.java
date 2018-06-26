package outros;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Exemplo11KeyListener {

    private JTextField campo;
    private int x = 10, y = 10, width = 100, height = 25;

    public Exemplo11KeyListener() {
        JFrame tela = new JFrame("Exemplo Key Listener");
        tela.setSize(500, 500);
        tela.setLayout(null);
        tela.setLocationRelativeTo(null);
        tela.setUndecorated(true);
        tela.setResizable(false);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton sair = new JButton("x");
        sair.setBounds(tela.getWidth() - 40, 0, 40, 30);
        sair.setFont(new Font("", Font.BOLD, 15));
        sair.setBackground(Color.RED);
        sair.setForeground(Color.WHITE);
        sair.setFocusPainted(false);
        sair.setBorder(null);
        sair.addMouseListener(new MouseListener() {
            @Override
            public void mouseReleased(MouseEvent e) {
                tela.dispose();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                sair.setBackground(Color.DARK_GRAY);
                sair.setForeground(Color.GREEN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                sair.setBackground(Color.RED);
                sair.setForeground(Color.WHITE);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                sair.setBackground(Color.BLACK);
                sair.setForeground(Color.WHITE);
            }

            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });;

        tela.add(sair);

        campo = new JTextField();
        campo.setBounds(x, y, width, height);
        tela.add(campo);

        campo.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                // System.out.println(LocalDateTime.now() + " keyTyped " +
                // String.valueOf(e.getKeyChar()));
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // System.out.println(LocalDateTime.now() + " keyReleased " +
                // String.valueOf(e.getKeyChar()) + " - " + e.getKeyCode());
                // System.zout.println("\n\n\n");

                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    if (x - 20 > 0) {
                        x = x - 20;
                        campo.setBounds(x, y, width, height);
                    }
                } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                    if (y - 20 > 0) {
                        y -= 20;
                        campo.setBounds(x, y, width, height);
                    }

                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if ((y + 20 + campo.getHeight()) < tela.getHeight()) {
                        y += 20;
                        campo.setBounds(x, y, width, height);
                    }
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    if (x + 20 + campo.getWidth() < tela.getWidth()) {
                        x += 20;
                        campo.setBounds(x, y, width, height);
                    }
                }

            }

            @Override
            public void keyPressed(KeyEvent e) {
                // System.out.println(LocalDateTime.now() + " keyPressed " +
                // String.valueOf(e.getKeyChar()));

            }
        });

        tela.setVisible(true);
        campo.requestFocus();
    }

}
