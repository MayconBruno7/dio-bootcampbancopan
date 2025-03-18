/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collectionsjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author maycon-linux
 */
public class ExemploOrdenacaoLista {
    
    public static void main(String[] args) {
        
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("jon",18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("jon", 12, "amarelo"));
        }};
        
        System.out.println("Ordem de inserção");
        System.out.println(meusGatos);
        
        System.out.println("Ordem aleatoria");
        Collections.shuffle(meusGatos);
        
        System.out.println("Ordem aleatoria");
        Collections.shuffle(meusGatos);
         
    }
}

class Gato {

    private String nome, cor;
    private int Idade;

    public Gato(String nome, int Idade, String cor) {

        this.nome = nome;
        this.cor = cor;
        this.Idade = Idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    @Override
    public String toString() {
        return "ExemploOrdenacaoLista{" + "nome=" + nome + ", cor=" + cor + ", Idade=" + Idade + '}';
    }

}

