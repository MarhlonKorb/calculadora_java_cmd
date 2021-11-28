
import java.util.Scanner;

import static java.util.Locale.setDefault;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        double somaNotas = 0.0;
        double nota = 0.0;
        int invalidas=0;
        int quantidadeNotas = 0;

        while ( nota!= -1.0){
            System.out.println("Digite uma nota entre 0 e 10");
            nota = entrada.nextDouble();
        if (nota > 0.0 && nota < 10.0){
            somaNotas += nota;
            quantidadeNotas++;}
        else if(nota != -1.0){invalidas++;}
        }

        double mediaNotas = somaNotas/quantidadeNotas;
        System.out.println("Soma das notas: "+somaNotas);
        System.out.println("Notas inválidas: "+invalidas);
        System.out.println("Média das notas: "+mediaNotas);

        entrada.close();
    }
}
