package Exercicio5;
public class EquipeTecnica {
    String nomeEquipe;
    int quantidadeSala;
    Membros[] membros;
    Tecnico tecnico;

    public EquipeTecnica(String nomeEquipe, int quantidadeSala, Membros[] membros, Tecnico tecnico) {
        this.nomeEquipe = nomeEquipe;
        this.quantidadeSala = quantidadeSala;
        this.membros = membros;
        this.tecnico = tecnico;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }
    public String getNomeEquipe() {
        return this.nomeEquipe;
    }

    public void setQuantidadeSala(int quantidadeSala) {
        this.quantidadeSala = quantidadeSala;
    }
    public int getQuantidadeSala() {
        return this.quantidadeSala;
    }

    public void setMembros(Membros[] membros) {
        this.membros = membros;
    }
    public Membros[] getMembros() {
        return this.membros;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    public Tecnico getTecnico() {
        return this.tecnico;
    }
}
