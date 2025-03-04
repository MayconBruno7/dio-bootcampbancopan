/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilha;

/**
 *
 * @author maycon-linux
 */
public class Pilha {
    
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }
    
    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }
    
    public No pop() {
        if(!this.isEmpty()) {
            No nopoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return nopoped;
        } 
        return null;
    }
    
    public No top() {
        return refNoEntradaPilha;
    }
    
    public boolean isEmpty() {
        
//        if(refNoEntradaPilha == null) {
//            return true;
//        } 
//        return false;
        
        return refNoEntradaPilha == null ? true : false;
        
    }

    @Override
    public String toString() {
        String stringRetorno = "----------------\n";
        stringRetorno += " Pilha\n";
        stringRetorno += " ----------------------\n";
        
        No noAuxiliar = refNoEntradaPilha;
        
        while(true) {
            if(noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else
                break;
        }
        
        stringRetorno += "====================\n";
        return stringRetorno;
    }
}
