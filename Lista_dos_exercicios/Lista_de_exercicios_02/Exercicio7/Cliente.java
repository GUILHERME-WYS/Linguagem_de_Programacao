package Exercicio7;

public class Cliente {
    String nome;
    String email;
    Pedido[] pedidos;

    public Cliente(String nome, String email, Pedido[] pedidos) {
        this.nome = nome;
        this.email = email;
        this.pedidos = pedidos;
    }

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return this.nome; }

    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return this.email; }

    public void setPedidos(Pedido[] pedidos) { this.pedidos = pedidos; }
    public Pedido[] getPedidos() { return this.pedidos; }
}
