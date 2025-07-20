package main.java.list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome){
        List<Item> lista = new ArrayList<>();
        for(Item item : listaItens){
            if(item.getNome().equals(nome)){
                lista.add(item);
            }
        }
        listaItens.removeAll(lista);
    }

    public double calcularValorTotal(){
        double valor = 0;
        for(Item item : this.listaItens) {
            valor += (item.getPreco() * item.getQuantidade());
        }
        return valor;
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("batata", 2, 2);
        carrinhoDeCompras.adicionarItem("cenoura", 3, 1);
        carrinhoDeCompras.adicionarItem("cenoura", 3, 1);
        carrinhoDeCompras.adicionarItem("cenoura", 3, 1);

        carrinhoDeCompras.removerItem("cenoura");

        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());
    }
}
