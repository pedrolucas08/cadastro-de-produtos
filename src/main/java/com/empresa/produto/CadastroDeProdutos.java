package main.java.com.empresa.produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CadastroDeProdutos {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto ...produtos) {
        this.produtos.addAll(Arrays.asList(produtos));
    }

    public void listarProdutos() {
        for(Produto produto: produtos) {
            System.out.println("Id: " + produto.getId());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade em estoque: " + produto.getQuantidadeEmEstoque());
            System.out.println("-------------------------------------");
        }
    }
}
