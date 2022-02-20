import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Marhlon","Marthin","Mirihã","Manuhela");

        System.out.println("Forma tradicional");
        for (String nome: aprovados) {
            System.out.println(nome);
        }

        System.out.println("#01 lambda");
        aprovados.forEach(nome -> System.out.println(nome));
        System.out.println("Method reference");
        aprovados.forEach(System.out::println);
    }
}
