
public class Main {
    public static void main(String [] args){
        Veiculo carro_1 = new Veiculo("Fiat", "Uno");
        Veiculo carro_2 = new Veiculo("BYD", "Compact 2026");
        Veiculo carro_3 = new Veiculo("Honda", "Civic");
        Veiculo carro_4 = new Veiculo("Gurgel", "Gurgel 1960");

        // System.out.println( "\n A marca do carro 1 eh: " + carro_1.marca + " e o modelo eh " + carro_1.modelo);
        // System.out.println( " A marca do carro 2 eh: " + carro_2.marca + " e o modelo eh " + carro_2.modelo);
        // System.out.println( " A marca do carro 3 eh: " + carro_3.marca + " e o modelo eh " + carro_3.modelo);
        // System.out.println( " A marca do carro 4 eh: " + carro_4.marca + " e o modelo eh " + carro_4.modelo + "\n");

        Veiculo [] estacionamento =  {carro_1, carro_2, carro_3, carro_4};

        for(Veiculo item: estacionamento){
            System.out.println("Marcas: " + item.marca);
            System.out.println("modelo: " + item.modelo);

        }
    }
}
