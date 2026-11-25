public class Dez {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.println("Soma dos pares entre 1 e 100: " + soma);
    }
}
