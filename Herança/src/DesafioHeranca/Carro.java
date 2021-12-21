package DesafioHeranca;

public class Carro {
   public final int VELOCIDADE_MAXIMA;
   protected int velocidadeAtual;
   protected int delta = 5;

   protected Carro(int velocidadeMaxima){
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

   public void acelerar() {
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
        else {
            velocidadeAtual += delta;}
    }

    public void freiar() {
        if (velocidadeAtual >= delta) {
            velocidadeAtual -= delta;
        }
        else {
            velocidadeAtual = 0;
        }
    }
    protected String dadosVelocidade(){
        return "Velocidade atual: "+ velocidadeAtual +"KM/h";
    }
}


