/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udesc.br.projeto;

import java.util.ArrayList;

/**
 *
 * @author duda
 */
public class Ouvinte extends Conta{
    private ArrayList<Musica> musicasFavoritas;

    public Ouvinte(String playlist, ArrayList<Musica> musicasFavoritas, String nome, String senha, String email, int tipoConta) {
        super(nome, senha, email, tipoConta);
        this.musicasFavoritas = musicasFavoritas;
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
