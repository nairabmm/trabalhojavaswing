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
public class Musica implements Serializable {
   private Artista artista;
   private String data;
   private String titulo;
   private Album album;

    public Musica(Artista artista, String data, String titulo, Album album) {
        this.artista = artista;
        this.data = data;
        this.titulo = titulo;
        this.album = album;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
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

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
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
        return "Título: " + titulo;
    }

    
}
