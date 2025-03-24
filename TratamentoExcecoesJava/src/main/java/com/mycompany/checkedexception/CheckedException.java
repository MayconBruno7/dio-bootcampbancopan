/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.checkedexception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author maycon-linux
 */
public class CheckedException {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String nomeDoArquivo = "romances-blake-crounch.txt";
        
        imprimirArquivoNoConsole(nomeDoArquivo);
        
        System.out.println("Apesar de exception ou, o programa continua...");
    }
    
    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws FileNotFoundException, IOException {
        File file = new File(nomeDoArquivo);
        
        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        do {            
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);
        
        bw.flush();
        br.close();
    }
}
