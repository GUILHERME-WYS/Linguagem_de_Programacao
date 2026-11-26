package Exercicio6;

public class MainExercicio6 {
    public static void main(String[] args) {
        Endereco[] ends = { new Endereco("Rua das Flores, 123", "Tatuí") };
        Telefone[] tels = { new Telefone("15", "99999-1111"), new Telefone("15", "98888-2222") };
        Email[] mails = { new Email("ana@gmail.com", "Pessoal") };

        Cliente cliente = new Cliente("Ana Silva", "123.456.789-00", ends, tels, mails);

        System.out.println("Cliente: " + cliente.getNome() + " | CPF: " + cliente.getCpf());
        for (Endereco e : cliente.getEnderecos()) {
            System.out.println("Endereço: " + e.getRua() + " - " + e.getCidade());
        }
        for (Telefone t : cliente.getTelefones()) {
            System.out.println("Telefone: (" + t.getDdd() + ") " + t.getNumero());
        }
        for (Email em : cliente.getEmails()) {
            System.out.println("E-mail (" + em.getTipo() + "): " + em.getEnderecoEmail());
        }
    }
}
