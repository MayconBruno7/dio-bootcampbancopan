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
public class ExceptionPersonalizada {

    public static void main(String[] args) throws FileNotFoundException, IOException, ImpossivelAberturaDeArquivoException {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido");

        imprimirArquivoNoConsole(nomeDoArquivo);

        System.out.println("\nApesar de exception ou, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws FileNotFoundException, IOException, ImpossivelAberturaDeArquivoException {
        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);

            bw.flush();
            br.close();
        } catch(ImpossivelAberturaDeArquivoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro não esperado, por favor, fale com o suporte");
        } 

    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {
        File file = new File(nomeDoArquivo);
        
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException ex) {
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
//            Logger.getLogger(ExceptionPersonalizada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class ImpossivelAberturaDeArquivoException extends Exception {
    private String nomeDoArquivo;
    private String diretorio;

    public ImpossivelAberturaDeArquivoException(String nomeDoArquivo, String diretorio) {
        super("O arquivo" + nomeDoArquivo + "não foi encontrado no diretório! " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException{" + "nomeDoArquivo=" + nomeDoArquivo + ", diretorio=" + diretorio + '}';
    }
    
    
    
}
