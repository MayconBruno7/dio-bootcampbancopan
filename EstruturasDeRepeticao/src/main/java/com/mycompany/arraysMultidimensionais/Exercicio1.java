/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraysMultidimensionais;

import java.util.Random;

/**
 *
 * @author maycon-linux
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[][] M = new int[4][4];
        
        for(int i = 0; i < M.length; i++) {
            for(int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);
            }
        }
        
        System.out.println("Matriz: ");
        for(int[] linha : M){
            for(int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println(" ");
        }
    }
    
    
    
    
}
