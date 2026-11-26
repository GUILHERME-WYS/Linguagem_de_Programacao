public class Quatorze {
    public static void main(String[] args) {
        int[] numeros = { 15, 8, 32, 4, 19, 27 };
        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior número é: " + maior);
    }
}
