/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptionpersonalizada;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author maycon-linux
 */
public class ExceptionPersonalizada1 {

    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {

            try {
                if (numerador[i] % 2 != 0) {
                    throw new DivisaoNaoExataException(numerador[i], denominador[i], "Divisão não exata!");
                }
                int resultado = numerador[i] / denominador[i];

                System.out.println(resultado);

            } catch (DivisaoNaoExataException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }
        System.out.println("O programa continua...");
    }
}

class DivisaoNaoExataException extends Exception {

    private int numerador;
    private int denominador;

    public DivisaoNaoExataException(int numerador, int denominador, String message) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }

}
