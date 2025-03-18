package com.mycompany.set;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {

    public static void main(String[] args) {

        Set<Serie> minhasSeries = new LinkedHashSet<>();

        minhasSeries.add(new Serie("The Office", "Comédia", 25));
        minhasSeries.add(new Serie("Breaking Bad", "Drama", 50));
        minhasSeries.add(new Serie("Dark", "Ficção", 45));

        for (Serie serie : minhasSeries) {
            System.out.println(serie);
        }
        
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);
        System.out.println(minhasSeries2);
        
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());

        minhasSeries3.addAll(minhasSeries);
        
        for (Serie serie : minhasSeries3) {
            System.out.println(serie);
        }
    }
}

// Agora a classe Serie está fora da classe principal
class Serie implements Comparable<Serie>{

    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" + "nome='" + nome + '\'' + ", genero='" + genero + '\'' + ", tempoEpisodio=" + tempoEpisodio + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Serie other = (Serie) obj;
        return Objects.equals(nome, other.nome) &&
               Objects.equals(genero, other.genero) &&
               Objects.equals(tempoEpisodio, other.tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = this.getTempoEpisodio().compareTo(serie.getTempoEpisodio());
        
        if (tempoEpisodio != 0) return tempoEpisodio;
                
        return this.getGenero().compareTo(serie.getGenero());
        
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {
    
    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;
        
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;
        
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}