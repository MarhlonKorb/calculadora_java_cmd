package DesafioHeranca;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro(300);
        Ferrari ferrari = new Ferrari();
        Civic civic = new Civic();

        System.out.println(ferrari.getDelta());
        ferrari.acelerar();
        System.out.println(ferrari.getDelta());
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        System.out.println(ferrari.getDelta());
        ferrari.freiar();
        ferrari.freiar();
        
        System.out.println(ferrari.dadosVelocidade());
    }
}
