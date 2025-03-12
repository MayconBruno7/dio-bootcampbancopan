/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismoesobreescrita;

/**
 *
 * @author maycon-linux
 */
public class MainPoliESobreescrita {
    public static void main(String[] args) {
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
        
        for (ClasseMae classe : classes) {
            classe.metodo1();
        }
        
        System.out.println("");
        
        for (ClasseMae classe : classes) {
            classe.metodo2();
        }
        
        System.out.println("");
        
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
