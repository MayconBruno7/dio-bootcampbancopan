/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.collectionsjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author maycon-linux
 */
public class ExemploList {

    public static void main(String[] args) {    
        List<Double> notas = new ArrayList<>();
//        ArrayList<Double> notas = new ArrayList<>();
        notas.add(1d);
        notas.add(2.0);
        notas.add(3.0);
        notas.add(4.0);
        notas.add(5.0);
        notas.add(6.0);
        notas.add(7.0);
        
        System.out.println(notas);
        
        notas.indexOf(2);
        
        System.out.println(notas);
        
        notas.add(7, 8.0);
        
        System.out.println(notas);
        
        notas.set(notas.indexOf(5.0), 22.0);
        
        System.out.println(notas);
        System.out.println(notas.contains(5.0));
        
        System.out.println("");
        System.out.println("Todas as notas");
        for (Double nota : notas) {
            System.out.println(nota);
        }
        
        System.out.println("");
        System.out.println(notas.get(2));
        System.out.println("");

        System.out.println(Collections.min(notas));
        System.out.println("");
        System.out.println(Collections.max(notas));
        System.out.println("");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        System.out.println("");
        System.out.println(soma / notas.size());
        
        System.out.println("");
        notas.remove(0d);
        System.out.println("");
        
        notas.remove(0);
        System.out.println("");
        
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()){
            Double next = iterator2.next();
            if (next < 7) iterator2.remove();
        }
        System.out.println(notas);
        System.out.println("");
        
        notas.clear();
        System.out.println(notas);
    }
}
