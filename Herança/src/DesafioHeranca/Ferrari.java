package DesafioHeranca;

public class Ferrari extends Carro {

    Ferrari(){
        super(315);
    }

    void acelerar() {
        if (velocidadeAtual + 15 > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
        else {velocidadeAtual += 15;}
    }

    void freiar(){
        velocidadeAtual -= 15;
    }
}
