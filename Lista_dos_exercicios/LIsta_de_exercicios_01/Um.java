public class Um {
    public static void main(String[] args) {
        // 1. Declaração das duas variáveis inteiras
        int numero1 = 15;
        int numero2 = 28;

        // 2. Estrutura condicional para comparar os valores
        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Os dois números são iguais: " + numero1);
        }
    }
}
