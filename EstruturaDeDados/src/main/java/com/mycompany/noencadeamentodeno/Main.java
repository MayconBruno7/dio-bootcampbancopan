/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generics;

import com.mycompany.noencadeamentodeno.No;

/**
 *
 * @author maycon-linux
 */
public class Main {
    
    public static void main(String[] args) {
        No no1 = new No("conteudo no 1");
        No no2 = new No("conteudo no 2");
        
        no1.setProximoNo(no2);
        
        No no3 = new No("Conteudo no3");
        no2.setProximoNo(no3);
        
        No no4 = new No("Conteudo no3");
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
