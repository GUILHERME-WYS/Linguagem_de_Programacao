public class VinteDois {
    public static void main(String[] args) {
        int[] numeros = { 15, 8, 32, 4, 19, 27, 11 };

        int maior = numeros[0];
        int menor = numeros[0];

        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
