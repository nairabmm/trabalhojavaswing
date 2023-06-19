/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udesc.br.projeto;

import java.io.Serializable;

/**
 *
 * @author duda
 * @author nairabmm
 */
public class Artista extends Conta implements Serializable{
    private int seguidores;
    

    public Artista(String nome, String senha, String email) {
        super(nome, senha, email);
        this.seguidores = 0;
    }
    
    public Artista(String nome, String senha, String email, int seguidores) {
        super(nome, senha, email);
        this.seguidores = seguidores;
    }      
    
    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    @Override
    public String toString() {
        return "Artista{" + super.toString() + "seguidores=" + seguidores + '}';
    }
    
}
