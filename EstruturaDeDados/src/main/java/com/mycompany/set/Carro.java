/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set;

import java.util.Objects;

/**
 *
 * @author maycon-linux
 */
public class Carro implements Comparable<Carro> {
    
    String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.marca);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carro other = (Carro) obj;
        return Objects.equals(this.marca, other.marca);
    }

    public Carro(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + '}';
    }

//    @Override
//    public int compareTo(Carro t) {
//        if(this.marca.length() < t.marca.length()) {    
//            return -1;
//        } else if(this.marca.length() < t.marca.length()) {
//            return 1;
//        } 
//        
//        return 0;
//        
//    }
    
    @Override
    public int compareTo(Carro t) {
        return this.getMarca().compareTo(t.getMarca());
       
    }
    
}
