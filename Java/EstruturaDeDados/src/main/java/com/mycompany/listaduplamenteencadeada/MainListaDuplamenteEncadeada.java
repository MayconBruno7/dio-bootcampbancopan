/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaduplamenteencadeada;

/**
 *
 * @author maycon-linux
 */
public class MainListaDuplamenteEncadeada {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaListaenEncadeada = new ListaDuplamenteEncadeada<>();
        
        minhaListaenEncadeada.add("c1");
        minhaListaenEncadeada.add("c2");
        minhaListaenEncadeada.add("c3");
        minhaListaenEncadeada.add("c4");
        minhaListaenEncadeada.add("c5");
        minhaListaenEncadeada.add("c6");
        minhaListaenEncadeada.add("c7");
        
        System.out.println(minhaListaenEncadeada);
        
        minhaListaenEncadeada.remove(3);
        
        System.out.println(minhaListaenEncadeada);
        
        minhaListaenEncadeada.add(3, "99");
        
        System.out.println(minhaListaenEncadeada);
        System.out.println(minhaListaenEncadeada.get(3));
    }
            
}
