public class Aluno {
    // Características
    String nome = "";
    String email = "";
    boolean inteligente = false;
    int nivel_sono = 0;
    boolean piscando_lento = false;

    // Método Construtor
    public Aluno(String nome, String email, boolean inteligente, int nivel_sono, boolean piscando_lento) {
        this.nome = nome;
        this.email = email;
        this.inteligente = inteligente;
        this.nivel_sono = nivel_sono;
        this.piscando_lento = piscando_lento;
    }

    //Funções Setters e Getters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }


    public void setInteligente(boolean inteligente) {
        this.inteligente = inteligente;
    }

    public boolean getInteligente() {
        return this.inteligente;
    }


    public void setNivelDeSono(int nivel_sono) {
        this.nivel_sono = nivel_sono;
    }

    public int getNivelDeSono() {
        return this.nivel_sono;
    }


    public void setPiscandoLento(boolean piscando_lento) {
        this.piscando_lento = piscando_lento;
    }

    public boolean getPiscandoLento() {
        return this.piscando_lento;
    }

		//Métodos Personalizados
    public void dormirNaAula() {
        System.out.println("O aluno dorme na aula!");
    }

    public void fingirEstudar(){
        System.out.println("O aluno finge estudar!");
    }




}