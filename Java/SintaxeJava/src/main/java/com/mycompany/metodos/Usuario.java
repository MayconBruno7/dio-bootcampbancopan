/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodos;

/**
 *
 * @author maycon-linux
 */
public class Usuario {
    
    public static void main(String [] args) {
        
        SmartTv smartTv = new SmartTv();
        
        smartTv.mudarCanal(7);
        
        System.out.println("Volume atual : " + smartTv.volume);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        smartTv.subirCanal();
        smartTv.diminuirCanal();
    
        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal : " + smartTv.canal);
        System.out.println("Volume : " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("TV ligada ? " + smartTv.ligada);
         
        smartTv.desligar();
        System.out.println("TV ligada ? " + smartTv.ligada);
        
    }
    
   
}
