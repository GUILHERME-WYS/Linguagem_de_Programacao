public class VinteCinco {
    public static void main(String[] args) {
        String[] alunos = { "Ana", "Carlos", "Mariana", "João", "Pedro" };
        double[] notas = { 8.5, 5.0, 9.0, 3.5, 7.0 };

        for (int i = 0; i < alunos.length; i++) {
            String situacao;

            if (notas[i] >= 6) {
                situacao = "Aprovado";
            } else if (notas[i] >= 4) {
                situacao = "Recuperação";
            } else {
                situacao = "Reprovado";
            }

            System.out.println(alunos[i] + " -> " + situacao);
        }
    }
}
