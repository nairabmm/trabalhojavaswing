/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udesc.br.projeto;

/**
 *
 * @author duda
 */
public class Artista extends Conta {
    private String albuns;
    private int seguidores;
    private String musicas;

    public Artista(String albuns, int seguidores, String musicas, String nome, String senha, String email, int tipoConta) {
        super(nome, senha, email, tipoConta);
        this.albuns = albuns;
        this.seguidores = seguidores;
        this.musicas = musicas;
    }

    public String getAlbuns() {
        return albuns;
    }

    public void setAlbuns(String albuns) {
        this.albuns = albuns;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public String getMusicas() {
        return musicas;
    }

    public void setMusicas(String musicas) {
        this.musicas = musicas;
    }

    @Override
    public String toString() {
        return "Artista{" + "albuns=" + albuns + ", seguidores=" + seguidores + ", musicas=" + musicas + '}';
    }
    
}
