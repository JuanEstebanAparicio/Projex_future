/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.restaurant;

import config.conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;

/**
 *
 * @author SuperAdmin
 */
public class Platos extends javax.swing.JFrame {

    /**
     * Creates new form Platos
     */
    conexion con1 = new conexion();
    Connection conet;
    DefaultTableModel modelo; 
    Statement st;
    ResultSet rs;
    int idc;
    
    public Platos() {
        initComponents();
        setLocationRelativeTo(null);
        consultar();
        
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nPlato = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventario = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ingrediente = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        receta = new javax.swing.JTable();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        send = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre de Plato");

        nPlato.setBackground(new java.awt.Color(204, 204, 255));
        nPlato.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        nPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nPlatoActionPerformed(evt);
            }
        });

        inventario.setBackground(new java.awt.Color(0, 0, 51));
        inventario.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        inventario.setForeground(new java.awt.Color(255, 255, 255));
        inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ingrediente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(inventario);

        jLabel2.setText("Ingrediente:");

        jLabel3.setText("Cantidad:");

        ingrediente.setBackground(new java.awt.Color(204, 204, 255));
        ingrediente.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N

        cantidad.setBackground(new java.awt.Color(204, 204, 255));
        cantidad.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N

        receta.setBackground(new java.awt.Color(0, 0, 51));
        receta.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        receta.setForeground(new java.awt.Color(255, 255, 255));
        receta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "ingrediente", "cantidad"
            }
        ));
        receta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recetaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(receta);

        add.setBackground(new java.awt.Color(0, 0, 51));
        add.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Agregar");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(204, 204, 255));
        edit.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        edit.setText("Modificar");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(0, 0, 51));
        delete.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Eliminar");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        send.setBackground(new java.awt.Color(0, 0, 51));
        send.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        send.setForeground(new java.awt.Color(255, 255, 255));
        send.setText("Crear Receta");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Recetas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 51));
        jButton2.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Bodega");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(nPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ingrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delete)))))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(29, 29, 29)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(send))
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nPlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(ingrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(edit)
                    .addComponent(delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(send)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nPlatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nPlatoActionPerformed

    private void inventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioMouseClicked
        int fila = inventario.getSelectedRow();
        if (fila == -1){
            
        }else{
            idc = Integer.parseInt((String)inventario.getValueAt(fila, 0).toString());
            String nom=(String) inventario.getValueAt(fila,1);
            
            ingrediente.setText(nom);
        }
    }//GEN-LAST:event_inventarioMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        try{
            if(ingrediente.getText().equals("")||cantidad.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Seleccione el ingrediente y digite la cantidad");
            }else{
                modelo = (DefaultTableModel)receta.getModel();
                String []info = new String[3];
                info[0]=String.valueOf(idc);
                info[1]=ingrediente.getText();
                info[2]=cantidad.getText();
                modelo.addRow(info);
                receta.setModel(modelo);
                
                ingrediente.setText("");
                cantidad.setText("");
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_addActionPerformed

    private void recetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recetaMouseClicked
        int fila = receta.getSelectedRow();
        if (fila == -1){
            
        }else{
            idc = Integer.parseInt((String)receta.getValueAt(fila, 0).toString());
            ingrediente.setText((String) receta.getValueAt(fila,1));
            cantidad.setText((String)receta.getValueAt(fila, 2).toString()); 
        }
          
    }//GEN-LAST:event_recetaMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int fila=receta.getSelectedRow();
        if (fila>=0){
            modelo.removeRow(fila);
            ingrediente.setText("");
            cantidad.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione la fila a eliminar");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        int fila = receta.getSelectedRow();
        int columna = receta.getSelectedColumn();
        modelo.removeRow(fila);
        try{
            if(ingrediente.getText().equals("")||cantidad.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Seleccione la fila a modificar");
            }else{
                modelo = (DefaultTableModel)receta.getModel();
                String []info = new String[3];
                info[0]=String.valueOf(idc);
                info[1]=ingrediente.getText();
                info[2]=cantidad.getText();
                modelo.addRow(info);
                receta.setModel(modelo);
                
                ingrediente.setText("");
                cantidad.setText("");
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_editActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        String sql2 = "select id from platos where nombre='"+nPlato.getText()+"'";
        int idTemp=1;
        int fila=receta.getRowCount();
        try{
            if(fila<1||nPlato.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Agregue ingredientes y/o Nombre del plato.");
            }else{
                String sql="insert into platos(nombre)VALUES ('"+nPlato.getText()+"')";
                conet = con1.getConnection();
                st = conet.createStatement();
                st.executeUpdate(sql);
                conet = con1.getConnection();
                st = conet.createStatement();
                rs=st.executeQuery(sql2);
                while (rs.next()){
                    idTemp = rs.getInt("id");
                }
                for(int j=0; j<fila; j++){
                    String sql3="insert into receta (idPlato, idIngrediente, nIngrediente, cIngrediente) VALUES ("+idTemp+", "+modelo.getValueAt(j, 0)+", '"+modelo.getValueAt(j, 1)+"', "+modelo.getValueAt(j, 2)+")";
                    //System.out.println(""+modelo.getValueAt(j, 0)+" "+modelo.getValueAt(j, 1)+" "+modelo.getValueAt(j, 2));
                    conet = con1.getConnection();
                    st = conet.createStatement();
                    st.executeUpdate(sql3);
                }
                nPlato.setText("");
                JOptionPane.showMessageDialog(null, "Nueva Receta Agregada.");
                for (int i = 0; i < fila; i++) {
                    modelo.removeRow(i);
                    i-=1;
                }
                
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_sendActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Food_interfaz food = new Food_interfaz();
   food.setVisible(true);
   this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       ingredientes Ingredientes = new ingredientes();
  Ingredientes.setVisible(true);
  this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      recetas Resetas = new recetas();
      Resetas.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Platos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Platos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Platos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Platos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Platos().setVisible(true);
            }
        });
    }
    
    void consultar(){
        String sql = "select * from ingredientes";
        try{
            conet = con1.getConnection();
            st = conet.createStatement();
            rs=st.executeQuery(sql);
            Object[] ingrediente = new Object[3];
            modelo = (DefaultTableModel)inventario.getModel();
            while (rs.next()){
                ingrediente[0] = rs.getInt("id");
                ingrediente[1] = rs.getString("nombre");
                modelo.addRow(ingrediente);
                inventario.setModel(modelo);
            }
        }catch(Exception e){
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JTextField ingrediente;
    private javax.swing.JTable inventario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nPlato;
    private javax.swing.JTable receta;
    private javax.swing.JButton send;
    // End of variables declaration//GEN-END:variables
}
