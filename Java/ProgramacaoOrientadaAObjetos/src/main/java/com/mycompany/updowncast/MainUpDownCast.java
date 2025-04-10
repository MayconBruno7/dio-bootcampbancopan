/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.updowncast;

/**
 *
 * @author maycon-linux
 */
public class MainUpDownCast {
    
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        
        Funcionario gerente = new Gerente();
        Funcionario venderdor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();
        
        Vendedor vendedor = (Vendedor) new Funcionario();
    }
}
