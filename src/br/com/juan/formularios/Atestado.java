/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.juan.formularios;

/**
 *
 * @author SATC
 */
public class Atestado extends javax.swing.JFrame {

    /**
     * Creates new form Atestado
     */
    public Atestado() {
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

        jLTituloAtestado = new javax.swing.JLabel();
        jPCadastroAtestado = new javax.swing.JPanel();
        jLdataInicioAtestado = new javax.swing.JLabel();
        jLDataFimAtestado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFDataFimAtestado = new javax.swing.JTextField();
        jTFQuantidadeDias = new javax.swing.JTextField();
        jTFDataInicioAtestado = new javax.swing.JTextField();
        jBCadastroAtestado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLTituloAtestado.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLTituloAtestado.setText("Cadastro de Atestado");

        jPCadastroAtestado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLdataInicioAtestado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLdataInicioAtestado.setText("Data inicio do Atestado:");

        jLDataFimAtestado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLDataFimAtestado.setText("Data fim do Atestado:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Quantidade de dias:");

        jTFDataFimAtestado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTFDataFimAtestado.setText(" ");
        jTFDataFimAtestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDataFimAtestadoActionPerformed(evt);
            }
        });

        jTFQuantidadeDias.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTFQuantidadeDias.setText("       ");
        jTFQuantidadeDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFQuantidadeDiasActionPerformed(evt);
            }
        });

        jTFDataInicioAtestado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTFDataInicioAtestado.setText("   ");

        jBCadastroAtestado.setText("Cadastrar");

        javax.swing.GroupLayout jPCadastroAtestadoLayout = new javax.swing.GroupLayout(jPCadastroAtestado);
        jPCadastroAtestado.setLayout(jPCadastroAtestadoLayout);
        jPCadastroAtestadoLayout.setHorizontalGroup(
            jPCadastroAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroAtestadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPCadastroAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCadastroAtestadoLayout.createSequentialGroup()
                        .addComponent(jLDataFimAtestado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPCadastroAtestadoLayout.createSequentialGroup()
                        .addGroup(jPCadastroAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLdataInicioAtestado)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPCadastroAtestadoLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPCadastroAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTFDataInicioAtestado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFDataFimAtestado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPCadastroAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPCadastroAtestadoLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel4)
                                .addContainerGap(20, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadastroAtestadoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPCadastroAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBCadastroAtestado)
                                    .addComponent(jTFQuantidadeDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))))))
        );
        jPCadastroAtestadoLayout.setVerticalGroup(
            jPCadastroAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroAtestadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPCadastroAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLdataInicioAtestado)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addGroup(jPCadastroAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFDataInicioAtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFQuantidadeDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLDataFimAtestado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCadastroAtestadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastroAtestado)
                    .addComponent(jTFDataFimAtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPCadastroAtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLTituloAtestado, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTituloAtestado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPCadastroAtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFQuantidadeDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFQuantidadeDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFQuantidadeDiasActionPerformed

    private void jTFDataFimAtestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDataFimAtestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDataFimAtestadoActionPerformed

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
            java.util.logging.Logger.getLogger(Atestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Atestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Atestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Atestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Atestado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastroAtestado;
    private javax.swing.JLabel jLDataFimAtestado;
    private javax.swing.JLabel jLTituloAtestado;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLdataInicioAtestado;
    private javax.swing.JPanel jPCadastroAtestado;
    private javax.swing.JTextField jTFDataFimAtestado;
    private javax.swing.JTextField jTFDataInicioAtestado;
    private javax.swing.JTextField jTFQuantidadeDias;
    // End of variables declaration//GEN-END:variables
}
