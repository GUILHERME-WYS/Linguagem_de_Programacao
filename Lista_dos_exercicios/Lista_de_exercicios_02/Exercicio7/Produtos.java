package Exercicio7;

public class Produtos {
    String nome;
    double preco;
    Categoria categoria;

    public Produtos(String nome, double preco, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return this.nome; }

    public void setPreco(double preco) { this.preco = preco; }
    public double getPreco() { return this.preco; }

    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
    public Categoria getCategoria() { return this.categoria; }
}
    