package com.company;

import java.util.Scanner;

public class temperatura_conversor{

    public static void main(String[] args) {
        double temperatura;
        final double fahrenheit;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a temperatura em ºC: ");
        temperatura = leitor.nextDouble();
        fahrenheit = (temperatura * 1.8) + 32;

        System.out.println("Graus ºF: "+fahrenheit);

        leitor.close();
    }
}

