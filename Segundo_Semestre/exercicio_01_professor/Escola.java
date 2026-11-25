public class Escola {
    public static void main(String[] args) {
        Aluno aluno_1 = new Aluno("João", "d@hotmail.com", true, 10, true);
        Aluno aluno_2 = new Aluno("Maria", "m@hotmail.com", true, 10, true);
        
        Professor professor_1 = new Professor("Diogo", 0, "Feliz", "Baixo", false, "Penso logo existo");
        Professor professor_2 = new Professor("Marquito", 2, "Triste", "Baixo", false, "Penso logo existo");

        Aluno[] alunos = { aluno_1, aluno_2 };
        Professor[] professores = { professor_1, professor_2 };

        for(Aluno estudante: alunos) {
            System.out.println("Aluno: " + estudante.getNome());
            System.out.println("E-mail: " + estudante.getEmail());
            System.out.println("Inteligente: " + estudante.getInteligente());
            System.out.println("Nível de Sono: " + estudante.getNivelDeSono());
            System.out.println("Piscando Lento: " + estudante.getPiscandoLento);
            estudante.dormirNaAula();
            estudante.fingirEstudar();
        }

        for(Professor prof: professores) {
            System.out.println("Professor: " + prof.getNome());
            System.out.println("Quantidade de Café: " + prof.getQuantidadeCafe());
            System.out.println("Humor: " + prof.getHumor());
            System.out.println("Nível de Paciência: " + prof.getNivelDeSono());
            System.out.println("Usa data show: " + prof.getUsaDataShow());
            System.out.println("Frase Favorita do Professor: " + prof.getFraseFavorita());
        }
    }
}