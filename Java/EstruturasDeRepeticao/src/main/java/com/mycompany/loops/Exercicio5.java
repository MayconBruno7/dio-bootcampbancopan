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
public class Exercicio5 {
    
    public static void main(String[] args) {
        
        int numTabuada;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe um número para gerar a tabuada: ");
        numTabuada = scan.nextInt();
        
        for(int x = 1; x <= 10; x++) {
            System.out.println(numTabuada + " x " + x + " = " + (numTabuada * x));
            
        }
    }
    
}
