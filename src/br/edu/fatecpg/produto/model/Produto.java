package br.edu.fatecpg.produto.model;
public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public String getNome(){
        return this.nome;
   }

   public void setNome(String nome){
        this.nome = nome;
   }
   public double getPreco(){
    return this.preco;
}

public void setPreco(double preco){
    if(preco > 0){
        this.preco = preco;
    } else {
        System.out.println("Este valor não pode ser cadastrado para esse produto!");
    }
}

public int getQuantidadeEstoque(){
    return this.quantidadeEstoque;
}

public void setQuantidadeEstoque(int quantidadeEstoque) {
    if(quantidadeEstoque >= 0){
    this.quantidadeEstoque = quantidadeEstoque; 
 } else {System.out.println("Este valor não pode ser cadastrado para quantidade de estoque!");}
}

}
