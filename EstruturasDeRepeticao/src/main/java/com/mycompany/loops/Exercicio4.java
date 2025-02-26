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
public class Exercicio4 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num;
        int qtdNmrPares = 0;
        int qtdNmrImpares = 0;
        
        while(true) {
            System.out.println("Informe um número ou digite(00) para sair: ");
            num = scan.nextInt();
            
            if (num == 00) {
                break;
            }
              
            if((num % 2 == 0)) {
                qtdNmrPares++;
            } else {
                qtdNmrImpares++;
            }
        }
        
        System.out.println("Quantidade de números pares: " + qtdNmrPares);
        System.out.println("Quantidade de números impares: " + qtdNmrImpares);
    }
}
