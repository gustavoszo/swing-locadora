package com.mycompany.swinglocadora.view;

import com.mycompany.swinglocadora.controller.ItemController;
import com.mycompany.swinglocadora.db.DbException;
import com.mycompany.swinglocadora.model.entities.Item;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaListaItem extends javax.swing.JFrame {
    
    private TelaCadastroItem telaCadastro;
 
    public TelaListaItem(TelaCadastroItem telaCadastro) {
        this.telaCadastro = telaCadastro;
        this.itemController = new ItemController();
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
        jLabelTituloFilme = new javax.swing.JLabel();
        jTextFieldTituloFilme = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListaItens = new javax.swing.JTable();

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
        jLabelTitulo.setText("Consulta de Itens");

        jPanelListaFilmes.setBackground(new java.awt.Color(102, 102, 102));

        jLabelTituloFilme.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelTituloFilme.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloFilme.setText("Informe o titulo do filme:");

        jTextFieldTituloFilme.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldTituloFilme.setToolTipText("Titulo do filme procurado");
        jTextFieldTituloFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTituloFilmeActionPerformed(evt);
            }
        });

        jButtonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lupa.png"))); // NOI18N
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jTableListaItens.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTableListaItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código Item", "Código Filme", "Titulo", "Tipo", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListaItens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListaItensMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableListaItens);

        javax.swing.GroupLayout jPanelListaFilmesLayout = new javax.swing.GroupLayout(jPanelListaFilmes);
        jPanelListaFilmes.setLayout(jPanelListaFilmesLayout);
        jPanelListaFilmesLayout.setHorizontalGroup(
            jPanelListaFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaFilmesLayout.createSequentialGroup()
                .addGroup(jPanelListaFilmesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelListaFilmesLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabelTituloFilme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTituloFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jTextFieldTituloFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTituloFilme))))
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
                        .addGap(99, 99, 99)
                        .addComponent(jLabelTitulo)))
                .addContainerGap(16, Short.MAX_VALUE))
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
                        .addGap(34, 34, 34)))
                .addComponent(jPanelListaFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTituloFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTituloFilmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTituloFilmeActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTableListaItens.getModel();
        defaultTableModel.setRowCount(0);
        try {
            List<Item> itens = this.itemController.findAll(jTextFieldTituloFilme.getText());
            itens.forEach((Item item) -> {
                defaultTableModel.addRow(new Object[] {
                    item.getId_item(),
                    item.getFilme().getId_filme(),
                    item.getFilme().getTitulo(),
                    item.getTipo(),
                    item.getPreco()
                });
            });
            jTableListaItens.setModel(defaultTableModel);
        } catch(DbException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void fecharJanela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharJanela
        this.dispose();  
        if (this.telaCadastro != null) {
            String tela = this.telaCadastro.getClass().getSimpleName();
            if (tela.equals("TelaCadastroItem")) {
                telaCadastro.itemNull();
                telaCadastro.setVisible(true); 
            } 
        }
    }//GEN-LAST:event_fecharJanela

    private void jTableListaItensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaItensMouseClicked
        if(evt.getClickCount() == 2) {
            try {
                Integer id_item = (Integer) jTableListaItens.getModel().getValueAt(jTableListaItens.getSelectedRow(), 0);
                Integer id_filme = (Integer) jTableListaItens.getModel().getValueAt(jTableListaItens.getSelectedRow(), 1);
                String titulo = (String) jTableListaItens.getModel().getValueAt(jTableListaItens.getSelectedRow(), 2);
                String tipo = (String) jTableListaItens.getModel().getValueAt(jTableListaItens.getSelectedRow(), 3);
                double preco = (Double) jTableListaItens.getModel().getValueAt(jTableListaItens.getSelectedRow(), 4);
             
                Item item = new Item(tipo, preco);
                item.setId_item(id_item);
                
                this.telaCadastro.carregaItem(item);
                this.telaCadastro.carregaFilme(id_filme);
                this.telaCadastro.setVisible(true);
                this.dispose();
                
            } catch(Exception e) {
                return;
            }
        }
    }//GEN-LAST:event_jTableListaItensMouseClicked
    
    // Meus atributos
    ItemController itemController;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloFilme;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelListaFilmes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableListaItens;
    private javax.swing.JTextField jTextFieldTituloFilme;
    // End of variables declaration//GEN-END:variables
}
