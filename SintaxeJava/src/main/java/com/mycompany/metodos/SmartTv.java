/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodos;

/**
 *
 * @author maycon-linux
 */
public class SmartTv {
 
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Novo canal: " + canal);
    }
    
    public void subirCanal() {
        canal++;
        System.out.println("Aumentando o canal para : " + canal);
    }
    
    public void diminuirCanal() {
        canal--;
        System.out.println("Aumentando o canal para : " + canal);
    }
    
    public void ligar() {
        ligada = true;
    }
    
    public void desligar() {
        ligada = false;
    }
    
    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para : " + volume);
    }
    
    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuido o volume para : " + volume);
    }
}
