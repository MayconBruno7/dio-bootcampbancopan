/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dominandoalgoritmosbasicoscomdesafiodecodigojava;

import java.util.*;

/**
 *
 * @author maycon-linux
 */
public class DesafioFabricaDeCarros {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
        int custoFabrica = scan.nextInt();
	int porcentagemDistribuidor = scan.nextInt();
	int PercentualImpostos = scan.nextInt();

        int custoConsumidor;
        int Distribuidor;
        int ValorImpostos;
        
        Distribuidor      = (custoFabrica * porcentagemDistribuidor) / 100;
        ValorImpostos     = (custoFabrica * PercentualImpostos) / 100;
        custoConsumidor   = (custoFabrica + Distribuidor + ValorImpostos);
 
        System.out.println(custoConsumidor);
    }
}
