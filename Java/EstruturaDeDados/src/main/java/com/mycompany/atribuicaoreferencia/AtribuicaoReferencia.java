/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atribuicaoreferencia;

/**
 *
 * @author maycon-linux
 */
public class AtribuicaoReferencia {

    public static void main(String[] args) {
        int a = 1;
        int b = a;
        
        System.out.println("A = " + a + "\nB = " + b);
        System.out.println(" ");
        
        a = 2;
        
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println(" ");
        
        MeuObj objA = new MeuObj(1);
        
        MeuObj objB = objA;
        
        System.out.println(" ");
        System.out.println("A = " + objA);
        System.out.println("B = " + objB);
        
        objA.setNum(2);
        
        System.out.println(" ");
        System.out.println("A = " + objA);
        System.out.println("B = " + objB);
        
        
    }
}
