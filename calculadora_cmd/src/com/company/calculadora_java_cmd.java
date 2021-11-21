package com.company;
import java.util.Scanner;

public class calculadora_java_cmd {
        public static void main(String[] args) {

            int a,b;

            Scanner scan  = new Scanner(System.in);
            System.out.println("Digite o primeiro número: ");
            a = scan.nextInt();

            System.out.println("Digite o primeiro número: ");
            b = scan.nextInt();

            int soma = soma (a , b);
            int subtracao = subtracao( a , b);
            int multiplicacao = multiplicacao (a , b);
            int divisao = divisao( a , b);

            System.out.println("A soma dos números "+a+" e "+b+" é "+soma);
            System.out.println("A subtração dos números "+a+" e "+b+" é "+subtracao);
            System.out.println("A multiplicação dos números "+a+" e "+b+" é "+multiplicacao);
            System.out.println("A divisão dos números "+a+" e "+b+" é "+divisao);

            scan.close();
        }

        public static int soma (int a, int b) {
            return a + b;
        }

        public static int subtracao (int a, int b) {
            return a - b;
        }

        public static int multiplicacao (int a, int b) {
            return a * b;
        }

        public static int divisao (int a, int b) {
            return a / b;
        }
    }

