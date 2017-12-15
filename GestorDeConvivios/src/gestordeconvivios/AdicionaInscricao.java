/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordeconvivios;

import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Feliciano
 */
public class AdicionaInscricao extends javax.swing.JFrame {
    
    GestorDeConvivios gdc;
    MenuInicial mi;
    
    public AdicionaInscricao(MenuInicial mi, GestorDeConvivios gdc) {
        this.mi = mi;
        this.gdc = gdc;
        
        initComponents();
        
        comboBoxLocais.removeAllItems();
        comboBoxPessoas.removeAllItems();
        
        for (Pessoa p: gdc.getPessoas()) {
            comboBoxPessoas.addItem(p.getNome());
        }
        
        for (Local l: gdc.getLocaisCoimbra()) {
            comboBoxLocais.addItem(l.getNome());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAdicionaInscricao = new javax.swing.JPanel();
        labelExplicacao = new javax.swing.JLabel();
        labelPessoas = new javax.swing.JLabel();
        labelLocais = new javax.swing.JLabel();
        comboBoxPessoas = new javax.swing.JComboBox<>();
        comboBoxLocais = new javax.swing.JComboBox<>();
        btnInscrever = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaInfoLocais = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelExplicacao.setText("Selecione uma pessoa e um local para efetivar a inscrição");

        labelPessoas.setText("Pessoas");

        labelLocais.setText("Locais");

        comboBoxPessoas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxPessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboBoxPessoasMouseClicked(evt);
            }
        });

        comboBoxLocais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxLocais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxLocaisActionPerformed(evt);
            }
        });

        btnInscrever.setText("Inscrever");
        btnInscrever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscreverActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtAreaInfoLocais.setColumns(20);
        txtAreaInfoLocais.setRows(5);
        jScrollPane1.setViewportView(txtAreaInfoLocais);

        javax.swing.GroupLayout panelAdicionaInscricaoLayout = new javax.swing.GroupLayout(panelAdicionaInscricao);
        panelAdicionaInscricao.setLayout(panelAdicionaInscricaoLayout);
        panelAdicionaInscricaoLayout.setHorizontalGroup(
            panelAdicionaInscricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdicionaInscricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAdicionaInscricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAdicionaInscricaoLayout.createSequentialGroup()
                        .addGroup(panelAdicionaInscricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPessoas)
                            .addComponent(labelExplicacao))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdicionaInscricaoLayout.createSequentialGroup()
                        .addComponent(comboBoxPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelAdicionaInscricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxLocais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelLocais))
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdicionaInscricaoLayout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInscrever))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdicionaInscricaoLayout.createSequentialGroup()
                        .addGap(0, 146, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelAdicionaInscricaoLayout.setVerticalGroup(
            panelAdicionaInscricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdicionaInscricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelExplicacao)
                .addGap(34, 34, 34)
                .addGroup(panelAdicionaInscricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPessoas)
                    .addComponent(labelLocais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAdicionaInscricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxLocais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panelAdicionaInscricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInscrever)
                    .addComponent(btnVoltar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAdicionaInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAdicionaInscricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInscreverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscreverActionPerformed
        Local local = null;
        Pessoa pessoa = null;
        
        for (Pessoa p: gdc.getPessoas()) {
            if (p.getNome() == comboBoxPessoas.getSelectedItem()) {
                pessoa = p;
                break;
            }
        }
        
        for (Local l: gdc.getLocaisCoimbra()) {
            if (l.getNome() == comboBoxLocais.getSelectedItem()) {
                local = l;
                break;
            }
        }
        
        if (pessoa.contaLocais()) {
            if (validaInscricao(pessoa, local)) {
                gdc.getConvivios().get(0).adInscricao(local, pessoa);
                JOptionPane.showMessageDialog(rootPane,
                        "Inscrição realizada com sucesso.");
            } else {
                JOptionPane.showMessageDialog(rootPane,
                        "Essa pessoa já está inscrita nesse local.");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Atingiu o limite "
                    + "de locais");
        }
        
        this.setVisible(false);
        mi.setVisible(true);
    }//GEN-LAST:event_btnInscreverActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        mi.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void comboBoxPessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxPessoasMouseClicked

        
        return;
    }//GEN-LAST:event_comboBoxPessoasMouseClicked

    private void comboBoxLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxLocaisActionPerformed
        Local local = gdc.getLocaisCoimbra().get(0);
        
        for (Local l: gdc.getLocaisCoimbra()) {
            if (l.getNome() == comboBoxLocais.getSelectedItem()) {
                local = l;
                break;
            }
        }
       
        txtAreaInfoLocais.setText(local.toString());
    }//GEN-LAST:event_comboBoxLocaisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInscrever;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboBoxLocais;
    private javax.swing.JComboBox<String> comboBoxPessoas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelExplicacao;
    private javax.swing.JLabel labelLocais;
    private javax.swing.JLabel labelPessoas;
    private javax.swing.JPanel panelAdicionaInscricao;
    private javax.swing.JTextArea txtAreaInfoLocais;
    // End of variables declaration//GEN-END:variables

    private boolean validaInscricao(Pessoa p, Local l) {

        for (Inscricao i: gdc.getConvivios().get(0).getInscricoes()) {
            if (i.getInscrito() == p && i.getLocal() == l) {
                return false;
            }
        }
        return true;
    }
}
