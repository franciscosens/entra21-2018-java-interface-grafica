package exemplo09;

import java.awt.EventQueue;

/**
 * @author Alunos
 */
public class ExemploJTable01Prinicipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new ExemploJTable01();
            }
        });
    }

}
