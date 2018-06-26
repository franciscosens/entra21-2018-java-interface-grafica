package outros;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Exemplo07JComboBox {

    public Exemplo07JComboBox() {
        String frutas[] = {"", "Pepino", "Tumate", "Chuchu", "Banana", "Vagem", "Kiwi", "Moranguinho", "Berinjela",
            "lolzinho"};
        JFrame tela = new JFrame();
        tela.setSize(300, 300);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JComboBox frutinhas = new JComboBox(frutas);
        frutinhas.setBounds(10, 10, 100, 20);

        frutinhas.setSelectedIndex(4);

        frutinhas.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    int indice = frutinhas.getSelectedIndex();
                    System.out.println(indice);
                    String texto = (String) frutinhas.getSelectedItem();
                    System.out.println(texto);
                }
            }
        });

        tela.add(frutinhas);
        tela.setVisible(true);

    }

}
