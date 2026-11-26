package Exercicio6;

public class Endereco {
    String rua;
    String cidade;

    public Endereco(String rua, String cidade) {
        this.rua = rua;
        this.cidade = cidade;
    }

    public void setRua(String rua) { this.rua = rua; }
    public String getRua() { return this.rua; }

    public void setCidade(String cidade) { this.cidade = cidade; }
    public String getCidade() { return this.cidade; }
}
