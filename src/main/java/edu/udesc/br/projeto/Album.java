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
public class Album implements Serializable{
   private Artista artista;
   private String data;
   private String titulo;
   private String genero;

    public Album(Artista artista, String data, String titulo, String genero) {
        this.artista = artista;
        this.data = data;
        this.titulo = titulo;
        this.genero = genero;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
}
