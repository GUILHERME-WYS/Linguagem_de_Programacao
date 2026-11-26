package Exercicio6;

public class Cliente {
    String nome;
    String cpf;
    Endereco[] enderecos;
    Telefone[] telefones;
    Email[] emails;

    public Cliente(String nome, String cpf, Endereco[] enderecos, Telefone[] telefones, Email[] emails) {
        this.nome = nome;
        this.cpf = cpf;
        this.enderecos = enderecos;
        this.telefones = telefones;
        this.emails = emails;
    }

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return this.nome; }

    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getCpf() { return this.cpf; }

    public void setEnderecos(Endereco[] enderecos) { this.enderecos = enderecos; }
    public Endereco[] getEnderecos() { return this.enderecos; }

    public void setTelefones(Telefone[] telefones) { this.telefones = telefones; }
    public Telefone[] getTelefones() { return this.telefones; }

    public void setEmails(Email[] emails) { this.emails = emails; }
    public Email[] getEmails() { return this.emails; }
}
