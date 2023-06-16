/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udesc.br.projeto.Repositorio;

import edu.udesc.br.projeto.Musica;
import edu.udesc.br.projeto.Notificador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author naira
 */
public class RepositorioMusica {
    public static final String LISTA_MUSICAS_ALTERADA = "LISTA_MUSICAS_ALTERADA";
    private static RepositorioMusica instance;
    private Persistencia persistencia;
    private Notificador notificador;
    public ArrayList<Musica> musicas;
    
    private RepositorioMusica() {
        persistencia = new Persistencia("musicas.txt");
        notificador = Notificador.getInstance();               
        this.musicas = new ArrayList(this.persistencia.carregar());
    }
    
    public static synchronized RepositorioMusica getInstance() {
        if (instance == null) {
            instance = new RepositorioMusica();
        }
        return instance;
    }
    
    public ArrayList<Musica> getMusicas()
    {
        return this.musicas;
    }
    
    public void adicionar(Musica musica)
    {
        this.musicas.add(musica);
        notificador.publicar(LISTA_MUSICAS_ALTERADA);
        this.persistencia.persistir(musicas);
    }
}