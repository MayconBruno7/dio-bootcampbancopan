/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dominandoalgoritmosbasicoscomdesafiodecodigojava;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author maycon-linux
 */
public class DesafioFibonacci {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int proximo, anterior = 0, atual = 1;
        for (int i = 1; i <= N; i++) {
          if (i == N) System.out.println(anterior);
       
     //TODO: Implemente a condição ideal para que possamos obter os valores solicitados:
        	else System.out.print(anterior + " ");
        	proximo = atual + anterior;
        	anterior = atual; 
        	atual =  proximo; 
        }
    }
}
