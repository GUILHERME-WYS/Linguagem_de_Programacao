package Exercicio5;
public class Membros {
    String nome;
    String cargo;

    public Membros(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getCargo() {
        return this.cargo;
    }
}
