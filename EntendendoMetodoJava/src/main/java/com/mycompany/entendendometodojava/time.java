/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entendendometodojava;

import java.time.LocalTime;

/**
 *
 * @author maycon-linux
 */
public class time {

    LocalTime horarioAtual = LocalTime.now();
    
    public String getSaudacao() {
        if(horarioAtual.getHour() > 6 && horarioAtual.getHour() < 12) {
            return "Bom dia";
        } else if(horarioAtual.getHour() > 12 && horarioAtual.getHour() < 18) {
            return "Boa tarde";
        }
        return "Boa noite";
    }
}
