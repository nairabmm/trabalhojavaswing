/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udesc.br.projeto;

/**
 *
 * @author naira
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Notificador {
    private static Notificador instance;
    private Map<String, Set<RecipienteDeMensagem>> inscricoes;

    private Notificador() {
        inscricoes = new HashMap<>();
    }

    public static synchronized Notificador getInstance() {
        if (instance == null) {
            instance = new Notificador();
        }
        return instance;
    }

    public void inscrever(String chave, RecipienteDeMensagem novoRecipiente) {
        Set<RecipienteDeMensagem> recipientes = inscricoes.getOrDefault(chave, new HashSet<>());
        recipientes.add(novoRecipiente);
        inscricoes.put(chave, recipientes);
    }

    public void publicar(String chaveEvento) {
        Set<RecipienteDeMensagem> ouvintes = inscricoes.get(chaveEvento);
        if (ouvintes != null) {
            for (RecipienteDeMensagem ouvinte : ouvintes) {
                ouvinte.aoReceber(chaveEvento);
            }
        }
    }
}
