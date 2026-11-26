package Exercicio3;
public class MainExercicio3 {
    public static void main(String[] args) {
        Linguagem[] linguagens = { new Linguagem("Java"), new Linguagem("Python") };
        SistemaOperacional[] sistemas = { new SistemaOperacional("Windows"), new SistemaOperacional("Linux") };

        Programador dev = new Programador(linguagens, 95, sistemas);

        System.out.println("Nível de cafeína: " + dev.getNivelCafeina() + "%");
        System.out.println("Linguagens:");
        for (Linguagem l : dev.getLinguagem()) {
            System.out.println("- " + l.getNome());
        }
        System.out.println("Sistemas Operacionais:");
        for (SistemaOperacional so : dev.getSistemaOperacional()) {
            System.out.println("- " + so.getNome());
        }
    }
}
