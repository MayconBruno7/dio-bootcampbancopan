/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author maycon-linux
 */
public class ExemploSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5.0, 7.0, 0.0));
        
        System.out.println("Notas: " + notas);
        
        notas.contains(5.0);
        
        Collections.min(notas);
        
        Collections.max(notas);
        
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        
        System.out.println(soma);
        System.out.println(soma / notas.size());
        
        notas.remove(0d);
        
        System.out.println(notas);
        
        Iterator<Double> iterator1 = notas.iterator();
        
        while(iterator.hasNext()) {
            Double next = iterator1.next();
            
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);
        
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8d);
        notas2.add(9d);
        notas2.add(2d);
        notas2.add(7.2);
        
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        
        notas.clear();
        
        System.out.println(notas.isEmpty());
        
        
    }
            
}
