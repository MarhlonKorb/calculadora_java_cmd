package Carro;

public class Carro {
    final Motor motor;
    boolean portasFechadas = true;

    Carro(){
        this.motor = new Motor();
    }

    void ligar(){
       motor.ligado = true;
    }

    void desligar(){
        motor.ligado = false;
    }

    void acelerar() {
        if (motor.fatorInjecao < 2.6) {
            motor.fatorInjecao += 0.4;
            desacelerar();
        }
    }

    void desacelerar(){
        if (!portasFechadas){
            freiar();
        }
    }

    void freiar(){
        if(motor.fatorInjecao > 2.6 ){
            motor.fatorInjecao -= 0.4;
        }
    }

    boolean estaLigado(){
        return motor.ligado;
    }


}

