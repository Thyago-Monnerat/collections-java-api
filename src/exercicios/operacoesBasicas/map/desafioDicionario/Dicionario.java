package exercicios.operacoesBasicas.map.desafioDicionario;
import java.util.HashMap;
import java.util.Map;
public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario(){
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionario.isEmpty()){
            dicionario.remove(palavra);
            System.out.println("Palavra removida: " + palavra);
        }else{
            System.out.println("Lista vazia.");
        }
    }

    public Map<String, String> exibirPalavras(){
        return dicionario;
    }

    public String pesquisarPorPalavra(String palavra){
        String palavraDefinicao = null;
        if(!dicionario.isEmpty()){
            palavraDefinicao = dicionario.get(palavra);
        }
        return "A definição de " + palavra + " é: " + palavraDefinicao;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Aberração", "Desvio ou afastamento do que é considerado normal.");
        dicionario.adicionarPalavra("Benevolente", "Que tem ou manifesta boa vontade em relação a outras pessoas.");
        dicionario.adicionarPalavra("Cauteloso", "Que age com precaução e prudência.");
        dicionario.adicionarPalavra("Diligente", "Que executa suas tarefas com zelo e eficiência.");
        dicionario.adicionarPalavra("Efêmero", "Que tem curta duração, passageiro.");
        dicionario.adicionarPalavra("Fidedigno", "Que é digno de fé, confiável.");
        dicionario.adicionarPalavra("Genuíno", "Que é verdadeiro, autêntico.");
        dicionario.adicionarPalavra("Hedonismo", "Doutrina que considera o prazer como o principal bem da vida.");
        dicionario.adicionarPalavra("Idiossincrasia", "Traço de comportamento peculiar a um indivíduo ou a um grupo.");
        dicionario.adicionarPalavra("Jubiloso", "Que sente ou demonstra alegria intensa.");
        /**Repetido para demonstrar que o método put() sobrescreve um elemento */
        dicionario.adicionarPalavra("Jubiloso", "Que sente ou demonstra alegria intensa.");

        System.out.println(dicionario.exibirPalavras());
        System.out.println(dicionario.pesquisarPorPalavra("Aberração"));
        dicionario.removerPalavra("Cauteloso");
    }
}
