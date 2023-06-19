/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udesc.br.projeto;

/**
 *
 * @author duda
 */
public class Ouvinte extends Conta{
    private String playlist;
    private String musicaFavorita;

    public Ouvinte(String playlist, String musicaFavorita, String nome, String senha, String email, int tipoConta) {
        super(nome, senha, email, tipoConta);
        this.playlist = playlist;
        this.musicaFavorita = musicaFavorita;
    }

    public String getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

    public String getMusicaFavorita() {
        return musicaFavorita;
    }

    public void setMusicaFavorita(String musicaFavorita) {
        this.musicaFavorita = musicaFavorita;
    }

    @Override
    public String toString() {
        return "Ouvinte{" + "playlist=" + playlist + ", musicaFavorita=" + musicaFavorita + '}';
    }
    
}
