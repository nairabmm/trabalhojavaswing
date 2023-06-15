/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udesc.br.projeto;

/**
 *
 * @author duda
 */
public class Album {
   private int duracao;
   private String artista;
   private String data;
   private String titulo;
   private String genero;
   private boolean favoritar;

    public Album(int duracao, String artista, String data, String titulo, String genero, boolean favoritar) {
        this.duracao = duracao;
        this.artista = artista;
        this.data = data;
        this.titulo = titulo;
        this.genero = genero;
        this.favoritar = favoritar;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isFavoritar() {
        return favoritar;
    }

    public void setFavoritar(boolean favoritar) {
        this.favoritar = favoritar;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
}
