public class Doze {
    public static void main(String[] args) {
        int[] numeros = { 5, -2, 10, -8, 3, 0, 7 };
        int positivos = 0;

        for (int num : numeros) {
            if (num > 0) {
                positivos++;
            }
        }

        System.out.println("Quantidade de números positivos: " + positivos);
    }
}
