/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loops;

import java.util.Scanner;

/**
 *
 * @author maycon-linux
 */
public class Exercicio1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String nome;
        int idade;
        
        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();

            if(nome.equals("0")) 
                break;
            
            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
        
    }
}
