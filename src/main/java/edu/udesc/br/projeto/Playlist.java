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
public class Playlist implements Serializable{
    private int qtdFaixa;// este é uma dado calculado, que muda quando as músicas da playlist mudam
    private int duracao;// este é um dado calculado também
    private String nome;
    
    public Playlist(String nome)
    {
        this.nome = nome;
        this.duracao = 0;
        this.qtdFaixa = 0;
    }

    public Playlist(int duracao, int qtdFaixa, String nome) {
        this(nome);
        this.duracao = duracao;
        this.qtdFaixa = qtdFaixa;
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
