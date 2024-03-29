/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udesc.br.projeto.Repositorio;

/**
 *
 * @author naira
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

//public class Persistencia {
//    
//    String nomeDoArquivo;
//    
//    public Persistencia(String nomeDoArquivo)
//    {
//        this.nomeDoArquivo = nomeDoArquivo;
//    }
//    
//    public <T> void persistir(List<T> lista) {
//        try (FileOutputStream fileOutputStream = new FileOutputStream(nomeDoArquivo);
//             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
//
//            objectOutputStream.writeObject(lista);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    
//    public <T> List carregar() {
//        List<T> lista = null;
//        try (FileInputStream fileInputStream = new FileInputStream(nomeDoArquivo);
//             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
//
//            lista = (List<T>) objectInputStream.readObject();
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return lista;
//    }
//}

import java.io.File;
import java.util.ArrayList;

public class Persistencia {
    
    String nomeDoArquivo;
    
    public Persistencia(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }
    
    public <T> void persistir(ArrayList<T> lista) {
        try {
            try (FileOutputStream fileOutputStream = new FileOutputStream(nomeDoArquivo);
                 ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

                objectOutputStream.writeObject(lista);
            }
        } catch (IOException e) {
            System.out.println("Arquivo " + nomeDoArquivo + " não encontrardo");
        }
    }
    
    public <T> ArrayList<T> carregar() {
        ArrayList<T> lista = null;
        try {
            try (FileInputStream fileInputStream = new FileInputStream(nomeDoArquivo);
                 ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

                lista = (ArrayList<T>) objectInputStream.readObject();
            }
        } catch (Exception e) {
            System.out.println("Arquivo " + nomeDoArquivo + " não encontrardo");
        }
        if(lista == null)
            return new ArrayList<T>();
        
        return lista;
    }
            
}
