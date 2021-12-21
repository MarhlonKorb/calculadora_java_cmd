package DesafioHeranca;

public class Ferrari extends Carro implements Esportivo{

    public Ferrari(){
        this(315);
    }

    public Ferrari (int velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 350;
    }

    public void acelerar() {
        if (velocidadeAtual + 15 > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
        else {
            velocidadeAtual += 15;}
    }

    public void ligarTurbo(){

    }
    public void desligarTurbo(){

    }

    public void freiar(){
        delta -= 15;
    }
}
