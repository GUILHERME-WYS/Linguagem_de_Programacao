package Exercicio7;

public class MainExercicio7 {
    public static void main(String[] args) {
        Categoria catPerifericos = new Categoria("Periféricos", "Acessórios para computador");

        Produtos p1 = new Produtos("Mouse Gamer", 150.0, catPerifericos);
        Produtos p2 = new Produtos("Teclado Mecânico", 320.0, catPerifericos);

        Produtos[] itensPedido = { p1, p2 };
        Pedido pedido1 = new Pedido(1001, "25/11/2026", itensPedido);

        Pedido[] listaPedidos = { pedido1 };
        Cliente cliente = new Cliente("Carlos Souza", "carlos@email.com", listaPedidos);

        System.out.println("Cliente: " + cliente.getNome() + " (" + cliente.getEmail() + ")");
        for (Pedido ped : cliente.getPedidos()) {
            System.out.println("Pedido #" + ped.getNumeroPedido() + " - Data: " + ped.getData());
            for (Produtos prod : ped.getProdutos()) {
                System.out.println("- " + prod.getNome() + " | R$ " + prod.getPreco() + " | Categoria: " + prod.getCategoria().getNome());
            }
        }
    }
}
