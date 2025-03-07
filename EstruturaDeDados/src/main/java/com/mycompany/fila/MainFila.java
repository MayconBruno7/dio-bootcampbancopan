/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fila;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author maycon-linux
 */
public class MainFila {
    
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();
        
        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");
        
        System.out.println(minhaFila);
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);
        minhaFila.enqueue("ultimo");
        System.out.println(minhaFila);
        System.out.println(minhaFila.first());
        
        Queue<Carro> queueCarros = new LinkedList<>();
        
        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));
        
        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);
        
        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);
        
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);
        
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);
        
        System.out.println(queueCarros.isEmpty());
        System.out.println(queueCarros);
    }
}
