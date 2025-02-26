/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

/**
 *
 * @author maycon-linux
 */
public class Exercicio1 {
    
    public static void main(String[] args) {
        int[] vetor = {0,1,2,3,4}; 
        
        int count = 0;
        
        while(count < (vetor.length -1)) {
            
            System.out.println(vetor[count]);
            count++;
        }
        
        System.out.println("  ");
        for(int i = (vetor.length -1); i >= 0; i--) {
            System.out.println(vetor[i]);
        }
        
    }
    
}
