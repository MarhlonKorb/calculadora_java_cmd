package DesafioHeranca;

public class Carro {
    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;

   public Carro(int velocidadeMaxima){
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar() {
        if (velocidadeAtual + 5 > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
        else {velocidadeAtual += 5;}
    }

    void freiar() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        }
        else {
            velocidadeAtual = 0;
        }
    }
    public String toString(){
        return "Velocidade atual: "+velocidadeAtual+"KM/h";
    }
}


