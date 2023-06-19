/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udesc.br.projeto;

/**
 *
 * @author duda
 * @author nairabmm
 */
public abstract class Conta {
    private String nome;
    private String senha;
    private String email;

    public Conta(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;        
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


    @Override
    public String toString() {
        String tipo;
        if(this instanceof Artista){
            tipo = "Artista";
        }else{
            tipo = "Ouvinte";
        }
        return "Nome: " + nome + "\nE-mail: " + email + "\nTipo de conta: " + tipo;
    }

    
}
