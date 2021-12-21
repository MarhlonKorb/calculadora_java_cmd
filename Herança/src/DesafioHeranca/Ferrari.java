package DesafioHeranca;

public class Ferrari extends Carro implements Esportivo, Luxo{

    public Ferrari(){
        this(315);
    }

    private boolean ligarTurbo;
    private boolean ligarAr;

    public Ferrari (int velocidadeMaxima){
        super(velocidadeMaxima);
        setDelta(15);
    }

    public void acelerar() {
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
        else {
            velocidadeAtual += getDelta();}
    }

    public void ligarTurbo(){
        ligarTurbo = true;
    }

    public void desligarTurbo(){
        ligarTurbo = false;
    }

    public void ligarAr(){
        ligarAr = true;
    }
    public void desligarAr(){
        ligarAr = false;
    }
}
