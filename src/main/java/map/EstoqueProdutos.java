package main.java.map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoque;

    public EstoqueProdutos() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco){
        Produto produto = new Produto(nome, quantidade, (float) preco);
        estoque.put(cod, produto);
    }

    public void exibirProdutos(){
        System.out.println(estoque);
    }

    public float calcularValorTotalEstoque(){
        float valorTotalEstoque = 0;
        if(!estoque.isEmpty()){
            for(Produto p : estoque.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoque.isEmpty()) {
            for (Produto p : estoque.values()) {
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoqueProdutos.adicionarProduto(2L, "Produto A", 5, 10.0);
        estoqueProdutos.adicionarProduto(3L, "Produto A", 2, 15.0);
        estoqueProdutos.adicionarProduto(8L, "Produto A", 2, 20.0);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total de estoque: R$" + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Double.MIN_VALUE: " + Double.MIN_VALUE);
    }
}
