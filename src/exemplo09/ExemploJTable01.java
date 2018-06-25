package exemplo09;

import exemplo08.JFrameBaseInterface;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Francisco Lucas Sens
 */
public class ExemploJTable01 implements JFrameBaseInterface {

    private JFrame jFrame;
    private JTable jTable;
    private DefaultTableModel defaultTableModel;
    private JScrollPane jScrollPane;

    public ExemploJTable01() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        jFrame.setVisible(true);
    }

    @Override
    public void instanciarComponentes() {
        jTable = new JTable();
        Object[] colunas = new Object[]{"Nome", "Idade", "Altura"};
        defaultTableModel = new DefaultTableModel(colunas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jScrollPane = new JScrollPane(jTable);
        configurarTableModel();
    }

    private void configurarTableModel() {
        defaultTableModel.addRow(new Object[]{
            "Gustavo ", 22, 1.68
        });
        defaultTableModel.addRow(new Object[]{
            "Leonardo", 21, 1.76
        });
        defaultTableModel.addRow(new Object[]{
            "Crispim", 20, 1.75
        });
        jTable.setModel(defaultTableModel);
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
        jFrame.add(jScrollPane);
    }

    @Override
    public void gerarLocalizacoes() {
        jScrollPane.setLocation(10, 10);
    }

    @Override
    public void gerarDimensoes() {
        jScrollPane.setSize(400, 400);
    }

}
