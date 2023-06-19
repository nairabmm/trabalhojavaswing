/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udesc.br.projeto;

import java.util.ArrayList;

/**
 *
 * @author duda
 * @author nairabmm
 */
public class Ouvinte extends Conta{
    //Lista do albuns favoritados por um ouvinte
    private ArrayList<Album> albunsFavoritados;
    
    //Lista das músicas favoritadas por um ouvinte
    private ArrayList<Musica> musicasFavoritadas;

    public Ouvinte(String nome, String senha, String email) {
        super(nome, senha, email);
        this.albunsFavoritados = new ArrayList<Album>();
        this.musicasFavoritadas = new ArrayList<Musica>();
    }
    
    public ArrayList<Album> getAlbunsFavoritados() {
        return albunsFavoritados;
    }

    public ArrayList<Musica> getMusicasFavoritadas() {
        return musicasFavoritadas;
    }
    
    public void favoritar(Album a){
        this.albunsFavoritados.add(a);
    }
    
    public void desfavoritar(Album a){
        this.albunsFavoritados.remove(a);
    }
    
    public boolean isFavoritado(Album a) {
        return this.albunsFavoritados.contains(a);
    }
  
    @Override
    public String toString() {
        return "Ouvinte{" + "playlist=" + this.albunsFavoritados.toString() + ", musicaFavorita=" + this.musicasFavoritadas.toString() + '}';
    }
    
}
