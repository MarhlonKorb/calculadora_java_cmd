package DesafioHeranca;

public class Carro {
   public final int VELOCIDADE_MAXIMA;
   protected int velocidadeAtual;

   protected Carro(int velocidadeMaxima){
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

   public void acelerar() {
        if (velocidadeAtual + 5 > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
        else {velocidadeAtual += 5;}
    }

    public void freiar() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        }
        else {
            velocidadeAtual = 0;
        }
    }
    protected String dadosVelocidade(){
        return "Velocidade atual: "+velocidadeAtual+"KM/h";
    }
}


