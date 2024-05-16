package exercicios.operacoesBasicas.desafioCarrinhoCompra;
import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompra {
    private List<Item> carrinho;

    public CarrinhoDeCompra(){
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        if(carrinho.size() > 0){
            List<Item> itensExclusos = new ArrayList<>();
            for(Item i : carrinho){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itensExclusos.add(i);
                }
            }
            carrinho.removeAll(itensExclusos);
        }else{
            System.out.println("Não há item no carrinho!");
        }
    }

    public void calcularValorTotal(){
        double valor = 0;
        if(carrinho.size() > 0){
            for(Item i : carrinho){
                valor += i.getPreco() * i.getQuantidade();    
            }
            System.out.println("Valor total no carrinho: " + valor);
        }else{
            System.out.println("Não há item no carrinho!");
        }
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        carrinho.adicionarItem("Pera", 1.50, 3);
        carrinho.adicionarItem("Shampoo", 13.47, 4);
        carrinho.adicionarItem("Vassoura", 10.53, 2);

        carrinho.exibirItens();

        carrinho.calcularValorTotal();

        carrinho.removerItem("Pera");

        carrinho.exibirItens();

        carrinho.calcularValorTotal();
    }

}
