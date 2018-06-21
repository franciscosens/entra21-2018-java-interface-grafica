
import exemplo00.ExemploJFrame01;
import exemplo07.ExemploJRadioButton01;
import exemplo07.ExemploJRadioButton01Principal;
import exemplo08.JFrameBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * @author Francisco Lucas Sens
 */
public class ExemploTudo implements JFrameBaseInterface {

  private JFrame jFrame;
  private JButton jButton00;
  private JButton jButton01;
  private JButton jButton02;
  private JButton jButton03;
  private JButton jButton04;
  private JButton jButton05;
  private JButton jButton06;
  private JButton jButton07;
  private JButton jButton08;
  private JButton jButton09;

  public ExemploTudo() {
    gerarTela();
    instanciarComponentes();
    gerarDimensoes();
    gerarLocalizacoes();
    adicionarComponentes();
    acaoJButton00();
    jFrame.setVisible(true);
  }

  @Override
  public void gerarTela() {
    jFrame = new JFrame();
    jFrame.setSize(500, 500);
    jFrame.setLayout(null);
    jFrame.setLocationRelativeTo(null);
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  @Override
  public void adicionarComponentes() {
    jFrame.add(jButton00);
    jFrame.add(jButton01);
    jFrame.add(jButton02);
    jFrame.add(jButton03);
    jFrame.add(jButton04);
    jFrame.add(jButton05);
    jFrame.add(jButton06);
    jFrame.add(jButton07);
    jFrame.add(jButton08);
    jFrame.add(jButton09);
  }

  @Override
  public void instanciarComponentes() {
    jButton00 = new JButton("Exemplo 00");
    jButton01 = new JButton("Exemplo 01");
    jButton02 = new JButton("Exemplo 02");
    jButton03 = new JButton("Exemplo 03");
    jButton04 = new JButton("Exemplo 04");
    jButton05 = new JButton("Exemplo 05");
    jButton06 = new JButton("Exemplo 06");
    jButton07 = new JButton("Exemplo 07");
    jButton08 = new JButton("Exemplo 08");
    jButton09 = new JButton("Exemplo 09");
  }

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(
              "public void acaoJButton0" + i + "(){");
      System.out.println(
              "jButton0" + i
              + ".addActionListener(new ActionListener() {");
      System.out.println("@Override");
      System.out.println(
              "public void actionPerformed(ActionEvent e) {");
      System.out.println("}");
      System.out.println("});");
      System.out.println("}");
      System.out.println("");
    }
  }

  @Override
  public void gerarLocalizacoes() {
    jButton00.setLocation(10, 10);
  }

  @Override
  public void gerarDimensoes() {
    jButton00.setSize(100, 100);
  }

  public void acaoJButton00() {
    jButton00.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        new ExemploJRadioButton01();
      }
    });
  }

  public void acaoJButton01() {
    jButton01.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
      }
    });
  }

  public void acaoJButton02() {
    jButton02.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
      }
    });
  }

  public void acaoJButton03() {
    jButton03.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
      }
    });
  }

  public void acaoJButton04() {
    jButton04.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
      }
    });
  }

  public void acaoJButton05() {
    jButton05.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
      }
    });
  }

  public void acaoJButton06() {
    jButton06.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
      }
    });
  }

  public void acaoJButton07() {
    jButton07.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
      }
    });
  }

  public void acaoJButton08() {
    jButton08.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
      }
    });
  }

  public void acaoJButton09() {
    jButton09.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
      }
    });
  }

}
