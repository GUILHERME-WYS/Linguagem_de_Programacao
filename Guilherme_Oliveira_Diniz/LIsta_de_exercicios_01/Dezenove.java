public class Dezenove {
    public static void main(String[] args) {
        double[] precos = {
            10.50,
            25.00,
            100.00,
            45.50,
            8.90
        };

        for (double preco : precos) {
            if (preco > 30) {
                System.out.println(preco);
            }
        }
    }
}
