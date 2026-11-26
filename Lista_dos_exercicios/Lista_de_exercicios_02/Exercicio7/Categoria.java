package Exercicio7;

public class Categoria {
    String nome;
    String descricao;

    public Categoria(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return this.nome; }

    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getDescricao() { return this.descricao; }
}
