package exercicios.operacoesBasicas.desafioOrdenarNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer>{
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    @Override
    public int compareTo(Integer i) {
        if(!listaNumeros.isEmpty()){
            for(Integer inteiro : listaNumeros){
                return Integer.compare(listaNumeros.get(inteiro), i);
            }
        }
        return 0;
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosOrdenadosAsc = new ArrayList<>(listaNumeros);
        Collections.sort(numerosOrdenadosAsc);
        return numerosOrdenadosAsc;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosOrdenadosDesc = new ArrayList<>(listaNumeros);
        Collections.sort(numerosOrdenadosDesc);
        return numerosOrdenadosDesc.reversed();
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(155);
        ordenacaoNumeros.adicionarNumero(15);
        ordenacaoNumeros.adicionarNumero(65);
        ordenacaoNumeros.adicionarNumero(125);
        ordenacaoNumeros.adicionarNumero(85);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
   
}
