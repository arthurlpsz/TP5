package br.edu.fatecpg.produto.view;
import br.edu.fatecpg.produto.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Digite o nome do produto para cadastro: ");
        String nome = ler.nextLine();
        produto.setNome(nome);

        System.out.println("Digite o preço do produto para cadastro: ");
        double preco = ler.nextDouble();
        produto.setPreco(preco);

        System.out.println("Digite a quantidade em estoque do produto para cadastro: ");
        int quantidade = ler.nextInt();
        produto.setQuantidadeEstoque(quantidade);
      ler.close();

        System.out.println("O produto cadastrado foi: ");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());

        
    }

}
