package outros;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Exemplo10JTable {

    public Exemplo10JTable() {
        String[][] lol = new String[3][3];
        lol[0][0] = "Ashe";
        lol[0][1] = "Slow";
        lol[0][2] = "ADC";

        lol[1][0] = "Annie";
        lol[1][1] = "Burst";
        lol[1][2] = "Mid";

        lol[2][0] = "Jax";
        lol[2][1] = "Poste";
        lol[2][2] = "Top";

        JFrame jFrame = new JFrame("Meu Jtablezinho");
        jFrame.setSize(400, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Champion");
        modelo.addColumn("Characteristic");
        modelo.addColumn("Positon");
        //int j = 0 ;
        //while(j < 10){
        for (int i = 0; i < lol.length; i++) {
            modelo.addRow(new Object[]{
                lol[i][0],
                lol[i][1],
                lol[i][2]
            });
        }
        //j++;
        //}

        JTable tabela = new JTable(modelo);

        JScrollPane barraRolagem = new JScrollPane(tabela);
        barraRolagem.setBounds(10, 10, 370, 370);

        jFrame.add(barraRolagem);
        jFrame.setVisible(true);

    }

}
