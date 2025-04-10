/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacaoorientadaaobjetos;

/**
 *
 * @author maycon-linux
 */
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Branco", "Jetta 2015", 50);
        
        carro.valorTotalTanque(6.56);
        
        System.out.println("Modelo do carro: " + carro.getCor());
        System.out.println("Modelo do carro: " + carro.getModelo());
        System.out.println("Modelo do carro: " + carro.getCapacidadeTanque());
        System.out.println("Valor total para encher o tanque do carro R$" + carro.valorTotalTanque(6.56));
    }
}
