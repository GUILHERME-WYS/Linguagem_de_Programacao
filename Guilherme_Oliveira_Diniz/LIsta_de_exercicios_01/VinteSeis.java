public class VinteSeis {
    public static void main(String[] args) {
        String[] alunos = { "Ana", "Carlos", "Mariana", "João" };
        double[] notas = { 8.5, 5.0, 9.0, 3.5 };

        double soma = 0;
        double maior = notas[0];
        double menor = notas[0];

        System.out.println("----- RELATÓRIO -----");

        for (int i = 0; i < alunos.length; i++) {
            String situacao;

            if (notas[i] >= 6) {
                situacao = "APROVADO";
            } else if (notas[i] >= 4) {
                situacao = "RECUPERAÇÃO";
            } else {
                situacao = "REPROVADO";
            }

            System.out.println(alunos[i] + "\t" + notas[i] + "\t" + situacao);

            soma += notas[i];
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        double media = soma / notas.length;

        System.out.println();
        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
    }
}
