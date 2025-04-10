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
public class DesafioSomaHComNTermos {

    public static void main(String[] args) {
        double h = 1;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
            h += 1.0 / i;
        }
        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
        System.out.println(String.format("%.0f", h));
    }
}
