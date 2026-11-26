package Exercicio4;
public class MainExercicio4 {
    public static void main(String[] args) {
        Motor motor = new Motor("1.0 Turbo", 128);
        Acessorios[] listaAcessorios = {
            new Acessorios("Multimídia", 1500.0),
            new Acessorios("Rodas de Liga Leve", 2800.0)
        };

        Carro carro = new Carro("Honda", "Civic", motor, listaAcessorios);

        System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo());
        System.out.println("Motor: " + carro.getMotor().getTipo() + " (" + carro.getMotor().getPotencia() + " cv)");
        System.out.println("Acessórios:");
        for (Acessorios ac : carro.getAcessorios()) {
            System.out.println("- " + ac.getNome() + " | R$ " + ac.getPreco());
        }
    }
}
