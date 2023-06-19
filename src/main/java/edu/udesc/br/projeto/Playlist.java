/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udesc.br.projeto;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author duda
 * @author nairabmm
 */
public class Playlist implements Serializable {
    private String nome;
    private ArrayList<Musica> musicas;
   
    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<Musica>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void adicionar(Musica m) {
        this.musicas.add(m);
    }
    
     public ArrayList<Musica> getMusicas() {
        return musicas;
    }
        
    public int quantidadeDeFaixas() {
        return this.musicas.size();
    }
    
    @Override
    public String toString() {
        return "Playlist: " + nome + " - Quantidade de faixas: " + this.quantidadeDeFaixas();
    }
    
    
}
