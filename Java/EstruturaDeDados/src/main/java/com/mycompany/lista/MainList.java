/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maycon-linux
 */
public class MainList {
    
    public static void main(String[] args) {
        List<Carro> listCarros = new ArrayList<>();
    
        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Peugeot"));

        System.out.println(listCarros.contains(new Carro("Ford")));
        
        System.out.println(listCarros.get(2));
        
        System.out.println(listCarros.indexOf(new Carro("Fiat")));
        
        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);
    }

       
}
