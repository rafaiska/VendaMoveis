/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelaAdministrador;

/**
 *
 * @author ander
 */
public class JFrameTelaGerente extends javax.swing.JFrame {

    /**
     * Creates new form JFrameTelaGerente
     */
    public JFrameTelaGerente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelImagemLogo = new javax.swing.JLabel();
        jPanelImagemFundo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuPrincipal = new javax.swing.JMenuBar();
        jMenuFuncionario = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuProduto = new javax.swing.JMenu();
        jMenuCadastrar = new javax.swing.JMenuItem();
        jMenuConsultar = new javax.swing.JMenuItem();
        jMenuCliente = new javax.swing.JMenu();
        jMenuVenda = new javax.swing.JMenu();
        jMenuCaixa = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerente - ");

        jLabelImagemLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/redebras-topo-menor.jpg"))); // NOI18N

        jPanelImagemFundo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelImagemFundo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelImagemFundo.setName(""); // NOI18N
        jPanelImagemFundo.setPreferredSize(new java.awt.Dimension(1000, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo_gerente.png"))); // NOI18N

        javax.swing.GroupLayout jPanelImagemFundoLayout = new javax.swing.GroupLayout(jPanelImagemFundo);
        jPanelImagemFundo.setLayout(jPanelImagemFundoLayout);
        jPanelImagemFundoLayout.setHorizontalGroup(
            jPanelImagemFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagemFundoLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelImagemFundoLayout.setVerticalGroup(
            jPanelImagemFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagemFundoLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenuFuncionario.setText("Funcionário");

        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuFuncionario.add(jMenuItem1);

        jMenuItem2.setText("Consultar");
        jMenuFuncionario.add(jMenuItem2);

        jMenuPrincipal.add(jMenuFuncionario);

        jMenuProduto.setText("Produto");

        jMenuCadastrar.setText("Cadastrar");
        jMenuProduto.add(jMenuCadastrar);

        jMenuConsultar.setText("Consultar");
        jMenuConsultar.setToolTipText("");
        jMenuProduto.add(jMenuConsultar);

        jMenuPrincipal.add(jMenuProduto);

        jMenuCliente.setText("Cliente");
        jMenuPrincipal.add(jMenuCliente);

        jMenuVenda.setText("Venda");
        jMenuPrincipal.add(jMenuVenda);

        jMenuCaixa.setText("Caixa");
        jMenuPrincipal.add(jMenuCaixa);

        setJMenuBar(jMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImagemLogo)
                    .addComponent(jPanelImagemFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImagemLogo)
                .addGap(18, 18, 18)
                .addComponent(jPanelImagemFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTelaGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelImagemLogo;
    private javax.swing.JMenuItem jMenuCadastrar;
    private javax.swing.JMenu jMenuCaixa;
    private javax.swing.JMenu jMenuCliente;
    private javax.swing.JMenuItem jMenuConsultar;
    private javax.swing.JMenu jMenuFuncionario;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar jMenuPrincipal;
    private javax.swing.JMenu jMenuProduto;
    private javax.swing.JMenu jMenuVenda;
    private javax.swing.JPanel jPanelImagemFundo;
    // End of variables declaration//GEN-END:variables
}
