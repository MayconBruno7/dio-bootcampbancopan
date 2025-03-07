/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equalshashcode;

import com.mycompany.pilha.Carro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maycon-linux
 */
public class MainEqualsHashCode {
    
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();
        
        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volksvagem"));
        
        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode());
        
        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");
        
        System.out.println(carro1.equals(carro2));
    }
            
}
