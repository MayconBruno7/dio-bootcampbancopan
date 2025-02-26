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
public class Exercicio3 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num;
        int cout = 0;
        int maiorNumero = 0;
        double soma = 0;
        double media = 0;
        
        do {
            System.out.println("Numero: ");
            num = scan.nextInt();
            
            if(maiorNumero <= num) {
                maiorNumero = num;
            }
            
            soma += num;
            
            cout++;
            
        } while(cout < 5);
        
        System.out.println("O maior numero digitado foi: " + maiorNumero);
        
        media = (soma/5);
        System.out.println("A média dos números é: " + media);
    }
    
}
