package com.mycompany.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author maycon-linux
 */
public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        // HashMap sem ordenação
        Map<String, Livro> meusLivros = new HashMap<>();
        meusLivros.put("Hawking Stephen", new Livro("Uma breve", 510));
        meusLivros.put("fawking baaahen", new Livro("Poder hábito", 408));
        meusLivros.put("cawking avvv", new Livro("21 lições sec 21", 432));

        for (Map.Entry<String, Livro> entry : meusLivros.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
        System.out.println("");

        // LinkedHashMap mantém a ordem de inserção
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>();
        meusLivros1.put("Hawking Stephen", new Livro("Uma breve", 510));
        meusLivros1.put("Hawking baaahen", new Livro("Poder hábito", 408));
        meusLivros1.put("Hawking avvv", new Livro("21 lições sec 21", 432));

        for (Map.Entry<String, Livro> entry : meusLivros1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("");

        // TreeMap ordenado pelas chaves (neste caso, pelo nome do autor)
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        meusLivros2.put("Hawking Stephen", new Livro("Uma breve", 510));
        meusLivros2.put("Hawking baaahen", new Livro("Poder hábito", 408));
        meusLivros2.put("Hawking avvv", new Livro("21 lições sec 21", 432));

        for (Map.Entry<String, Livro> entry : meusLivros2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
        System.out.println("");

        // TreeSet com um Comparator para ordenar os livros pelo nome
        Set<Map.Entry<String, Livro>> meusLivrosSet = new TreeSet<>(new ComparatorNome());
        meusLivrosSet.addAll(meusLivros1.entrySet());

        for (Map.Entry<String, Livro> entry : meusLivrosSet) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("");
    }

    static class Livro {  
        private String nome;
        private Integer paginas;

        public Livro(String nome, Integer paginas) {
            this.nome = nome;
            this.paginas = paginas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getPaginas() {
            return paginas;
        }

        public void setPaginas(Integer paginas) {
            this.paginas = paginas;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 67 * hash + Objects.hashCode(this.nome);
            hash = 67 * hash + Objects.hashCode(this.paginas);
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
            final Livro other = (Livro) obj;
            if (!Objects.equals(this.nome, other.nome)) {
                return false;
            }
            return Objects.equals(this.paginas, other.paginas);
        }

        @Override
        public String toString() {
            return "Livro{" + "nome=" + nome + ", paginas=" + paginas + '}';
        }
    }
}

// Comparator para ordenar pelo nome do livro
class ComparatorNome implements Comparator<Map.Entry<String, ExemploOrdenacaoMap.Livro>> {

    public int compare(Map.Entry<String, ExemploOrdenacaoMap.Livro> l1, Map.Entry<String, ExemploOrdenacaoMap.Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
