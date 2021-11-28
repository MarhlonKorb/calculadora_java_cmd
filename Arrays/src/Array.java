import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        double[] array = new double[5];
        Scanner leitor = new Scanner(System.in);

        for (int i= 0; i < array.length; i++){
            array[i]= leitor.nextInt();
        }
        System.out.println(Arrays.toString(array));

        System.out.println("FOREACH ESTRUTURA: ");
        for (double numero:array
             ) {
            System.out.println(numero);
        }

        leitor.close();


    }
}
