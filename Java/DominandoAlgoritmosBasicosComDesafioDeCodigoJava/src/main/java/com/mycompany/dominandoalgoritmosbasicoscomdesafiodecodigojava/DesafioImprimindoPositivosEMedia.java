/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dominandoalgoritmosbasicoscomdesafiodecodigojava;

import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author maycon-linux
 */
public class DesafioImprimindoPositivosEMedia {
    
    public static void main(String[] args) throws IOException {
     Scanner leitor = new Scanner(System.in);
     int cont = 0;
     double media = 0;
     double somaNumeros = 0;
     
     //TODO: Implemente as condições adequadas para obter a quantidade 
    //de valores positivos e a média dos valores positivos:
        for (int i = 0; i < 6; i++) {
            double x = leitor.nextDouble();
            
            if(x > 0) {
              cont++;
              somaNumeros += x;
              
            }
        }
        
        media = (somaNumeros / cont);
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
            
}
