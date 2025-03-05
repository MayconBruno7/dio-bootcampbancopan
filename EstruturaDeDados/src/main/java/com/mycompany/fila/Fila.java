/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fila;

/**
 *
 * @author maycon-linux
 */
public class Fila<T> {

    private No<T> refNoEntradaFila;
    
    public Fila() {
        this.refNoEntradaFila = null;
    }
    
    public void enqueue(T object) {
        No novoNo = new No(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }
    
    public T first() {
        if(!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            
            while(true) {
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
                
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }
    
    public T dequeue() {
        if(!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            
            while(true) {
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
                
            }
            return (T)primeiroNo.getObject();
        }
        return null;
    }
    
    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        
        No noAuxiliar = refNoEntradaFila;
        
        if(refNoEntradaFila != null){
            while(true) {
                stringRetorno += "[No{Objeto=" + noAuxiliar.getObject() + "}]--->";
                
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += null;
                    break;
                }
            }
        } else {
            stringRetorno = null;
        }
        
        return stringRetorno;
    }
}
