/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.swinglocadora.view;

/**
 *
 * @author Raquel
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jPanelTelaPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBarTelaPrincipal = new javax.swing.JMenuBar();
        jMenuLocacao = new javax.swing.JMenu();
        jMenuItemAlugar = new javax.swing.JMenuItem();
        jMenuItemConsultar = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemFilme = new javax.swing.JMenuItem();
        jMenuItemAtor = new javax.swing.JMenuItem();
        jMenuItemItem = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Video Locadora Hora da Pipoca");
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        javax.swing.GroupLayout jPanelTelaPrincipalLayout = new javax.swing.GroupLayout(jPanelTelaPrincipal);
        jPanelTelaPrincipal.setLayout(jPanelTelaPrincipalLayout);
        jPanelTelaPrincipalLayout.setHorizontalGroup(
            jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
        );
        jPanelTelaPrincipalLayout.setVerticalGroup(
            jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N

        jMenuLocacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon.png"))); // NOI18N
        jMenuLocacao.setText("Locação");
        jMenuLocacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItemAlugar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemAlugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/seta.png"))); // NOI18N
        jMenuItemAlugar.setText("Alugar");
        jMenuLocacao.add(jMenuItemAlugar);

        jMenuItemConsultar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/seta.png"))); // NOI18N
        jMenuItemConsultar.setText("Consultar");
        jMenuItemConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarActionPerformed(evt);
            }
        });
        jMenuLocacao.add(jMenuItemConsultar);

        jMenuBarTelaPrincipal.add(jMenuLocacao);

        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jMenuItemCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/seta.png"))); // NOI18N
        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCliente);

        jMenuItemFilme.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/seta.png"))); // NOI18N
        jMenuItemFilme.setText("Filme");
        jMenuItemFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFilmeActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemFilme);

        jMenuItemAtor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemAtor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/seta.png"))); // NOI18N
        jMenuItemAtor.setText("Ator");
        jMenuItemAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAtorActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemAtor);

        jMenuItemItem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuItemItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/seta.png"))); // NOI18N
        jMenuItemItem.setText("Item");
        jMenuItemItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemItemActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemItem);

        jMenuBarTelaPrincipal.add(jMenuCadastro);

        jMenuSair.setText("Sair");
        jMenuSair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMenuBarTelaPrincipal.add(jMenuSair);

        setJMenuBar(jMenuBarTelaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1)
                .addGap(123, 123, 123)
                .addComponent(jPanelTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jPanelTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1)))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemConsultarActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        this.dispose();
        new TelaCadastroCliente(this).setVisible(true);
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFilmeActionPerformed
        this.dispose();
        new TelaCadastroFilme(this).setVisible(true);
    }//GEN-LAST:event_jMenuItemFilmeActionPerformed

    private void jMenuItemAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAtorActionPerformed
        this.dispose();
        new TelaCadastroAtor(this).setVisible(true);
    }//GEN-LAST:event_jMenuItemAtorActionPerformed

    private void jMenuItemItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemItemActionPerformed
        this.dispose();
        new TelaCadastroItem(this).setVisible(true);
    }//GEN-LAST:event_jMenuItemItemActionPerformed
                                                        
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBarTelaPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemAlugar;
    private javax.swing.JMenuItem jMenuItemAtor;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemConsultar;
    private javax.swing.JMenuItem jMenuItemFilme;
    private javax.swing.JMenuItem jMenuItemItem;
    private javax.swing.JMenu jMenuLocacao;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelTelaPrincipal;
    // End of variables declaration//GEN-END:variables
}