package Exercicio6;

public class Email {
    String enderecoEmail;
    String tipo;

    public Email(String enderecoEmail, String tipo) {
        this.enderecoEmail = enderecoEmail;
        this.tipo = tipo;
    }

    public void setEnderecoEmail(String enderecoEmail) { this.enderecoEmail = enderecoEmail; }
    public String getEnderecoEmail() { return this.enderecoEmail; }

    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getTipo() { return this.tipo; }
}
