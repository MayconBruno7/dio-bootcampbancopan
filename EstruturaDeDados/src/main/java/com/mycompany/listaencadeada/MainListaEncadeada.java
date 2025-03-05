/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencadeada;

/**
 *
 * @author maycon-linux
 */
public class MainListaEncadeada {

    public static void main(String[] args) {
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();
        
        minhaListaEncadeada.add("teste1");
        minhaListaEncadeada.add("teste2");
        minhaListaEncadeada.add("teste3");
        minhaListaEncadeada.add("teste4");
        minhaListaEncadeada.add("teste5");
        
        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));
        
        System.out.println(minhaListaEncadeada);
        
        System.out.println(minhaListaEncadeada.remove(3));
        System.out.println(minhaListaEncadeada);
    }
    
}
