/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listacircular;

/**
 *
 * @author maycon-linux
 */
public class MainListaCircular {
    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();
        
        minhaListaCircular.add("c0");
        
        System.out.println(minhaListaCircular);
        
        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular); 
        
        minhaListaCircular.add("c1");
        System.out.println(minhaListaCircular); 
        
        minhaListaCircular.add("c2");
        minhaListaCircular.add("c3");
        System.out.println(minhaListaCircular); 
        
        System.out.println(minhaListaCircular.get(0));
        System.out.println(minhaListaCircular.get(1));
        System.out.println(minhaListaCircular.get(2));
        System.out.println(minhaListaCircular.get(3));
        
        for(int i = 0; i < 20; i++) {
            System.out.println(minhaListaCircular.get(i));
        }
  }
}
