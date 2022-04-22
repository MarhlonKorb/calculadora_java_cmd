import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8);

      System.out.println("Binário");
        nums.stream()
            .map(Integer::toBinaryString)
            .forEach(System.out::println);

        System.out.println("\nPrimeira string invertida");

        UnaryOperator<String> inverter =
                s -> new StringBuilder(s).reverse().toString();

        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .forEach(System.out::println);

        Function<String, Integer> binarioParaInt =
                s -> Integer.parseInt(s, 2);

        System.out.println("\nDe binário para inteiro: ");
        nums.stream()
                .map(Integer::toBinaryString)
                .map(binarioParaInt)
                .forEach(System.out::println);
    }
}
