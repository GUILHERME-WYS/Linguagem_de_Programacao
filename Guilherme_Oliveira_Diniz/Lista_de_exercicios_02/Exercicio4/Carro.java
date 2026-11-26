package Exercicio4;
public class Carro {
    String marca;
    String modelo;
    Motor motor;
    Acessorios[] acessorios;

    public Carro(String marca, String modelo, Motor motor, Acessorios[] acessorios) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.acessorios = acessorios;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return this.modelo;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public Motor getMotor() {
        return this.motor;
    }

    public void setAcessorios(Acessorios[] acessorios) {
        this.acessorios = acessorios;
    }
    public Acessorios[] getAcessorios() {
        return this.acessorios;
    }
}
