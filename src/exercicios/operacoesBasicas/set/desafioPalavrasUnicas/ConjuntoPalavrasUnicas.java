package exercicios.operacoesBasicas.set.desafioPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;
    
    public ConjuntoPalavrasUnicas(){
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }


    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas [palavrasUnicas=" + palavrasUnicas + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((palavrasUnicas == null) ? 0 : palavrasUnicas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
        if (palavrasUnicas == null) {
            if (other.palavrasUnicas != null)
                return false;
        } else if (!palavrasUnicas.equals(other.palavrasUnicas))
            return false;
        return true;
    }

    public void removerPalavra(String palavra){
        String palavraBuscada = "";
        if(!palavrasUnicas.isEmpty()){
            for(String s : palavrasUnicas){
                if(s == palavra){
                    palavraBuscada = s;
                    palavrasUnicas.remove(palavraBuscada);
                    System.out.println("Palavra removida com sucesso: " + palavraBuscada);
                    break;
                }
            } 
            if(palavraBuscada == ""){
                System.out.println("Palavra não encontrada para remoção: " + palavra);
            }
        }else{
            System.out.println("Set de palavras vazio!");
        }
    }

    public String verificarPalavra(String palavra){
        if(!palavrasUnicas.isEmpty()){
            for(String s : palavrasUnicas){
                if(s == palavra){
                    return "Palavra encontrada: " + s;
                }
            }
        }else{
           return "Não há palavras no set!";
        }
        return "Palavra não encontrada: " + palavra; 
    }

    public void exibirPalavrasUnicas(){
        if(!palavrasUnicas.isEmpty()){
            System.out.println(palavrasUnicas);
        }else{
            System.out.println("Não há palavras no set!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("abacaxi");
        conjuntoPalavrasUnicas.adicionarPalavra("bicicleta");
        conjuntoPalavrasUnicas.adicionarPalavra("cachorro");
        conjuntoPalavrasUnicas.adicionarPalavra("dinossauro");
        conjuntoPalavrasUnicas.adicionarPalavra("elefante");
        conjuntoPalavrasUnicas.adicionarPalavra("floresta");
        conjuntoPalavrasUnicas.adicionarPalavra("girassol");
        conjuntoPalavrasUnicas.adicionarPalavra("hipopótamo");
        conjuntoPalavrasUnicas.adicionarPalavra("ilha");
        conjuntoPalavrasUnicas.adicionarPalavra("jasmim");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.removerPalavra("girassol");
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("girassol"));
    }
}
