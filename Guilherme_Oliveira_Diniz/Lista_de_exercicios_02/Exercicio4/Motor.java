package Exercicio4;
public class Motor {
    String tipo;
    int potencia;

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return this.tipo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public int getPotencia() {
        return this.potencia;
    }
}
