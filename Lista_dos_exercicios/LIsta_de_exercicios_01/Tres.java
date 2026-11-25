public class Tres {
    public static void main(String[] args) {
        // 1. Variável nota usando double (permite casas decimais como 5.9)
        double nota = 5.5;

        // 2. Estrutura condicional encadeada
        if (nota >= 6) {
            System.out.println("Aprovado");
        } else if (nota >= 4 && nota < 6) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
