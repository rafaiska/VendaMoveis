package ControleProduto;

import javax.swing.JOptionPane;

/**
 *
 * @author Anderson Sergio Oyama
 */
public class JFrameEditarProduto extends javax.swing.JFrame {

    Produto produto;
    public JFrameEditarProduto(Produto det) {
        initComponents();
        produto = det;
        detalhes();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Produto: " + produto.getNomeProd() + " || ID: " + produto.getProdId());
        
    }

    private JFrameEditarProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescriçãoProduto = new javax.swing.JTextArea();
        JLabelDescrição = new javax.swing.JLabel();
        JTextPreçoCompra = new javax.swing.JTextField();
        JLabelPreçoCompra = new javax.swing.JLabel();
        JTextIDProduto = new javax.swing.JTextField();
        JPanelDimensao = new javax.swing.JPanel();
        JLabeLargura = new javax.swing.JLabel();
        JTextLargura = new javax.swing.JTextField();
        JLabeAltura = new javax.swing.JLabel();
        JTextAltura = new javax.swing.JTextField();
        JTextProfundidade = new javax.swing.JTextField();
        JLabeProfundidade = new javax.swing.JLabel();
        JLabelIDProduto = new javax.swing.JLabel();
        JTextMarca = new javax.swing.JTextField();
        JLabelQuantidade = new javax.swing.JLabel();
        JTextQuantidade = new javax.swing.JTextField();
        JLabelMarca = new javax.swing.JLabel();
        JLabelFotoProduto = new javax.swing.JLabel();
        JLabelNomeProduto = new javax.swing.JLabel();
        JTextNomeProduto = new javax.swing.JTextField();
        jButtonFechar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        JLabelPreçoVenda = new javax.swing.JLabel();
        JTextPreçoVenda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextAreaDescriçãoProduto.setColumns(20);
        jTextAreaDescriçãoProduto.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescriçãoProduto);

        JLabelDescrição.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JLabelDescrição.setText("Descrição do Produto:");

        JLabelPreçoCompra.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JLabelPreçoCompra.setText("Preço de Compra:");

        JTextIDProduto.setEditable(false);

        JPanelDimensao.setBorder(javax.swing.BorderFactory.createTitledBorder("Dimensão do Produto:"));

        JLabeLargura.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JLabeLargura.setText("Largura:");

        JTextLargura.setEditable(false);

        JLabeAltura.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JLabeAltura.setText("Altura:");

        JTextAltura.setEditable(false);

        JTextProfundidade.setEditable(false);

        JLabeProfundidade.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JLabeProfundidade.setText("Profundidade:");

        javax.swing.GroupLayout JPanelDimensaoLayout = new javax.swing.GroupLayout(JPanelDimensao);
        JPanelDimensao.setLayout(JPanelDimensaoLayout);
        JPanelDimensaoLayout.setHorizontalGroup(
            JPanelDimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDimensaoLayout.createSequentialGroup()
                .addComponent(JLabeLargura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabeAltura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabeProfundidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextProfundidade, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JPanelDimensaoLayout.setVerticalGroup(
            JPanelDimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDimensaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(JLabeLargura)
                .addComponent(JTextLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(JLabeAltura)
                .addComponent(JTextAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(JTextProfundidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(JLabeProfundidade))
        );

        JLabelIDProduto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JLabelIDProduto.setText("ID do Produto:");

        JTextMarca.setEditable(false);
        JTextMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextMarcaActionPerformed(evt);
            }
        });

        JLabelQuantidade.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JLabelQuantidade.setText("Quantidade:");

        JLabelMarca.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JLabelMarca.setText("Marca:");

        JLabelFotoProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabelFotoProduto.setText("Inserir Foto");
        JLabelFotoProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagem X-1/X"));
        JLabelFotoProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabelFotoProdutoMouseClicked(evt);
            }
        });

        JLabelNomeProduto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JLabelNomeProduto.setText("Nome do Produto:");

        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar Alterações");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        JLabelPreçoVenda.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JLabelPreçoVenda.setText("Preço de Venda:");

        JTextPreçoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextPreçoVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(JLabelFotoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanelDimensao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLabelNomeProduto)
                                .addGap(18, 18, 18)
                                .addComponent(JTextNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLabelMarca)
                                .addGap(85, 85, 85)
                                .addComponent(JTextMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabelQuantidade)
                                .addGap(18, 18, 18)
                                .addComponent(JTextQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLabelIDProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTextIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(JLabelPreçoCompra)
                                .addGap(10, 10, 10)
                                .addComponent(JTextPreçoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(JLabelPreçoVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTextPreçoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 22, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(JLabelDescrição))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(790, 790, 790)
                .addComponent(jButtonSalvar)
                .addGap(10, 10, 10)
                .addComponent(jButtonFechar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelFotoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(JLabelNomeProduto))
                            .addComponent(JTextNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLabelMarca)
                                    .addComponent(JLabelQuantidade))))
                        .addGap(6, 6, 6)
                        .addComponent(JPanelDimensao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextPreçoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(JLabelIDProduto)
                                        .addComponent(JTextIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JLabelPreçoCompra)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(JLabelPreçoVenda)
                                        .addComponent(JTextPreçoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(89, 89, 89)
                .addComponent(JLabelDescrição)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonFechar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTextMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextMarcaActionPerformed

    private void JLabelFotoProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelFotoProdutoMouseClicked

        //IMPLEMENTAR A SELEÇÃO DE ARQUIVO NO FORMATO DE IMAGEM!!!!!!!!
        // TODO add your handling code here:
    }//GEN-LAST:event_JLabelFotoProdutoMouseClicked

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        boolean persistiu = new ControlaProduto().persisteProduto(produto, JTextNomeProduto.getText(), Integer.parseInt(JTextQuantidade.getText()), jTextAreaDescriçãoProduto.getText(), Float.parseFloat(JTextPreçoVenda.getText()), Float.parseFloat(JTextPreçoCompra.getText()));
        if(persistiu){
            JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao salvar alterações!");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void JTextPreçoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextPreçoVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextPreçoVendaActionPerformed

    public void detalhes(){
        JTextIDProduto.setText(produto.getProdId());
        JTextNomeProduto.setText(produto.getNomeProd());
        JTextMarca.setText(produto.getMarca());
        JTextAltura.setText(Float.toString(produto.getAltura()));
        JTextLargura.setText(Float.toString(produto.getLargura()));
        JTextProfundidade.setText(Float.toString(produto.getProfundidade()));
        JTextQuantidade.setText(Integer.toString(produto.getQuantidadeEstoque()));
        JTextPreçoCompra.setText(Float.toString(produto.getPrecoCusto()));
        jTextAreaDescriçãoProduto.setText(produto.getDescricao());
        JTextPreçoVenda.setText(Float.toString(produto.getPrecoVenda()));
    }
    
    
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
            java.util.logging.Logger.getLogger(JFrameEditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameEditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameEditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameEditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameEditarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabeAltura;
    private javax.swing.JLabel JLabeLargura;
    private javax.swing.JLabel JLabeProfundidade;
    private javax.swing.JLabel JLabelDescrição;
    private javax.swing.JLabel JLabelFotoProduto;
    private javax.swing.JLabel JLabelIDProduto;
    private javax.swing.JLabel JLabelMarca;
    private javax.swing.JLabel JLabelNomeProduto;
    private javax.swing.JLabel JLabelPreçoCompra;
    private javax.swing.JLabel JLabelPreçoVenda;
    private javax.swing.JLabel JLabelQuantidade;
    private javax.swing.JPanel JPanelDimensao;
    private javax.swing.JTextField JTextAltura;
    private javax.swing.JTextField JTextIDProduto;
    private javax.swing.JTextField JTextLargura;
    private javax.swing.JTextField JTextMarca;
    private javax.swing.JTextField JTextNomeProduto;
    private javax.swing.JTextField JTextPreçoCompra;
    private javax.swing.JTextField JTextPreçoVenda;
    private javax.swing.JTextField JTextProfundidade;
    private javax.swing.JTextField JTextQuantidade;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescriçãoProduto;
    // End of variables declaration//GEN-END:variables
}