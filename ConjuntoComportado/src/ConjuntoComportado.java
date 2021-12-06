import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
       SortedSet<String> listaAprovados = new TreeSet<>();//Ordenar lista em ordem alfabética
        listaAprovados.add("Ana");
        listaAprovados.add("Jailton");
        listaAprovados.add("Marcos");

        for (String alunos: listaAprovados
             ) {
            System.out.println(alunos);
        }
    }
}
