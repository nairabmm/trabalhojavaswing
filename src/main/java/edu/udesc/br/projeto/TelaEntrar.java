/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.udesc.br.projeto;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author duda
 */
public class TelaEntrar extends javax.swing.JFrame {

    private String email;
    private String senha;

    public TelaEntrar(JButton btnEntrarConta, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JTextField txtEmail, JTextField txtSenha) throws HeadlessException {
        this.btnEntrarConta = btnEntrarConta;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.txtEmail = txtEmail;
        this.txtSenha = txtSenha;
    }
    
//    private static ArrayList<Conta> perfil = new ArrayList();
    
    private static Conta perfil = null;

        
    public static Conta getPerfil(){
        
        return perfil;
    }
    
    /**
     * Creates new form TelaEntrar
     */
    public TelaEntrar() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnEntrarConta = new javax.swing.JButton();
        txtSenha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Entrar na sua conta.");

        jLabel2.setText("E-mail");

        jLabel3.setText("Senha");

        btnEntrarConta.setText("Entrar");
        btnEntrarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(txtSenha)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btnEntrarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnEntrarConta)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarContaActionPerformed
        entrarConta();
    }//GEN-LAST:event_btnEntrarContaActionPerformed

    public void entrarConta(){
        //Validação
        if(!validarCampos()){
            exibirMensagem("Preencha todos os campos!");
            return;
        }
        //Obter os dados da conta
        this.email = txtEmail.getText();
        this.senha = txtSenha.getText();
        
        //Buscar dados da conta
        buscaDadosConta();
        //Limpar os dados da tela
    }
    
    
    public void buscaDadosConta(){
        String emailAut;
        String senhaAut;
        ArrayList<Conta> contas = TelaCadastrarConta.getContas();
        for(Conta a: contas){
            emailAut = a.getEmail();
            senhaAut = a.getSenha();
            
            perfil = a;
            
            if (autenticar(emailAut, senhaAut) == true) {
                //Exibir uma mensagem de sucesso
                exibirMensagem("Login efetuado com sucesso!");
                limparDados();
                entrarTelaMenu();
                return;
            } else {
                //Exibir uma mensagem de sucesso
                exibirMensagem("Informações incorretas!");
            }
            
        }
        
    }
    
    public void entrarTelaMenu(){
        TelaMenu telaMenu = new TelaMenu();
        telaMenu.setVisible(true);
    }
    
    public boolean autenticar(String emailAut, String senhaAut) {
        return email.equals(emailAut) && senha.equals(senhaAut);
    }
    
    public void limparDados(){
        txtEmail.setText("");
        txtSenha.setText("");
    }
    
    
    public void exibirMensagem(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public boolean validarCampos(){
        if(txtEmail.getText().isBlank() || txtSenha.getText().isBlank())
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
            java.util.logging.Logger.getLogger(TelaEntrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEntrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEntrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEntrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEntrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrarConta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
