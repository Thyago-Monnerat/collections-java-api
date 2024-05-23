package exercicios.operacoesBasicas.map.desafioLivraria;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LivrariaOnline {
    private Map<String, Livro> livraria;

    public LivrariaOnline(){
        this.livraria = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livraria.put(link, new Livro(titulo, autor, preco));
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

    public Set<Livro> exibirLivrosOrdenadosPorPreco(){
        Set<Livro> listaOrdenada = new TreeSet<>(livraria.values());
        return listaOrdenada;
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

        livraria.adicionarLivro("amazon/1000", "Senhor dos Anéis", "J R R Tolkien", 225d);
        livraria.adicionarLivro("amazon/1001", "Harry Potter e a Pedra Filosofal", "J K Rowling", 199d);
        livraria.adicionarLivro("amazon/1002", "O Hobbit", "J R R Tolkien", 150d);
        livraria.adicionarLivro("amazon/1003", "1984", "George Orwell", 89d);
        livraria.adicionarLivro("amazon/1004", "A Revolução dos Bichos", "George Orwell", 75d);
        livraria.adicionarLivro("amazon/1005", "Dom Quixote", "Miguel de Cervantes", 250d);
        livraria.adicionarLivro("amazon/1006", "A Divina Comédia", "Dante Alighieri", 300d);
        livraria.adicionarLivro("amazon/1007", "Orgulho e Preconceito", "Jane Austen", 180d);
        livraria.adicionarLivro("amazon/1008", "O Senhor das Moscas", "William Golding", 120d);
        livraria.adicionarLivro("amazon/1009", "Cem Anos de Solidão", "Gabriel Garcia Marquez", 210d);
        livraria.adicionarLivro("amazon/1010", "Ulisses", "James Joyce", 320d);
        livraria.removerLivro("O Hobbit");
        System.out.println(livraria.pesquisarLivrosPorAutor("J R R Tolkien"));
        System.out.println(livraria.obterLivroMaisCaro());
        System.out.println(livraria.exibirLivroMaisBarato());

    }

}
