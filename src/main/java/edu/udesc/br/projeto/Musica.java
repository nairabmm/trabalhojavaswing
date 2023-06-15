/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udesc.br.projeto;
import java.io.Serializable;

/**
 *
 * @author duda
 */
public class Musica implements Serializable {
   private int duracao;
   private String artista;
   private String data;
   private String titulo;
   private String album;
   private boolean favoritar;

    public Musica(int duracao, String artista, String data, String titulo, String album, boolean favoritar) {
        this.duracao = duracao;
        this.artista = artista;
        this.data = data;
        this.titulo = titulo;
        this.album = album;
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

    public boolean isFavorita() {
        return favoritar;
    }

    public void setFavorita(boolean favoritar) {
        this.favoritar = favoritar;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
    
    public String reproduzir(){
        String reproduzir = "Reproduzindo";
        return reproduzir;
    }
    
    public String pausar(){
        String pausa = "Pausada";
        return pausa;
    }

    @Override
    public String toString() {
        return "Musica{" + "duracao=" + duracao + ", artista=" + artista + ", data=" + data + ", titulo=" + titulo + ", album=" + album + ", favoritar=" + favoritar + '}';
    }

    
}
