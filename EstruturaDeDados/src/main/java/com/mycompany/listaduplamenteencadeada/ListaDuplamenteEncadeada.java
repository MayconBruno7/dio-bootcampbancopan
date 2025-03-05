/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaduplamenteencadeada;

/**
 *
 * @author maycon-linux
 */
public class ListaDuplamenteEncadeada<T> {  
    
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    
    private int tamanhoLista;
    
    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        tamanhoLista = 0;
    }
    
    public T get(int index) {
        return this.getNo(index).getConteudo();
    }
    
    private NoDuplo<T> getNo(int index) {   
        NoDuplo<T> noAuxiliar = primeiroNo;
        
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }
    
    
    public int size() {
        return tamanhoLista;
    }
    
    
}
