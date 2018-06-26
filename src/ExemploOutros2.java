
import exemplo07.ExemploJRadioButton01;
import exemplo08.ExemploJCheckBox01;
import exemplo08.JFrameBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import outros2.*;

/**
 * @author Francisco Lucas Sens
 */
public class ExemploOutros2 implements JFrameBaseInterface {

    private JFrame jFrame;
    private JButton jButton01;
    private JButton jButton02;
    private JButton jButton03;
    private JButton jButton04;
    private JButton jButton05;
    private JButton jButton06;
    private JButton jButton07;
    private JButton jButton08;

    public ExemploOutros2() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoJButton00();
        acaoJButton01();
        acaoJButton02();
        acaoJButton03();
        acaoJButton04();
        acaoJButton05();
        acaoJButton06();
        acaoJButton07();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jButton01);
        jFrame.add(jButton02);
        jFrame.add(jButton03);
        jFrame.add(jButton04);
        jFrame.add(jButton05);
        jFrame.add(jButton06);
        jFrame.add(jButton07);
        jFrame.add(jButton08);
    }

    @Override
    public void instanciarComponentes() {
        jButton01 = new JButton("Exemplo 01");
        jButton02 = new JButton("Exemplo 02");
        jButton03 = new JButton("Exemplo 03");
        jButton04 = new JButton("Exemplo 04");
        jButton05 = new JButton("Exemplo 05");
        jButton06 = new JButton("Exemplo 06");
        jButton07 = new JButton("Exemplo 07");
        jButton08 = new JButton("Exemplo 08");
    }

    @Override
    public void gerarLocalizacoes() {
        jButton01.setLocation(10, 10);
        jButton02.setLocation(120, 10);
        jButton03.setLocation(230, 10);
        jButton04.setLocation(340, 10);
        jButton05.setLocation(10, 120);
        jButton06.setLocation(120, 120);
        jButton07.setLocation(230, 120);
        jButton08.setLocation(340, 120);
    }

    @Override
    public void gerarDimensoes() {
        jButton01.setSize(100, 100);
        jButton02.setSize(100, 100);
        jButton03.setSize(100, 100);
        jButton04.setSize(100, 100);
        jButton05.setSize(100, 100);
        jButton06.setSize(100, 100);
        jButton07.setSize(100, 100);
        jButton08.setSize(100, 100);
    }

    public void acaoJButton00() {
        jButton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExemploInterfaceJLabel();
            }
        });
    }

    public void acaoJButton01() {
        jButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExemploInterfaceJTextField();
            }
        });
    }

    public void acaoJButton02() {
        jButton03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExemploInterfaceJButton();
            }
        });
    }

    public void acaoJButton03() {
        jButton04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExemploInterfaceSomar();
            }
        });
    }

    public void acaoJButton04() {
        jButton05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExemploInterfaceJCheckBox();
            }
        });
    }

    public void acaoJButton05() {
        jButton06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExemploInterfaceJRadioButton();
            }
        });
    }

    public void acaoJButton06() {
        jButton07.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExemploInterfaceJTextArea();
            }
        });
    }

    public void acaoJButton07() {
        jButton08.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExemploInterfaceFirulinhas();
            }
        });
    }

}
