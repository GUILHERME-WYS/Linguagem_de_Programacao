import java.util.Random;

public class Quatro {
    public static void main(String[] args) {
        // 1. Gerador de números aleatórios
        Random aleatorio = new Random();

        // Sorteia 3 números inteiros entre 0 e 99
        int num1 = aleatorio.nextInt(100);
        int num2 = aleatorio.nextInt(100);
        int num3 = aleatorio.nextInt(100);

        System.out.println("Números sorteados: " + num1 + ", " + num2 + " e " + num3);

        // 2. Comparação usando operadores relacionais (>=) e lógicos (&&)
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("O maior número é: " + num3);
        }
    }
}
