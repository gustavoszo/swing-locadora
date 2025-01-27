package com.mycompany.swinglocadora.view;

import com.mycompany.swinglocadora.controller.AtorController;
import com.mycompany.swinglocadora.db.DbException;
import com.mycompany.swinglocadora.model.entities.Ator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaListaAtor extends javax.swing.JFrame {
    
    private TelaCadastroAtor telaCadastroAtor;
    
    public TelaListaAtor() {
        initComponents();
        this.atorController = new AtorController();
    }
    
    public TelaListaAtor(TelaCadastroAtor tela) {
        this.telaCadastroAtor = tela;
        this.atorController = new AtorController();
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
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelListaFilmes = new javax.swing.JPanel();
        jLabelNomeAtor = new javax.swing.JLabel();
        jTextFieldNomeAtor = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListaAtores = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Video Locadora Hora da Pipoca");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                fecharJanela(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon.png"))); // NOI18N
        jLabelTitulo.setText("Consulta de Ator");

        jPanelListaFilmes.setBackground(new java.awt.Color(102, 102, 102));

        jLabelNomeAtor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelNomeAtor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeAtor.setText("Informe o nome do ator:");

        jTextFieldNomeAtor.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldNomeAtor.setToolTipText("Titulo do filme procurado");
        jTextFieldNomeAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeAtorActionPerformed(evt);
            }
        });

        jButtonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lupa.png"))); // NOI18N
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jTableListaAtores.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTableListaAtores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Nacionalidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListaAtores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListaAtoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableListaAtores);

        javax.swing.GroupLayout jPanelListaFilmesLayout = new javax.swing.GroupLayout(jPanelListaFilmes);
        jPanelListaFilmes.setLayout(jPanelListaFilmesLayout);
        jPanelListaFilmesLayout.setHorizontalGroup(
            jPanelListaFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaFilmesLayout.createSequentialGroup()
                .addGroup(jPanelListaFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelListaFilmesLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabelNomeAtor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeAtor, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonConsultar))
                    .addGroup(jPanelListaFilmesLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanelListaFilmesLayout.setVerticalGroup(
            jPanelListaFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaFilmesLayout.createSequentialGroup()
                .addGroup(jPanelListaFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelListaFilmesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelListaFilmesLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanelListaFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNomeAtor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNomeAtor))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanelListaFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(jLabelTitulo)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addGap(35, 35, 35)))
                .addComponent(jPanelListaFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeAtorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeAtorActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTableListaAtores.getModel();
        defaultTableModel.setRowCount(0);
        try {
            List<Ator> atores = this.atorController.findAll(jTextFieldNomeAtor.getText());
            atores.forEach((Ator ator) -> {
                defaultTableModel.addRow(new Object[] {
                    ator.getId_ator(),
                    ator.getNome(),
                    ator.getNacionalidade()
                });
            });
            
            jTableListaAtores.setModel(defaultTableModel);
        } catch(DbException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }    
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void fecharJanela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharJanela
        this.dispose();  
        if (this.telaCadastroAtor != null) {
            this.telaCadastroAtor.atorNull();
            this.telaCadastroAtor.setVisible(true);  
        }
    }//GEN-LAST:event_fecharJanela

    private void jTableListaAtoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaAtoresMouseClicked
        if (evt.getClickCount() == 2) {
            try {  
                Integer id_ator = (Integer) jTableListaAtores.getValueAt(jTableListaAtores.getSelectedRow(), 0);
                String nome = (String) jTableListaAtores.getValueAt(jTableListaAtores.getSelectedRow(), 1);
                String nacionalidade = (String) jTableListaAtores.getValueAt(jTableListaAtores.getSelectedRow(), 2);
                Ator ator = new Ator(id_ator, nome, nacionalidade);
                this.telaCadastroAtor.carregaAtor(ator);
                this.setVisible(false);
                this.telaCadastroAtor.setVisible(true);
            } catch (Exception e) {
                return;
            }
        }
    }//GEN-LAST:event_jTableListaAtoresMouseClicked

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
            java.util.logging.Logger.getLogger(TelaListaAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListaAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListaAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListaAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListaAtor().setVisible(true);
            }
        });
    }
    
    // Meus atributos
    private AtorController atorController;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JLabel jLabelNomeAtor;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelListaFilmes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableListaAtores;
    private javax.swing.JTextField jTextFieldNomeAtor;
    // End of variables declaration//GEN-END:variables
}
