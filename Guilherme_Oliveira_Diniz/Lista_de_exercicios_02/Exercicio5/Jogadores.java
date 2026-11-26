package Exercicio5;
public class Jogadores {
    String nome;
    String posicao;

    public Jogadores(String nome, String posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public String getPosicao() {
        return this.posicao;
    }
}
