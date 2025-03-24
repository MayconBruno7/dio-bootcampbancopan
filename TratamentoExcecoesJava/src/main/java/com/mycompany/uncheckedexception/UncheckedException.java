/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.uncheckedexception;

import javax.swing.JOptionPane;

/**
 *
 * @author maycon-linux
 */
public class UncheckedException {

    public static void main(String[] args) {

        boolean continueLooping = true;
        
        do {
            
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
            
            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Impossivel dividir o número por zero" + e.getMessage());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! " + e.getMessage());
//            e.printStackTra1e();
            } finally {
                System.out.println("Chegou no finally!");
                
            }
        } while (continueLooping);

        System.out.println("Codigo continua");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
