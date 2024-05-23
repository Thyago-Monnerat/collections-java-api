package exercicios.operacoesBasicas.map.desafioContagemPalavras;
import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavrasTexto;

    public ContagemPalavras(){
        this.palavrasTexto = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavrasTexto.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if(!palavrasTexto.isEmpty()){
            if(palavrasTexto.containsKey(palavra)){
                palavrasTexto.remove(palavra);
                System.out.println("Palavra removida: " + palavra);
            }
        }else{
            System.out.println("Lista vazia!");
        }
    }

    public int exibirContagemPalavras(){
        int contagem = 0;
        for(int c : palavrasTexto.values()){
            contagem += c;
        }
        return contagem;
    }

    public String encontrarPalavraMaisFrequente(){
        String palavraMaisUsada = null;
        Integer palavraMenosUsada = Integer.MIN_VALUE;
        if(!palavrasTexto.isEmpty()){
            for(Map.Entry<String, Integer> p : palavrasTexto.entrySet()){ 
                if(p.getValue() > palavraMenosUsada){
                    palavraMenosUsada = p.getValue();
                    palavraMaisUsada = p.getKey();
                }        
            }
        }
        return palavraMaisUsada;
    }

    public static void main(String[] args) {
        ContagemPalavras cPalavras = new ContagemPalavras();

        cPalavras.adicionarPalavra("Olá3", 45);
        cPalavras.adicionarPalavra("Olá2", 35);
        cPalavras.adicionarPalavra("Olá9", 5);
        cPalavras.adicionarPalavra("Olá", 5);
        System.out.println(cPalavras.encontrarPalavraMaisFrequente());
    }
}

/**
 * 2. Contagem de Palavras
Crie uma classe chamada "ContagemPalavras" que utilize um Map para armazenar as palavras e a quantidade de vezes que cada palavra aparece em um texto. Implemente os seguintes métodos:

adicionarPalavra(String palavra, Integer contagem): Adiciona uma palavra à contagem.
removerPalavra(String palavra): Remove uma palavra da contagem, se estiver presente.
exibirContagemPalavras(): Exibe todas as palavras e suas respectivas contagens.
encontrarPalavraMaisFrequente(): Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.
 */