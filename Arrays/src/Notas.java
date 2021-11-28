import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {

        double media = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o número de elementos do vetor: ");
        int numeroDeNotas = entrada.nextInt();

        double[] notas = new double[numeroDeNotas];

        for (int i = 0; i < numeroDeNotas; i++) {
            System.out.println("Digite a nota do aluno: ");
            notas[i] = entrada.nextDouble();
        }
        for (int i = 0; i < numeroDeNotas; i++) {
             media += notas[i];
        }
        for (int i = 0; i < numeroDeNotas; i++) {
            System.out.println(i+" nota: "+ notas[i]);
        }
        System.out.println("Média: "+ media/numeroDeNotas);
}
}
