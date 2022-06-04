/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.table.DefaultTableModel;

/**
 * Teoria de la Computacion 
 * 2022 - I
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    
    DefaultTableModel modelo;
    
    public VistaPrincipal() {
        initComponents();
        modelo = new DefaultTableModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtEstados = new java.awt.Label();
        btnEstados = new javax.swing.JButton();
        btnSimbolos = new javax.swing.JButton();
        txtSimbolos = new java.awt.Label();
        btnTerminal = new javax.swing.JButton();
        txtInicial = new java.awt.Label();
        btnInicial = new javax.swing.JButton();
        txtTerminal = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btnCrear = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEstados.setAlignment(java.awt.Label.CENTER);
        txtEstados.setBackground(new java.awt.Color(255, 255, 255));
        txtEstados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtEstados.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel2.add(txtEstados, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 148, 20));

        btnEstados.setBackground(new java.awt.Color(61, 61, 255));
        btnEstados.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEstados.setForeground(new java.awt.Color(255, 255, 255));
        btnEstados.setText("Ingresar Estados");
        btnEstados.setBorderPainted(false);
        btnEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadosActionPerformed(evt);
            }
        });
        jPanel2.add(btnEstados, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 140, 30));

        btnSimbolos.setBackground(new java.awt.Color(61, 61, 255));
        btnSimbolos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSimbolos.setForeground(new java.awt.Color(255, 255, 255));
        btnSimbolos.setText("Ingresar Simbolos");
        btnSimbolos.setBorderPainted(false);
        btnSimbolos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimbolosActionPerformed(evt);
            }
        });
        jPanel2.add(btnSimbolos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 140, 30));

        txtSimbolos.setAlignment(java.awt.Label.CENTER);
        txtSimbolos.setBackground(new java.awt.Color(255, 255, 255));
        txtSimbolos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtSimbolos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel2.add(txtSimbolos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 150, 20));

        btnTerminal.setBackground(new java.awt.Color(61, 61, 255));
        btnTerminal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTerminal.setForeground(new java.awt.Color(255, 255, 255));
        btnTerminal.setText("Estado Terminal");
        btnTerminal.setBorderPainted(false);
        btnTerminal.setEnabled(false);
        btnTerminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminalActionPerformed(evt);
            }
        });
        jPanel2.add(btnTerminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, 30));

        txtInicial.setAlignment(java.awt.Label.CENTER);
        txtInicial.setBackground(new java.awt.Color(255, 255, 255));
        txtInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtInicial.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel2.add(txtInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 64, 29));

        btnInicial.setBackground(new java.awt.Color(61, 61, 255));
        btnInicial.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInicial.setForeground(new java.awt.Color(255, 255, 255));
        btnInicial.setText("Estado Inicial");
        btnInicial.setBorderPainted(false);
        btnInicial.setEnabled(false);
        btnInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicialActionPerformed(evt);
            }
        });
        jPanel2.add(btnInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 120, 30));

        txtTerminal.setAlignment(java.awt.Label.CENTER);
        txtTerminal.setBackground(new java.awt.Color(255, 255, 255));
        txtTerminal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtTerminal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel2.add(txtTerminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 64, 20));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 62, 60, 0));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 70, 10));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 150, 10));

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 150, 10));

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 70, 10));

        btnCrear.setBackground(new java.awt.Color(61, 61, 255));
        btnCrear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("Crear Automata");
        btnCrear.setBorderPainted(false);
        btnCrear.setEnabled(false);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(61, 61, 255));
        jPanel4.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Conversión de Autómatas no Determinísticos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrear)
                .addGap(309, 309, 309))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstadosActionPerformed

    private void btnSimbolosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimbolosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimbolosActionPerformed

    private void btnTerminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTerminalActionPerformed

    private void btnInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInicialActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCrear;
    public javax.swing.JButton btnEstados;
    public javax.swing.JButton btnInicial;
    public javax.swing.JButton btnSimbolos;
    public javax.swing.JButton btnTerminal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public java.awt.Label txtEstados;
    public java.awt.Label txtInicial;
    public java.awt.Label txtSimbolos;
    public java.awt.Label txtTerminal;
    // End of variables declaration//GEN-END:variables
}
