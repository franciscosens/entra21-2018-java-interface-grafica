
import exemplo00.ExemploJFrame01;
import exemplo01.ExemploJButton01;
import exemplo02.ExemploJLabel01;
import exemplo03.ExemploJTextField01;
import exemplo04.ExemploJButton02;
import exemplo05.ExemploJComboBox01;
import exemplo06.ExemploJTextArea01;
import exemplo07.ExemploJRadioButton01;
import exemplo08.ExemploJCheckBox01;
import exemplo08.JFrameBaseInterface;
import exemplo09.ExemploJTable01;
import exemplo10.ExemploHospitalJFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import outros.Exemplo01JFrame;
import outros.Exemplo02JTextField;
import outros.Exemplo03JTextAreaJButton;
import outros.Exemplo04JRadioButton;
import outros.Exemplo05JCheckBox;
import outros.Exemplo06JPassword;
import outros.Exemplo07JComboBox;
import outros.Exemplo08JButton;
import outros.Exemplo09ImageIcon;
import outros.Exemplo10JTable;
import outros.Exemplo11KeyListener;

/**
 * @author Francisco Lucas Sens
 */
public class ExemploOutros implements JFrameBaseInterface {

    private JFrame jFrame;
    private JButton jButton01;
    private JButton jButton02;
    private JButton jButton03;
    private JButton jButton04;
    private JButton jButton05;
    private JButton jButton06;
    private JButton jButton07;
    private JButton jButton08;
    private JButton jButton09;
    private JButton jButton10;
    private JButton jButton11;

    public ExemploOutros() {
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
        acaoJButton08();
        acaoJButton09();
        acaoJButton10();
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
        jFrame.add(jButton09);
        jFrame.add(jButton10);
        jFrame.add(jButton11);
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
        jButton09 = new JButton("Exemplo 09");
        jButton10 = new JButton("Exemplo 10");
        jButton11 = new JButton("Exemplo 11");
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
        jButton09.setLocation(10, 230);
        jButton10.setLocation(120, 230);
        jButton11.setLocation(230, 230);
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
        jButton09.setSize(100, 100);
        jButton10.setSize(100, 100);
        jButton11.setSize(100, 100);
    }

    public void acaoJButton00() {
        jButton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exemplo01JFrame();
            }
        });
    }

    public void acaoJButton01() {
        jButton02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exemplo02JTextField();
            }
        });
    }

    public void acaoJButton02() {
        jButton03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exemplo03JTextAreaJButton();
            }
        });
    }

    public void acaoJButton03() {
        jButton04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exemplo04JRadioButton();
            }
        });
    }

    public void acaoJButton04() {
        jButton05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exemplo05JCheckBox();
            }
        });
    }

    public void acaoJButton05() {
        jButton06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exemplo06JPassword();
            }
        });
    }

    public void acaoJButton06() {
        jButton07.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exemplo07JComboBox();
            }
        });
    }

    public void acaoJButton07() {
        jButton08.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exemplo08JButton();
            }
        });
    }

    public void acaoJButton08() {
        jButton09.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exemplo09ImageIcon();
            }
        });
    }

    public void acaoJButton09() {
        jButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exemplo10JTable();
            }
        });
    }

    public void acaoJButton10() {
        jButton11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Exemplo11KeyListener();
            }
        });
    }

}
