/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleCliente;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juliano
 */
public class JPanelConsultaCliente extends javax.swing.JPanel {

    /**
     * Creates new form JPanelConsultaCliente
     */
    ArrayList<Cliente> listaClientes;

    public JPanelConsultaCliente() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jButtonListar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Sobrenome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableClientes);

        jButtonListar.setText("Listar");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jButtonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(13, 13, 13)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(66, 66, 66)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonListar)
                        .addComponent(jButtonConsultar))
                    .addContainerGap(66, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) jTableClientes.getModel();
        tableModel.setNumRows(0);
        listaClientes = new ControlaCliente().getListaClientes();
        for (Cliente c : listaClientes) {
            tableModel.addRow(new Object[]{c.getCliId(), c.getNome(), c.getSobrenome()});
        }
        jButtonConsultar.setVisible(true);
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        int i = jTableClientes.getSelectedRow();
        if (i == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para consultar.");
        } else {
            Cliente c = listaClientes.get(i);
            //new JFrameExibeCliente(c);
        }
    }//GEN-LAST:event_jButtonConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    // End of variables declaration//GEN-END:variables
}
