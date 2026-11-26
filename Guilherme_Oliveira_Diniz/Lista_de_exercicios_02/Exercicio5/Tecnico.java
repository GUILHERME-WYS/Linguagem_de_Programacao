package Exercicio5;
public class Tecnico {
    String nome;
    int experienciaAnos;

    public Tecnico(String nome, int experienciaAnos) {
        this.nome = nome;
        this.experienciaAnos = experienciaAnos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setExperienciaAnos(int experienciaAnos) {
        this.experienciaAnos = experienciaAnos;
    }
    public int getExperienciaAnos() {
        return this.experienciaAnos;
    }
}
