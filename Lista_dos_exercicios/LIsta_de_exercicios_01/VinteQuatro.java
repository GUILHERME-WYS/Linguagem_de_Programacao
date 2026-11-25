public class VinteQuatro {
    public static void main(String[] args) {
        String[] produtos = { "Mouse", "Teclado", "Monitor", "Notebook", "Impressora" };
        int[] estoque = { 10, 1, 0, 5, 2 };

        for (int i = 0; i < produtos.length; i++) {
            if (estoque[i] == 0) {
                System.out.println(produtos[i] + " -> SEM ESTOQUE");
            } else if (estoque[i] == 1) {
                System.out.println(produtos[i] + " -> 1 unidade");
            } else {
                System.out.println(produtos[i] + " -> " + estoque[i] + " unidades");
            }
        }
    }
}
