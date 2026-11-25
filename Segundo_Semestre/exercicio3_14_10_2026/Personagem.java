package exercicio3_14_10_2026;

public class Personagem {
    String nome;
    int vida = 0;
    
    //Tipo[] tipo
    List <Tipo> tipo;
    List <Poder> poder;

    public Personagem(String nome, int vida, String tipo, String poder){
        this.nome = nome;
        this.vida = vida;
        Tipo tipo1 = net Tipo (tipo);
        this.tipo.add(tipo1);
        Poder poder1 = new Poder(poder);
        this.poder.add(poder1);

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Static getNome(){
        return this.nome;
    }

    public void setVida9int (int vida){
        this.vida = vida;
    }

    public Static getVida(){
        return this.vida;
    }

    public static void main(String[] args){
        Personagem person_1 = new Personagem("Ben 10", 100,"Mutante", "Transformar");
        Personagem person_2 = new Personagem("Batman", 2,"Cavaleiro", "Dinheiro");

        List<Personagem> personagens;
        personagens.add(
        new Personagem( "Ben 10", 100,"Mutante", "Transformar");
        new Personagem("Batman", 2,"Cavaleiro", "Dinheiro");
        );

    }
}

