/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operadores;

import java.util.Date;

/**
 *
 * @author maycon-linux
 */
public class Operadores {
    
    public static void main (String [] args) {
        String nome = "Nome";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();


        double soma = 10.5 + 15.7;
        int subtracao = 113 -25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double result = (10 * 7) + (20 / 4);


        String nomeCompleto = "Linguagem" + "Java";

    //    Unário 

        int numero = 5;

        numero = -numero;
        
        System.out.println(numero);
        
//        repetição 

        numero = numero + 2;
        System.out.println(numero);
        
        numero++;
        System.out.println(numero);
        
        ++numero;
        System.out.println(numero);
        
        numero--;
        System.out.println(numero);
        
        --numero;
        System.out.println(numero);
        
//        Ternário
        int a,b;
        
        a = 5;
        b = 6;
        
        String resultado;
        
        resultado = (a == b) ? "Verdadeiro" : "Falso";
        
        System.out.println(resultado);
        
        
        
        
        boolean simNao = a == b;
        
        System.out.println(simNao);
        
        
        
        boolean condicao1 = true;
        boolean condicao2 = true;
        
        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        } 
        
         if (condicao1 || condicao2) {
            System.out.println("Uma das condições são verdadeiras");
        } 
        
    }
    
}
