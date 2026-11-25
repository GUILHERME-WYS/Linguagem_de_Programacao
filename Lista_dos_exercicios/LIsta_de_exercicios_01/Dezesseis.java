public class Dezesseis {
    public static void main(String[] args) {
        int[] numeros = { 10, -5, 0, 23, -1, 0, 8, -14, 7, 2 };
        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);
    }
}
