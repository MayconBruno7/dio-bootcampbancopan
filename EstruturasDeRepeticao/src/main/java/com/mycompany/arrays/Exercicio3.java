/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

import java.util.Random;

/**
 *
 * @author maycon-linux
 */
public class Exercicio3 {
    
    public static void main(String[] args) {
        Random random = new Random();
        
        int[] numeroAleatorios = new int[20];
        
        for(int i = 0; i < numeroAleatorios.length; i++) {
            int numero = random.nextInt(100);
            
            numeroAleatorios[i] = numero;
        }
        
        System.out.print("Números aleatórios: ");
        for(int numero : numeroAleatorios) {
               System.out.print(numero + " ");
        }
        
        
        System.out.print("\nSucessores dos números aleatórios: ");
        for(int numero : numeroAleatorios) {
               System.out.print((numero + 1) + " ");
        }
    }
    
}
