/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udesc.br.projeto.Repositorio;

import edu.udesc.br.projeto.Musica;
import edu.udesc.br.projeto.Notificador;
import edu.udesc.br.projeto.Playlist;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author naira
 */
public class RepositorioPlaylist {
    public static final String LISTA_PLAYLISTS_ALTERADA = "LISTA_PLAYLISTS_ALTERADA";
    private static RepositorioPlaylist instance;
    private Persistencia persistencia;
    private Notificador notificador;
    public ArrayList<Playlist> playlists;
    
    private RepositorioPlaylist() {
        persistencia = new Persistencia("playlists.txt");
        notificador = Notificador.getInstance();               
        this.playlists = new ArrayList(this.persistencia.carregar());
    }
    
    public static synchronized RepositorioPlaylist getInstance() {
        if (instance == null) {
            instance = new RepositorioPlaylist();
        }
        return instance;
    }
    
    public ArrayList<Playlist> getPlaylists()
    {
        return this.playlists;
    }
    
    public void adicionar(Playlist playlist)
    {
        this.playlists.add(playlist);
        notificador.publicar(LISTA_PLAYLISTS_ALTERADA);
        this.persistencia.persistir(playlists);
    }
}