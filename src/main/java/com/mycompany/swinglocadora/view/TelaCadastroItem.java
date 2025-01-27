/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.swinglocadora.view;

import com.mycompany.swinglocadora.controller.ItemController;
import com.mycompany.swinglocadora.db.DbException;
import com.mycompany.swinglocadora.model.entities.Filme;
import com.mycompany.swinglocadora.model.entities.Item;
import com.mycompany.swinglocadora.model.exceptions.ValidationException;
import java.util.Set;
import javax.swing.JOptionPane;

public class TelaCadastroItem extends javax.swing.JFrame {
    
    TelaPrincipal telaPrincipal;
    
    /**
     * Creates new form TelaCadastroAtor
     */
    public TelaCadastroItem(TelaPrincipal tela) {
        initComponents();
        this.item = new Item();
        this.id_filme = null;
        this.telaPrincipal = tela;
        this.itemController = new ItemController();  
        this.jButtonDeletar.setVisible(false);
    }
    
    public void carregaItem(Item item) {
        this.item = item;
        jTextFieldIdItem.setText(String.valueOf(item.getId_item()));
        jTextFieldPreco.setText(String.valueOf(item.getPreco()));
        jLabelTitulo.setText("Editando o Item ID: " + item.getId_item());
        jButtonDeletar.setVisible(true);
    }
    
    public void carregaFilme(Integer id_filme) {
        this.id_filme = id_filme;
        jTextFieldFilme.setText(String.valueOf(id_filme));
    }
    
    public void itemNull() {
        this.item = null;
        this.id_filme = null;
        this.jButtonDeletar.setVisible(false);
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
        jLabelTitulo = new javax.swing.JLabel();
        jPanelCadastroItem = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldFilme = new javax.swing.JTextField();
        jLabelTipo = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonConsultaFilmes = new javax.swing.JButton();
        jLabelPreco = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jLabelErrorPreco = new javax.swing.JLabel();
        jButtonDeletar = new javax.swing.JButton();
        jLabelIDItem = new javax.swing.JLabel();
        jTextFieldIdItem = new javax.swing.JTextField();

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
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon.png"))); // NOI18N
        jLabelTitulo.setText("Cadastro de Item");

        jPanelCadastroItem.setBackground(new java.awt.Color(102, 102, 102));

        jLabelNome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("ID Filme:");

        jTextFieldFilme.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldFilme.setEnabled(false);
        jTextFieldFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFilmeActionPerformed(evt);
            }
        });

        jLabelTipo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipo.setText("Tipo:");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blu-Ray Disc", "CD", "DVD" }));

        jButtonSalvar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonConsultar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonConsultaFilmes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lupa.png"))); // NOI18N
        jButtonConsultaFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultaFilmesActionPerformed(evt);
            }
        });

        jLabelPreco.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelPreco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPreco.setText("Preço:");

        jTextFieldPreco.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecoActionPerformed(evt);
            }
        });

        jLabelErrorPreco.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabelErrorPreco.setForeground(new java.awt.Color(255, 51, 51));

        jButtonDeletar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonDeletar.setText("Deletar");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jLabelIDItem.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelIDItem.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIDItem.setText("ID Item:");

        jTextFieldIdItem.setEditable(false);
        jTextFieldIdItem.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldIdItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastroItemLayout = new javax.swing.GroupLayout(jPanelCadastroItem);
        jPanelCadastroItem.setLayout(jPanelCadastroItemLayout);
        jPanelCadastroItemLayout.setHorizontalGroup(
            jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroItemLayout.createSequentialGroup()
                .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroItemLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPreco)
                            .addComponent(jLabelTipo)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelIDItem))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldIdItem, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCadastroItemLayout.createSequentialGroup()
                                .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldFilme)
                                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelCadastroItemLayout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabelErrorPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelCadastroItemLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonConsultaFilmes))))))
                    .addGroup(jPanelCadastroItemLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButtonSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDeletar)))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanelCadastroItemLayout.setVerticalGroup(
            jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroItemLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIDItem)
                    .addComponent(jTextFieldIdItem, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroItemLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNome)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroItemLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonConsultaFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelErrorPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTipo)
                        .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroItemLayout.createSequentialGroup()
                        .addComponent(jLabelPreco)
                        .addGap(52, 52, 52)
                        .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSalvar)
                            .addComponent(jButtonLimpar)
                            .addComponent(jButtonCancelar)
                            .addComponent(jButtonConsultar)
                            .addComponent(jButtonDeletar)))
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanelCadastroItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelTitulo)
                .addGap(30, 30, 30)
                .addComponent(jPanelCadastroItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFilmeActionPerformed

    }//GEN-LAST:event_jTextFieldFilmeActionPerformed

    private void jTextFieldPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecoActionPerformed

    private void jButtonConsultaFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultaFilmesActionPerformed
        TelaListaFilme telaListaFilme = new TelaListaFilme(this);
        this.setVisible(false);
        telaListaFilme.setVisible(true);
    }//GEN-LAST:event_jButtonConsultaFilmesActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
        this.telaPrincipal.setVisible(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (this.item == null) this.item = new Item();
        jLabelErrorPreco.setText("");
        String tipo = jComboBoxTipo.getSelectedItem().toString();
        double preco; 
        try {
            preco = Double.parseDouble(jTextFieldPreco.getText());
        } catch (Exception e) {
            preco = 0;
        }
        
        Filme filme = new Filme();
        filme.setId_filme(Integer.parseInt(jTextFieldFilme.getText()));
        
        if (jTextFieldIdItem.getText().trim().isEmpty()) {
            this.item.setId_item(null);
        } else {
            this.item.setId_item(Integer.parseInt(jTextFieldIdItem.getText()));
        }
        this.item.setFilme(filme);
        this.item.setTipo(tipo);
        this.item.setPreco(preco);
        Integer id = item.getId_item();
        try {
            this.itemController.save(this.item);
            if (id == null) {
                JOptionPane.showMessageDialog(null, "Item cadastrado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Item atualizado com sucesso");
            }
            jButtonLimparActionPerformed(evt);
            this.itemNull();
            
        } catch(ValidationException e) {
            Set<String> fields = e.getErrors().keySet();
            
            if(fields.contains("preco")) {
                jLabelErrorPreco.setText(e.getErrors().get("preco"));
            }
            
            if(fields.contains("filme")) {
                JOptionPane.showMessageDialog(null, e.getErrors().get("filme"));
            }
            
        } catch(DbException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        TelaListaItem telaListaItem = new TelaListaItem(this);
        this.setVisible(false);
        telaListaItem.setVisible(true);
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldIdItem.setText("");
        jTextFieldFilme.setText("");
        this.id_filme = null;
        jTextFieldPreco.setText("");    
        jLabelErrorPreco.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        if(this.item == null) {
            JOptionPane.showMessageDialog(null, "Selecione um item para apagar");
            return;
        }
        
        try {
            this.itemController.delete(this.item);
            JOptionPane.showMessageDialog(null, "Item deletado com sucesso");
            this.jButtonLimparActionPerformed(evt);
            this.itemNull();
        } catch(DbException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jTextFieldIdItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdItemActionPerformed
    
    // Meus Atributos
    private Integer id_filme;
    private Item item;
    private ItemController itemController;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultaFilmes;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabelErrorPreco;
    private javax.swing.JLabel jLabelIDItem;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelCadastroItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldFilme;
    private javax.swing.JTextField jTextFieldIdItem;
    private javax.swing.JTextField jTextFieldPreco;
    // End of variables declaration//GEN-END:variables
}
