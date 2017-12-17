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
public class ListaLocais extends javax.swing.JFrame {

    MenuInicial mi;
    GestorDeConvivios gdc;
    
    /**
     * Cria uma nova instância de ListaLocais
     * 
     * @param mi  - objecto de MenuInicial
     * @param gdc - objecto de GestorDeConvivios
     */
    public ListaLocais(MenuInicial mi, GestorDeConvivios gdc) {
        this.mi = mi;
        this.gdc = gdc;
        
        initComponents();
        
        gdc.serializaLocais();
        
        for (Local l :gdc.getLocaisCoimbra()) {
            String msg = String.format("%-30s\t - %3d inscritos%n", l.getNome(), 
                    l.getInscritos());
            
            txtAreaMostraLocais.append(msg);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMostraLocais = new javax.swing.JTextArea();
        btnVoltar = new javax.swing.JButton();
        btnGuestLists = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lista de locais ordenada pelo número de inscritos");

        txtAreaMostraLocais.setEditable(false);
        txtAreaMostraLocais.setColumns(20);
        txtAreaMostraLocais.setRows(5);
        jScrollPane1.setViewportView(txtAreaMostraLocais);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 203, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnGuestLists.setText("Visualizar Guestlists");
        btnGuestLists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuestListsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(btnVoltar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btnGuestLists)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuestLists)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Volta ao menu anterior
     * @param evt - evento que ocorreu (parâmetro automático) 
     */
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
        mi.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnGuestListsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuestListsActionPerformed
        
        if (gdc.getConvivios().get(0).getInscricoes().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Não existem inscrições no "
                + "convívio");
        } 
        else {
        
            BarGuestList guestList = new BarGuestList(this, gdc);
        
            this.setVisible(false);
            guestList.setVisible(true);
        
            }
        
    }//GEN-LAST:event_btnGuestListsActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuestLists;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaMostraLocais;
    // End of variables declaration//GEN-END:variables
}
