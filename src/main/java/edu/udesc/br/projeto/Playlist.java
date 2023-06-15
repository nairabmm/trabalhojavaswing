/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udesc.br.projeto;

/**
 *
 * @author duda
 */
public class Playlist {
    private int qtdFaixa;
    private int duracao;
    private String nome;

    public Playlist(int duracao, int qtdFaixa, String nome) {
        this.duracao = duracao;
        this.qtdFaixa = qtdFaixa;
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getQtdFaixa() {
        return qtdFaixa;
    }

    public void setQtdFaixa(int qtdFaixa) {
        this.qtdFaixa = qtdFaixa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "Playlist{" + "duracao=" + duracao + ", qtdFaixa=" + qtdFaixa + nome +'}';
    }
    
    
}
