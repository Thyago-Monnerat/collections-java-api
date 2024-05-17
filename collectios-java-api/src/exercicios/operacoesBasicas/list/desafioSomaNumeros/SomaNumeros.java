package exercicios.operacoesBasicas.list.desafioSomaNumeros;
import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {
    private List<Integer> listaNumeros;

    public SomaNumeros(){
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if(!listaNumeros.isEmpty()){
            for(Integer i : listaNumeros){
                soma += i;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        if(!listaNumeros.isEmpty()){
            for(Integer i : listaNumeros){
                if(i > maiorNumero){
                    maiorNumero = i;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = encontrarMaiorNumero();
        if(!listaNumeros.isEmpty()){
            for(Integer i : listaNumeros){
                if(i < menorNumero){
                    menorNumero = i;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        if(!listaNumeros.isEmpty()){
            System.out.println(listaNumeros);
        }
    }

    public static void main(String[] args) {
        SomaNumeros listNumeros = new SomaNumeros();

        listNumeros.adicionarNumero(46);
        listNumeros.adicionarNumero(81);
        listNumeros.adicionarNumero(7);
        listNumeros.adicionarNumero(22);
        listNumeros.adicionarNumero(58);
        listNumeros.adicionarNumero(15);
        listNumeros.adicionarNumero(105);
        listNumeros.adicionarNumero(34);
        listNumeros.adicionarNumero(92);
        listNumeros.adicionarNumero(69);
    
        System.out.println(listNumeros.calcularSoma());
        System.out.println(listNumeros.encontrarMaiorNumero());
        System.out.println(listNumeros.encontrarMenorNumero());

        listNumeros.exibirNumeros();
    }
}