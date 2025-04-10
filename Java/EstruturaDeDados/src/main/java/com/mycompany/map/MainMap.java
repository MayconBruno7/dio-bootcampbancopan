/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author maycon-linux
 */
public class MainMap {
    
    public static void main(String[] args) {
        Map<String, String> aluno = new HashMap<>();
        
        aluno.put("Nome", "João");
        aluno.put("idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "3A");
        
        System.out.println(aluno);
        
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());
        
        List<Map<String, String>> listaAluno = new ArrayList<>();
        
        listaAluno.add(aluno);
        
        Map<String, String> aluno2 = new HashMap<>();
        
        aluno2.put("Nome", "Maria");
        aluno2.put("idade", "18");
        aluno2.put("Media", "8.9");
        aluno2.put("Turma", "3B");
        listaAluno.add(aluno2);
        
        System.out.println(listaAluno);
        System.out.println(aluno.containsKey("Nome"));
    }
}
