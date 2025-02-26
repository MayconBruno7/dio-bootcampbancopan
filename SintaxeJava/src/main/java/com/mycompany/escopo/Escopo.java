/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escopo;

/**
 *
 * @author maycon-linux
 */

public class Escopo {

    // Variável de instância (escopo de classe)
    private int variavelDeClasse = 10;

    // Método principal
    public static void main(String[] args) {
        // Variável local (escopo de método)
        int variavelDeMetodo = 20;

        // Cria uma instância da classe Escopo
        Escopo escopo = new Escopo();

        // Acessa a variável de instância
        System.out.println("Variável de classe: " + escopo.variavelDeClasse);

        // Acessa a variável local do método
        System.out.println("Variável de método: " + variavelDeMetodo);

        // Chama um método que demonstra escopo de bloco
        escopo.demonstrarEscopoDeBloco();
    }

    // Método para demonstrar escopo de bloco
    public void demonstrarEscopoDeBloco() {
        // Variável local do método
        int variavelDeMetodo = 30;

        // Bloco de código (escopo de bloco)
        {
            int variavelDeBloco = 40;
            System.out.println("Variável de bloco: " + variavelDeBloco);

            // Acesso à variável de método dentro do bloco
            System.out.println("Variável de método dentro do bloco: " + variavelDeMetodo);

            // Acesso à variável de classe dentro do bloco
            System.out.println("Variável de classe dentro do bloco: " + this.variavelDeClasse);
        }

        // Fora do bloco, a variável de bloco não é acessível
        // System.out.println("Variável de bloco fora do bloco: " + variavelDeBloco); // Isso causaria um erro de compilação

        // Acesso à variável de método fora do bloco
        System.out.println("Variável de método fora do bloco: " + variavelDeMetodo);
    }
}
