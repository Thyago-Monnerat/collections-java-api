package exercicios.operacoesBasicas.map.desafioLivraria;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
    private Map<String, Livro> livraria;

    public LivrariaOnline(){
        this.livraria = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro){
        livraria.put(link, livro);
    }

    public void removerLivro(String titulo){
        if(!livraria.isEmpty()){
            for(Map.Entry<String, Livro> l : livraria.entrySet()){
                if(l.getValue().getTitulo() == titulo){
                    livraria.remove(l.getKey());
                    System.out.println("Livro removido: " + l.getValue().getTitulo());
                    break;
                }
            }
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livrosParaOrdenar = new ArrayList<>(livraria.entrySet());
        Collections.sort(livrosParaOrdenar, new ComparatorPreco());
        Map<String, Livro> livrosOrdenados = new LinkedHashMap<>();
        for(Map.Entry<String, Livro> entry : livrosParaOrdenar){
            livrosOrdenados.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenados;
        
    }

    public Collection<String> pesquisarLivrosPorAutor(String autor){
        Collection<String> livroPorAutor = new HashSet<>();
        if(!livraria.isEmpty()){
            for(Livro l : livraria.values()){
                if(l.getAutor() == autor){
                    livroPorAutor.add(l.getTitulo());
                }
            }
        }
        return livroPorAutor;
    }


    public Livro obterLivroMaisCaro(){
        Livro livroMaisCaro = null;
        Double precoBaixo = Double.MIN_VALUE;
        for(Livro l : livraria.values()){
            if(l.getPreco() > precoBaixo){
                precoBaixo = l.getPreco();
                livroMaisCaro = l;
            }
        }
        return livroMaisCaro;
    }
    public Livro exibirLivroMaisBarato(){
        Livro livroMaisCaro = null;
        Double precoBaixo = Double.MAX_VALUE;
        for(Livro l : livraria.values()){
            if(l.getPreco() < precoBaixo){
                precoBaixo = l.getPreco();
                livroMaisCaro = l;
            }
        }
        return livroMaisCaro;
    }

    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();

        livraria.adicionarLivro("amazon/1000", new Livro("O Senhor dos Anéis", "J R R Tolkien", 0d));
        livraria.adicionarLivro("amazon/1001", new Livro("Harry Potter e a Pedra Filosofal", "J K Rowling", 199d));
        livraria.adicionarLivro("amazon/1002", new Livro("O Hobbit", "J R R Tolkien", 150d));
        livraria.adicionarLivro("amazon/1003", new Livro("1984", "George Orwell", 89d));
        livraria.adicionarLivro("amazon/1004", new Livro("A Revolução dos Bichos", "George Orwell", 75d));
        livraria.adicionarLivro("amazon/1005", new Livro("Dom Quixote", "Miguel de Cervantes", 250d));
        livraria.adicionarLivro("amazon/1006", new Livro("A Divina Comédia", "Dante Alighieri", 300d));
        livraria.adicionarLivro("amazon/1007", new Livro("Orgulho e Preconceito", "Jane Austen", 180d));
        livraria.adicionarLivro("amazon/1008", new Livro("O Senhor das Moscas", "William Golding", 120d));
        livraria.adicionarLivro("amazon/1009", new Livro("Cem Anos de Solidão", "Gabriel Garcia Marquez", 210d));
        livraria.adicionarLivro("amazon/1010", new Livro("Ulisses", "James Joyce", 320d));

        livraria.removerLivro("O Hobbit");
        System.out.println(livraria.pesquisarLivrosPorAutor("J R R Tolkien"));
        System.out.println(livraria.obterLivroMaisCaro());
        System.out.println(livraria.exibirLivroMaisBarato());

    }

}
