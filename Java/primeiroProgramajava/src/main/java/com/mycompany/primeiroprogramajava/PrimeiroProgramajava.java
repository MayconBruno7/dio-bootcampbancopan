/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeiroprogramajava;

import com.mycompany.primeiroprogramajava.model.Gato;

/**
 *
 * @author maycon-linux
 */
public class PrimeiroProgramajava {

    public static void main(String[] args) {
        
        Gato gato = new Gato();
        Livros livros = new Livros();
        
        System.out.println(gato);
        System.out.println(livros);
        
        
        int a = 1;
        int b = 3;
        
        int soma = a + b;
        
        System.out.println("Hello World!, Aqui é o Maycon!! " + soma);
        
    }
}


class Livros {
    
    private String nome;
    private String npag;
    
}
