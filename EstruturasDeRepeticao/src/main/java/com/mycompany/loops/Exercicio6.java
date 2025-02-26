/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loops;

import java.util.Scanner;

/**
 *
 * @author maycon-linux
 */
public class Exercicio6 {
    
    public static void main(String[] args) {
        int numFatorial;
        int resultado = 1;
        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe um número para o fatorial: ");
        numFatorial = scan.nextInt();
       
        for(int x = 1; x <= numFatorial; x++) {
            
            resultado *= x;
        }   
        
        System.out.println("O valor fatorial é: " + resultado);
    }
}
