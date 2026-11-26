public class MainPersonagem {
    public static void main(String[] args) {
        // Criando instâncias de Tipo e Poder
        Tipo tipo1 = new Tipo("Mutante");
        Tipo tipo2 = new Tipo("Herói");
        Poder poder1 = new Poder("Soltar fogo");
        Poder poder2 = new Poder("Congelar");

        // Montando os arrays conforme o diagrama UML
        Tipo[] tiposBen = { tipo1, tipo2 };
        Poder[] poderesBen = { poder1, poder2 };

        // Criando instância de Personagem
        Personagem personagem1 = new Personagem("Ben 10", 100, tiposBen, poderesBen);

        // Exibindo os dados na tela
        System.out.println("Personagem: " + personagem1.getNome());
        System.out.println("Vida: " + personagem1.getVida());

        System.out.println("Tipos:");
        for (Tipo t : personagem1.getTipo()) {
            System.out.println("- " + t.getNome());
        }

        System.out.println("Poderes:");
        for (Poder p : personagem1.getPoder()) {
            System.out.println("- " + p.getDescricao());
        }
    }
}
