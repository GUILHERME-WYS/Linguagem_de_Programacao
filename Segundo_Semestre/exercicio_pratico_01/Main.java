public class Main{
    static void analisar ( int num) {
        if (num > 0) 
            System.out.println("Eh maior que zero");
        if (num < 0) 
            System.out.println("Eh menor que zero");
        if (num == 0) 
            System.out.println("O numero é igual a zero");
    }
        
        public static void main(String[] args) {
            analisar(5);
        }
}