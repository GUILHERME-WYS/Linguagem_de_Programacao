public class Main {

    public static void main(String[] args){
        Moto carro = new Moto();

        carro.marca = "Suzuki";
        carro.modelo = " Katana";
        carro.combustivel = 7;
        carro.cor = "BLACK";
        carro.ano = 2023;

        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.combustivel);
        System.out.println(carro.cor);
        System.out.println(carro.ano);
        System.out.println("Moto ligada");
        System.out.println("bibip");
        System.out.println("Moto desligada");
        System.out.println("boomm");
    }
}