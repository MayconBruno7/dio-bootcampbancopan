/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generics;

/**
 *
 * @author maycon-linux
 */
public class MainGenerics {
    
    public static void main(String[] args) {
        Generics<String> no1 = new Generics<>("conteudo no 1");
        Generics<String> no2 = new Generics<>("conteudo no 2");
        
        no1.setProximoNo(no2);
        
        Generics<String> no3 = new Generics<>("Conteudo no3");
        no2.setProximoNo(no3);
        
        Generics<String> no4 = new Generics<>("Conteudo no3");
        no3.setProximoNo(no4);
        
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println("------------------------");
        
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
