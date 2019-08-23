package view;
import view.viewModel;
import java.awt.Dimension;
import javax.swing.JInternalFrame;




/**
 *
 * Tela Principal
 */
public class Menu extends javax.swing.JFrame {

    private viewModel editarProduto = null;
  
    /**
     * Construtor
     */
    public Menu() {

        initComponents();
// abre janela no meio da tela
        this.setLocationRelativeTo(null);
    }

    /**
     * Metodos de abertura das telas
     */
 

    public viewModel getEditarProduto() {
        return editarProduto;
    }

    public void setEditarProduto(viewModel editarproduto) {
        this.editarProduto = editarproduto;
    }


    /*
    * Código de contruçãos dos componentes do GUI Builder
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jSplitPane1 = new javax.swing.JSplitPane();
        jDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenu();
        menuClienteAcao = new javax.swing.JMenuItem();
        menuProdutos = new javax.swing.JMenu();
        menuManipularProdutosAcao = new javax.swing.JMenuItem();
        MenuVendas = new javax.swing.JMenu();
        menuAcaoVenda = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setBackground(new java.awt.Color(130, 189, 87));

        jDesktopPane.setAutoscrolls(true);
        jDesktopPane.setEnabled(false);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1169, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );

        jMenu1.setText("Arquivo");
        jMenu1.add(jSeparator1);

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator2);

        jMenu3.setText("jMenu3");
        jMenu1.add(jMenu3);

        jMenuItem3.setText("jMenuItem3");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        menuClientes.setText("Clientes");

       
        menuClientes.add(menuClienteAcao);

        jMenuBar1.add(menuClientes);

        menuProdutos.setText("Produtos");

        menuManipularProdutosAcao.setText("Manipular Produtos");
      
    }
   
    //Abre um internal frame centralizado na tela
    /**
     * Método de inicialização da classe e do sistema
     *
     * @param args
     */
    public static void main(String args[]) {
              java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Menu().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuVendas;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JMenuItem menuAcaoVenda;
    private javax.swing.JMenuItem menuClienteAcao;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenuItem menuManipularProdutosAcao;
    private javax.swing.JMenu menuProdutos;
    // End of variables declaration//GEN-END:variables

    private void openFrameInCenter(viewModel editarProduto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
