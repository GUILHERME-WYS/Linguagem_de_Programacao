package Exercicio5;
public class Time {
    String nome;
    String cidade;
    Jogadores[] jogadores;
    EquipeTecnica equipeTecnica;

    public Time(String nome, String cidade, Jogadores[] jogadores, EquipeTecnica equipeTecnica) {
        this.nome = nome;
        this.cidade = cidade;
        this.jogadores = jogadores;
        this.equipeTecnica = equipeTecnica;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCidade() {
        return this.cidade;
    }

    public void setJogadores(Jogadores[] jogadores) {
        this.jogadores = jogadores;
    }
    public Jogadores[] getJogadores() {
        return this.jogadores;
    }

    public void setEquipeTecnica(EquipeTecnica equipeTecnica) {
        this.equipeTecnica = equipeTecnica;
    }
    public EquipeTecnica getEquipeTecnica() {
        return this.equipeTecnica;
    }
}
