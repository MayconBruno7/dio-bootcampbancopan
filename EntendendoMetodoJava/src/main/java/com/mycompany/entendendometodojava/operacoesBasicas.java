/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entendendometodojava;

/**
 *
 * @author maycon-linux
 */
public class operacoesBasicas {
    
    public int soma(int num1, int num2) {
        return (num1 + num2);
    }
    
    public int subtracao(int num1, int num2) {
        
        if (num2 < num1) {
            return (num2 - num1);
        }
        
       return (num2 * num1);
    }
    
    public int multiplicacao(int num1, int num2) {
        return (num1 * num2);
    }
    
    public float divisao(int num1, int num2) {
        return (num1 / num2);
    }
    
}
