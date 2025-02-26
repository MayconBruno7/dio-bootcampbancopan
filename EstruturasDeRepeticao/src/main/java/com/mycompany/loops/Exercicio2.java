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
public class Exercicio2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int nota;
        
        while(true) {
            
            System.out.println("informe uma nota entre zero e dez ou pressione (00) para sair do programa: ");
            nota = scan.nextInt();
            
            if(!(nota >= 0 && nota <= 10)) {
            
                System.out.println("Informe uma nota válida!");
            } else if(nota == 00) {
                break;
            }
            
        }
    }
    
}
