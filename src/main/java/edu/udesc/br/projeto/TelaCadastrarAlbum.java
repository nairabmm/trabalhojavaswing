/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.udesc.br.projeto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author duda
 */
public class TelaCadastrarAlbum extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastrar
     */
    private static ArrayList<Album> albuns = new ArrayList();
        
    public static ArrayList<Album> getAlbuns(){
        
        return albuns;
    }
    
    public static void favoritarAlbum(Album album){
        album.isFavoritar();
    }
    
    public TelaCadastrarAlbum() {
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

        jLabel1 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCadastrarAlbum = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbGenero = new javax.swing.JComboBox<>();
        dtData = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Cadastrar álbum:");

        jLabel2.setText("Título");

        jLabel4.setText("Data");

        btnCadastrarAlbum.setText("Cadastrar Álbum");
        btnCadastrarAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAlbumActionPerformed(evt);
            }
        });

        jLabel5.setText("Gênero Musical");

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pop", "Sertanejo", "Rock", "MPB", "Indie", "Indie Rock", "Hip Hop", "Jazz", "Eletrônica", "Forró", "Axé", "Funk", "Pagode", "Reggae", "Samba", "Metal" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(dtData, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addComponent(btnCadastrarAlbum)))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnCadastrarAlbum)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAlbumActionPerformed
        cadastrarAlbum();
    }//GEN-LAST:event_btnCadastrarAlbumActionPerformed

    public void cadastrarAlbum(){
        //Validação
        if(!validarCampos()){
            exibirMensagem("Preencha todos os campos!");
            return;
        }
        //Obter os dados da música
        String genero = cbGenero.getSelectedItem().toString();
        int duracao = buscaDadosMusicas();
        String titulo = txtTitulo.getText();
        String data = dtData.getText();
        String artista = buscaDadosArtista();
        
        //Criar o aluno
        Album novoAlbum = new Album(duracao, artista, data, titulo, genero, false);
        
        //Salvar o aluno BD
        albuns.add(novoAlbum);
        
        //Exibir uma mensagem de sucesso
        exibirMensagem("Álbum cadastrado com sucesso!");
        
        //Limpar os dados da tela
        limparDados();
    } 
    
    public String buscaDadosArtista(){
        String artista = "";
        ArrayList<Conta> contas = TelaCadastrarConta.getContas();
        for(Conta a: contas){
            int tipoConta = a.getTipoConta();
            if(tipoConta == 1){
                artista = a.getNome();
            }
        }
        return artista;
    }
    
    public int buscaDadosMusicas(){
        int duracao = 0;
        ArrayList<Musica> musica = TelaCadastrarMusica.getMusicas();
        for(Musica a: musica){
            duracao += a.getDuracao();
        }
        return duracao;
    }
    
     public void limparDados(){
        //intDuracao.set;
        txtTitulo.setText("");
        dtData.setText("");
    }
    
    
    public void exibirMensagem(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public boolean validarCampos(){
        if(txtTitulo.getText().isBlank() || dtData.getText().isBlank())
            return false;
        return true;
    }
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
            java.util.logging.Logger.getLogger(TelaCadastrarAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrarAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarAlbum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarAlbum;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JFormattedTextField dtData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
