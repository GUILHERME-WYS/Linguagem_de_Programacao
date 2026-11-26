public class VinteTres {
    public static void main(String[] args) {
        double[] notas = { 7.5, 8.0, 4.5, 6.0, 9.0, 3.5, 5.0, 8.5, 10.0, 6.5 };

        double soma = 0;
        double maior = notas[0];
        double menor = notas[0];
        int aprovados = 0;
        int reprovados = 0;

        for (double nota : notas) {
            soma += nota;

            if (nota > maior) {
                maior = nota;
            }
            if (nota < menor) {
                menor = nota;
            }

            if (nota >= 6) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        double media = soma / notas.length;

        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Quantidade de aprovados: " + aprovados);
        System.out.println("Quantidade de reprovados: " + reprovados);
    }
}
