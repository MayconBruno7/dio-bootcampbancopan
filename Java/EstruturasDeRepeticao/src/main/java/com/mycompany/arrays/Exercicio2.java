/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author maycon-linux
 */
public class Exercicio2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] consoantes = new String[6];
        int quantidadeConsoante = 0;
        
        int count = 0;
        
        
        do{
            
            System.out.println("Letra: ");
            String letra = scan.next().toLowerCase(); 

            String[] vogais = {"a", "e", "i", "o", "u"};
            boolean ehVogal = false;

            for (int x = 0; x < vogais.length; x++) {
                if (letra.equals(vogais[x])) {
                    ehVogal = true; 
                    break;
                }
            }
          
            if (!ehVogal) {
                consoantes[count] = letra;
                quantidadeConsoante++;
            }

            count++;

        } while(count < consoantes.length);
        
        System.out.println("Consoantes digitadas:");
        for (String consoante : consoantes) {
            if (consoante != null) { 
                System.out.print(consoante + " ");
                System.out.println(" ");
                    
            }
        }
        
        System.out.println("Quantidade de consoantes digitadas: " + quantidadeConsoante);
    }
}
