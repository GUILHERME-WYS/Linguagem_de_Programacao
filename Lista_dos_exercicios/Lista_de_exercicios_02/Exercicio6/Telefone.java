package Exercicio6;

public class Telefone {
    String ddd;
    String numero;

    public Telefone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public void setDdd(String ddd) { this.ddd = ddd; }
    public String getDdd() { return this.ddd; }

    public void setNumero(String numero) { this.numero = numero; }
    public String getNumero() { return this.numero; }
}
