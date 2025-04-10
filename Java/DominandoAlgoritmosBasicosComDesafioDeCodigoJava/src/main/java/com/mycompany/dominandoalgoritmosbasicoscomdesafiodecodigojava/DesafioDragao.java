/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dominandoalgoritmosbasicoscomdesafiodecodigojava;

import java.util.Scanner;

/**
 *
 * @author maycon-linux
 */
public class DesafioDragao {
    public static void main(String[] args){
            int casos, poderDeLuta;
    
            Scanner ler = new Scanner(System.in);
    
            casos = ler.nextInt();
    
            for(int i = 0; i < casos; i++){
                poderDeLuta = ler.nextInt();

//TODO: Implemente a condição adequada para a impressão dos textos conforme o solicitado no desafio:
    
                if(poderDeLuta  <= 8000){
                    System.out.println("Inseto!");
                } else {
                    System.out.println("Mais de 8000!");
                }
            }
    }
}
