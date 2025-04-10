/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilha;

import java.util.Stack;

/**
 *
 * @author maycon-linux
 */
public class MainPilha {
    
    public static void main(String[] args) {
        
        Pilha minhaPilha = new Pilha();
        
        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));
        
        System.out.println(minhaPilha);
        System.out.println(minhaPilha.top());
        System.out.println(minhaPilha.pop());
        minhaPilha.push(new No(99));
        System.out.println(minhaPilha);
        
        Stack<Carro> stackCarros = new Stack<>();
        
        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));
        
        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);
        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);
        System.out.println(stackCarros.empty());
    }
}
