/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacaoorientadaaobjetos;

/**
 *
 * @author maycon-linux
 */
public class Carro {

    String cor, modelo;
    float capacidadeTanque;
    
    public Carro(String cor, String modelo, float capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(float capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    
    public double valorTotalTanque(double valorGasolina) {
        return valorGasolina * this.capacidadeTanque;
    }
}
