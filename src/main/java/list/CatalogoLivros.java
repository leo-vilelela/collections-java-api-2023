package main.java.list;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        this.livros.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livros.isEmpty()){
            for(Livro l : livros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosNoIntervalo = new ArrayList<>();
        if (!livros.isEmpty()){
            for (Livro l : livros){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosNoIntervalo.add(l);
                }
            }
        }
        return livrosNoIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroEncontrado = null;
        if (!livros.isEmpty()){
            for (Livro l : livros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroEncontrado = l;
                    break;
                }
            }
        }
        return livroEncontrado;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("livro 1", "autor 1", 2021);
        catalogo.adicionarLivro("livro 1", "autor 2", 2020);
        catalogo.adicionarLivro("livro 2", "autor 2", 2022);
        catalogo.adicionarLivro("livro 3", "autor 3", 2023);
        catalogo.adicionarLivro("livro 4", "autor 4", 1994);

        System.out.println(catalogo.pesquisarPorAutor("autor 2"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2020, 2021));
        System.out.println(catalogo.pesquisarPorTitulo("livro 1"));

    }
}
