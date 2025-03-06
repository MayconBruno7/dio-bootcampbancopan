/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listacircular;

/**
 *
 * @author maycon-linux
 */
public class No<T> {
    private T conteudo;
    private No<T> noProximo;

    public No(T conteudo) {
        this.noProximo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(No<T> noProximo) {
        this.noProximo = noProximo;
    }

    @Override
    public String toString() {
        return "No{" + "conteudo=" + conteudo + '}';
    }
}
