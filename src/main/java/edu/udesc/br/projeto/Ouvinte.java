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
public class Ouvinte extends Conta implements Serializable {
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
    
    public void favoritar(Musica m){
        this.musicasFavoritadas.add(m);
    }
    
    public void desfavoritar(Album a){
        this.albunsFavoritados.remove(a);
    }
    
    public void desfavoritar(Musica m){
        this.musicasFavoritadas.remove(m);
    }
    
    public boolean isFavoritado(Album a) {
        return this.albunsFavoritados.contains(a);
    }
    
    public boolean isFavoritado(Musica m) {
        return this.musicasFavoritadas.contains(m);
    }
  
    @Override
    public String toString() {
        return "Ouvinte{" + "playlist=" + this.albunsFavoritados.toString() + ", musicaFavorita=" + this.musicasFavoritadas.toString() + '}';
    }
    
}
