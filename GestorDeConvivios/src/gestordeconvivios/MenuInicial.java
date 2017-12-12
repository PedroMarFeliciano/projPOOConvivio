/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordeconvivios;

/**
 *
 * @author Pedro Feliciano
 */
public class MenuInicial extends javax.swing.JFrame {

    GestorDeConvivios gdc;
    
    public MenuInicial(GestorDeConvivios gdc) {
        this.gdc = gdc;
        initComponents();
        
        lblNomeConvivio.setText("Convívio: " + 
                gdc.getConvivios().get(0).getTitulo());
        labelNumPessoasLocais.setText("Existem " + gdc.getPessoas().size() +
                " pessoas inscritas e " + gdc.getLocaisCoimbra().size() + 
                " locais cadastrados.");
        
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        btnNovaInscricao = new javax.swing.JButton();
        btnListaInscricoes = new javax.swing.JButton();
        lblNomeConvivio = new javax.swing.JLabel();
        labelNumPessoasLocais = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNovaInscricao.setText("Nova Inscrição");
        btnNovaInscricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaInscricaoActionPerformed(evt);
            }
        });

        btnListaInscricoes.setText("Lista Inscrições");
        btnListaInscricoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaInscricoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovaInscricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListaInscricoes, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnNovaInscricao, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListaInscricoes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        lblNomeConvivio.setText("jLabel1");

        labelNumPessoasLocais.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNumPessoasLocais)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomeConvivio)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblNomeConvivio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNumPessoasLocais)
                .addGap(34, 34, 34)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovaInscricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaInscricaoActionPerformed
        AdicionaInscricao addInscricao = new AdicionaInscricao(this, gdc);
        
        this.setVisible(false);
        addInscricao.setVisible(true);
        
    }//GEN-LAST:event_btnNovaInscricaoActionPerformed

    private void btnListaInscricoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaInscricoesActionPerformed
        ListaInscricoes li =  new ListaInscricoes(this, gdc);
        this.setVisible(false);
        li.setVisible(true);
        
    }//GEN-LAST:event_btnListaInscricoesActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListaInscricoes;
    private javax.swing.JButton btnNovaInscricao;
    private javax.swing.JLabel labelNumPessoasLocais;
    private javax.swing.JLabel lblNomeConvivio;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
