public class Quinze {
    public static void main(String[] args) {
        double[] notas = { 7.5, 8.0, 6.5, 9.0, 5.5 };
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("Média das notas: " + media);
    }
}
