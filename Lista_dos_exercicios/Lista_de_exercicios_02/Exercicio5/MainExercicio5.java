package Exercicio5;
public class MainExercicio5 {
    public static void main(String[] args) {
        Jogadores[] listaJogadores = {
            new Jogadores("Carlos", "Goleiro"),
            new Jogadores("Rafael", "Atacante")
        };

        Membros[] listaMembros = {
            new Membros("Lucas", "Preparador Físico"),
            new Membros("André", "Fisioterapeuta")
        };

        Tecnico tecnico = new Tecnico("Abel", 12);
        EquipeTecnica equipe = new EquipeTecnica("Comissão Principal", 2, listaMembros, tecnico);
        Time time = new Time("Fatec FC", "Tatuí", listaJogadores, equipe);

        System.out.println("Time: " + time.getNome() + " (" + time.getCidade() + ")");
        System.out.println("Técnico: " + time.getEquipeTecnica().getTecnico().getNome());

        System.out.println("Membros da Equipe Técnica:");
        for (Membros m : time.getEquipeTecnica().getMembros()) {
            System.out.println("- " + m.getNome() + " (" + m.getCargo() + ")");
        }

        System.out.println("Jogadores:");
        for (Jogadores j : time.getJogadores()) {
            System.out.println("- " + j.getNome() + " | Posição: " + j.getPosicao());
        }
    }
}
