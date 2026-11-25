public class Main {
    static void analisar(String nome, int nota) {
        if (nota >= 7)
            System.out.println("O aluno(a) " + nome + " esta aprovado com a nota: " + nota);
        else
            System.out.println("O aluno(a) " + nome + " esta reprovado com a nota: " + nota);
    }

    // Corrigido: era "Sting[]", mudamos para "String[]"
    public static void main(String[] args) {
        analisar("Seleide", 8);
    }
}
