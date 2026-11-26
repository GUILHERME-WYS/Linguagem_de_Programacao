package Exercicio4;
public class Acessorios {
    String nome;
    double preco;

    public Acessorios(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getPreco() {
        return this.preco;
    }
}
