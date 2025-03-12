/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author maycon-linux
 */
public class Veiculo {
    
    String cor, modelo, tipo, quantidadeRodas;
    float capacidadeTanque;
    
    public Veiculo() {
        
    }
    
    public String getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(String quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
