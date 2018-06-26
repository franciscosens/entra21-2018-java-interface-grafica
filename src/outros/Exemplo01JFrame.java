package outros;

import javax.swing.JFrame;

public class Exemplo01JFrame {

    public Exemplo01JFrame() {

        JFrame meuFrame = new JFrame();
        meuFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        meuFrame.setSize(400, 400);
        // meuFrame.setLocation(100, 250);
        meuFrame.setLocationRelativeTo(null);
        meuFrame.setVisible(true);

    }

}
