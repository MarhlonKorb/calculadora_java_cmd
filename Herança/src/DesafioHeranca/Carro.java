package DesafioHeranca;

public class Carro {
   public final int VELOCIDADE_MAXIMA;
   protected int velocidadeAtual;
   private int delta = 15;

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

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
        if (velocidadeAtual >= getDelta()) {
            velocidadeAtual -= getDelta();
        }
        else {
            velocidadeAtual = 0;
        }
    }

    protected String dadosVelocidade(){
        return "Velocidade atual: "+ velocidadeAtual +"KM/h";
    }
}


