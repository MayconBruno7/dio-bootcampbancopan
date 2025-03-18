/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.map;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;


/**
 *
 * @author maycon-linux
 */
public class ExemploMap {   
    public static void main(String[] args) {
        
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 15.4);
        }};
        System.out.println(carrosPopulares);
        
        carrosPopulares.replace("gol", 15.2);
        System.out.println(carrosPopulares);
        
        System.out.println(carrosPopulares.containsKey("tucson"));
        
        System.out.println(carrosPopulares.get("uno"));
        
        System.out.println(carrosPopulares.keySet());
        
        System.out.println(carrosPopulares.values());
        
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
            }
        }
        System.out.println(modeloMaisEficiente);
        
        
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
            }
        }
        System.out.println(modeloMenosEficiente);
        
        
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        
        Double soma = 0d;
        
        while (iterator.hasNext()) {
            soma += iterator.next();
            
        }
        
        System.out.println(soma);
        System.out.println(soma/carrosPopulares.size());
        
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if(iterator1.next().equals(15.6)) {
                iterator1.remove();
            }
            
        }
        
        System.out.println(carrosPopulares);
        
         Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 15.4);
        }};
         
        System.out.println(carrosPopulares1);
        System.out.println("");
        
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);
        
        carrosPopulares.clear();
        
        System.out.println(carrosPopulares.isEmpty());
        
        
    }
}
