package Exercicio7;

public class Pedido {
    int numeroPedido;
    String data;
    Produtos[] produtos;

    public Pedido(int numeroPedido, String data, Produtos[] produtos) {
        this.numeroPedido = numeroPedido;
        this.data = data;
        this.produtos = produtos;
    }

    public void setNumeroPedido(int numeroPedido) { this.numeroPedido = numeroPedido; }
    public int getNumeroPedido() { return this.numeroPedido; }

    public void setData(String data) { this.data = data; }
    public String getData() { return this.data; }

    public void setProdutos(Produtos[] produtos) { this.produtos = produtos; }
    public Produtos[] getProdutos() { return this.produtos; }
}
