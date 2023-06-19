/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.udesc.br.projeto;;
import edu.udesc.br.projeto.Repositorio.RepositorioPlaylist;
import edu.udesc.br.projeto.Repositorio.RepositorioMusica;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author duda
 * @author mattheus
 * @author nairabmm
 */
public class TelaMusicas extends javax.swing.JFrame implements RecipienteDeMensagem {

    private Notificador notificador = Notificador.getInstance();
    private RepositorioMusica repositorioDeMusica = RepositorioMusica.getInstance();
    private RepositorioPlaylist repositorioPlaylists = RepositorioPlaylist.getInstance();
    private Conta conta;
    /**
     * Creates new form TelaPerfil
     */
    public TelaMusicas() {
        initComponents();
        conta = buscaDadosConta();
        if(conta instanceof Artista){
            btnCadastrarMusicas.setVisible(true);
            btnDesfavoritar.setVisible(false);
            btnFavoritar.setVisible(false);
            btnAddPlaylist.setVisible(false);
            cbMusicas.setVisible(false);
        } else {
            btnCadastrarMusicas.setVisible(false);
            btnDesfavoritar.setVisible(true);
            btnFavoritar.setVisible(true);
            btnAddPlaylist.setVisible(true);
            cbMusicas.setVisible(true);
        }
        notificador.inscrever(RepositorioMusica.LISTA_MUSICAS_ALTERADA, this);
        apresentarListaMusicas();
    }
    
    public void apresentarListaMusicas(){
        ArrayList<Musica> musicas = repositorioDeMusica.getMusicas();
        for(Musica a: musicas){
            txtMusicas.append(a.getTitulo()+"\n");
            cbMusicas.addItem(a);
        }
        
        ArrayList<Playlist> playlists = repositorioPlaylists.getPlaylists();
        for(Playlist pl : playlists) {
            cbPlaylist.addItem(pl.getNome());
        }
    }
    
    private static ArrayList<Musica> musicasFav = new ArrayList();
        
    public static ArrayList<Musica> getMusicasFav(){
        
        return musicasFav;
    }
    
   // model.remove(jList1.getSelectedIndex()); //retorna a posição do item selecionado.
    //jList1.setModel(model);
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCadastrarMusicas = new javax.swing.JButton();
        btnFavoritar = new javax.swing.JButton();
        btnAddPlaylist = new javax.swing.JButton();
        cbMusicas = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMusicas = new javax.swing.JTextArea();
        btnDesfavoritar = new javax.swing.JButton();
        cbPlaylist = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Músicas");

        btnCadastrarMusicas.setText("Cadastrar Músicas");
        btnCadastrarMusicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarMusicasActionPerformed(evt);
            }
        });

        btnFavoritar.setText("Favoritar Música");
        btnFavoritar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavoritarActionPerformed(evt);
            }
        });

        btnAddPlaylist.setText("Adicionar a uma playlist");
        btnAddPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPlaylistActionPerformed(evt);
            }
        });

        cbMusicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMusicasActionPerformed(evt);
            }
        });

        txtMusicas.setEditable(false);
        txtMusicas.setColumns(20);
        txtMusicas.setRows(5);
        jScrollPane2.setViewportView(txtMusicas);

        btnDesfavoritar.setText("Retirar dos favoritos");
        btnDesfavoritar.setToolTipText("");
        btnDesfavoritar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesfavoritarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(cbMusicas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrarMusicas, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFavoritar)
                            .addComponent(btnAddPlaylist)
                            .addComponent(btnDesfavoritar)
                            .addComponent(cbPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbMusicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFavoritar)
                        .addGap(12, 12, 12)
                        .addComponent(btnDesfavoritar)
                        .addGap(36, 36, 36)
                        .addComponent(cbPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddPlaylist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadastrarMusicas)))
                .addGap(32, 32, 32))
        );

        btnCadastrarMusicas.getAccessibleContext().setAccessibleName("Cadastrar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarMusicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarMusicasActionPerformed
        TelaCadastrarMusica telaCadastrarMusica = new TelaCadastrarMusica();
        telaCadastrarMusica.setVisible(true);
    }//GEN-LAST:event_btnCadastrarMusicasActionPerformed

    private void btnFavoritarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavoritarActionPerformed
        favoritarMusicas();
    }//GEN-LAST:event_btnFavoritarActionPerformed

    private void btnDesfavoritarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesfavoritarActionPerformed
        desfavoritarMusicas();
    }//GEN-LAST:event_btnDesfavoritarActionPerformed

    private void btnAddPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPlaylistActionPerformed
       adicionarMusicaPlaylist();
    }//GEN-LAST:event_btnAddPlaylistActionPerformed

    private void cbMusicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMusicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMusicasActionPerformed
    public void favoritarMusicas(){
        // Configura o modo de seleção da lista        
        Musica musicaSelecionada = (Musica) cbMusicas.getSelectedItem(); //retorna um Object. Convertemos por meio de Casting.
        //Favoritar a música
        TelaCadastrarMusica.favoritarMusica(musicaSelecionada);
        
        musicasFav.add(musicaSelecionada);
        //Exibir uma msg
        exibirMensagem("Música favoritada com sucesso");   
    }
    
    public void desfavoritarMusicas(){
        // Configura o modo de seleção da lista
        
        Musica musicaSelecionada = (Musica) cbMusicas.getSelectedItem(); //retorna um Object. Convertemos por meio de Casting.
        //Desfavoritar a música
        TelaCadastrarMusica.desfavoritarMusica(musicaSelecionada);
        
        musicasFav.add(musicaSelecionada);
        //Exibir uma msg
        exibirMensagem("Música retirada dos favoritos com sucesso");   
    }
    
    public static Conta buscaDadosConta(){
        return TelaEntrar.getPerfil();
    }
    
    public void adicionarMusicaPlaylist(){
        Musica musicaSelecionada = (Musica) cbMusicas.getSelectedItem();
        Playlist playlistSel = (Playlist) cbPlaylist.getSelectedItem();
        playlistSel.setMusica(musicaSelecionada);
        
        exibirMensagem("Música adicionada a playlist com sucesso");
    }
    
    public void exibirMensagem(String msg){
        JOptionPane.showMessageDialog(null, msg);
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
            java.util.logging.Logger.getLogger(TelaMusicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMusicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMusicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMusicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMusicas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPlaylist;
    private javax.swing.JButton btnCadastrarMusicas;
    private javax.swing.JButton btnDesfavoritar;
    private javax.swing.JButton btnFavoritar;
    private javax.swing.JComboBox<Musica> cbMusicas;
    private javax.swing.JComboBox<String> cbPlaylist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtMusicas;
    // End of variables declaration//GEN-END:variables

    @Override
    public void aoReceber(String chaveDeEvento) {
        apresentarListaMusicas();
    }
}
