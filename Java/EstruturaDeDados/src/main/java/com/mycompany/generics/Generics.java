/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generics;

/**
 *
 * @author maycon-linux
 */
public class Generics<T> {
    
    private T conteudo;
    private Generics<T> proximoNo;

    public Generics(T conteudo) {
        this.proximoNo = null;  
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public Generics<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(Generics<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" + "conteudo=" + conteudo + '}';
    }
    
}
