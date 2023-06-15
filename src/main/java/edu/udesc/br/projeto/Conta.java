/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udesc.br.projeto;

/**
 *
 * @author duda
 */
public class Conta {
    private String nome;
    private String senha;
    private String email;
    private int tipoConta;

    public Conta(String nome, String senha, String email, int tipoConta) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.tipoConta = tipoConta; //1 - Artista | 2 - Ouvinte
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }
    

    @Override
    public String toString() {
        return "Conta{" + "nome=" + nome + ", senha=" + senha + ", email=" + email + ", tipoConta=" + tipoConta + '}';
    }

    
}
