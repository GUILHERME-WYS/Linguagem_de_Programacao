public class Personagem {
    String nome = "";
    int vida = 0;
    Tipo[] tipo;
    Poder[] poder;

    // Construtor
    public Personagem(String nome, int vida, Tipo[] tipo, Poder[] poder) {
        this.nome = nome;
        this.vida = vida;
        this.tipo = tipo;
        this.poder = poder;
    }

    // Getters e Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getVida() {
        return this.vida;
    }

    public void setTipo(Tipo[] tipo) {
        this.tipo = tipo;
    }
    public Tipo[] getTipo() {
        return this.tipo;
    }

    public void setPoder(Poder[] poder) {
        this.poder = poder;
    }
    public Poder[] getPoder() {
        return this.poder;
    }
}