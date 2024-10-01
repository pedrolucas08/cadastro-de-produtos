package main.java.com.empresa.produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camisa", 40.0, 100);
        Produto produto2 = new Produto("Calça", 100.0, 145);
        Produto produto3 = new Produto("Calcinha", 10.0, 80);
        Produto produto4 = new Produto("Cueca", 10.0, 40);

        CadastroDeProdutos cadastroSecaoRoupas = new CadastroDeProdutos();

        cadastroSecaoRoupas.adicionarProduto(produto1, produto2, produto3, produto4);
        cadastroSecaoRoupas.listarProdutos();
    }
}