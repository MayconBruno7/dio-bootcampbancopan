/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atribuicaoreferencia;

/**
 *
 * @author maycon-linux
 */
public class MeuObj {
    
    Integer num;

    public MeuObj(Integer num) {
        this.num = num;
    }
    
    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
 }
