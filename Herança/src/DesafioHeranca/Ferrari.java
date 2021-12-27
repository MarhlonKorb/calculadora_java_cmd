package DesafioHeranca;

public class Ferrari extends Carro implements Esportivo, Luxo{

    public Ferrari(){
        this(315);
    }

    private boolean ligarTurbo = false;
    private boolean ligarAr = false;

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

    @Override
    public int getDelta() {
        if(ligarTurbo && !ligarAr){
            return 35;
        }
        else if(ligarTurbo && ligarAr){
            return 30;
        }
        else if(!ligarTurbo && !ligarAr){
            return 20;
        }
        else { return 15;}
    }
}
