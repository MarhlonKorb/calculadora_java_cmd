import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> Lista = new ArrayList<>();
        System.out.println(Lista.add("Marhlon"));
        System.out.println(Lista.add("Judas"));
        System.out.println(Lista.add("Marcelino"));
        System.out.println(Lista.add("Zafarias"));
        System.out.println(Lista);

        System.out.println("\nSegundo teste: ");
        System.out.println(Lista.size());
        System.out.println(Lista.contains(2));
        System.out.println(Lista.get(3));
        System.out.println(Lista.remove(1));
        System.out.println(Lista);
    }
}
